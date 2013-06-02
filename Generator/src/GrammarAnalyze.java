import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GrammarAnalyze {
	private ArrayList<Rule> gr;
	private HashMap<Term, HashSet<String>> first;
	private HashMap<Term, HashSet<String>> follow;

	HashSet<String> strFirst(ArrayList<Term> son, int pos) {
		HashSet<String> res = new HashSet<>();
		if (pos == son.size()) {
			res.add("@eps");
			return res;
		}
		HashSet<String> cur = first.get(son.get(pos));
		if (cur.contains("@eps")) {
			res.addAll(cur);
			res.remove("@eps");
			res.addAll(strFirst(son, pos + 1));
		} else {
			res.addAll(cur);
		}
		return res;
	}

	boolean boolAdd(HashSet<String> map, String s) {
		if (!map.contains(s)) {
			map.add(s);
			return true;
		}
		return false;
	}

	boolean boolAddAll(HashSet<String> map, HashSet<String> add) {
		boolean fl = false;
		for (String s : add) {
			fl |= boolAdd(map, s);
		}
		return fl;
	}

	public void calcFirst() {
		while (true) {
			boolean fl = false;
			for (Rule r : gr) {
				HashSet<String> curMap = first.get(r.root);
				fl |= boolAddAll(curMap, strFirst(r.sons, 0));
			}
			if (!fl) {
				return;
			}
		}
	}

	public void calcFollow() {
		while (true) {
			boolean fl = false;
			for (Rule r : gr) {
				for (int i = 0; i < r.sons.size(); i++) {
					HashSet<String> cur = strFirst(r.sons, i+1);
					cur.remove("@eps");
					fl |= boolAddAll(follow.get(r.sons.get(i)),
							cur);
				}
				for (int i = 0; i < r.sons.size(); i++) {
					if (strFirst(r.sons, i + 1).contains("@eps")) {
						fl |= boolAddAll(follow.get(r.sons.get(i)),
								follow.get(r.root));
					}
				}
			}
			if (!fl) {
				return;
			}
		}
	}

	HashMap<String, Integer> choise = new HashMap<>();

	public GrammarAnalyze(ArrayList<Rule> gr, Term root) {
		first = new HashMap<Term, HashSet<String>>();
		follow = new HashMap<>();
		this.gr = gr;
		for (Rule r : gr) {
			first.put(r.root, new HashSet<String>());
			follow.put(r.root, new HashSet<String>());
			for (Term t : r.sons) {
				first.put(t, new HashSet<String>());
				if (t.name.charAt(0) <= 'Z') {
					first.get(t).add(t.name);
				}
				follow.put(t, new HashSet<String>());
			}
			if (r.sons.size() == 0) {
				first.get(r.root).add("@eps");
			}
		}
		follow.get(root).add("@END");
		calcFirst();
		calcFollow();
		for (int i = 0; i < gr.size(); i++) {
			Rule r = gr.get(i);
			HashSet<String> curTokens = strFirst(r.sons, 0);
			if (curTokens.contains("@eps")) {
				curTokens.remove("@eps");
				curTokens.addAll(follow.get(r.root));
			}
			for (String s : curTokens) {
				String curStr = r.root.name + "$" + s;
				if (choise.containsKey(curStr)) {
					throw new IllegalStateException("Grammar not LL(1)");
				}
				choise.put(curStr, i + 1);
			}
		}
	}

	HashMap<String, Integer> getChoiser() {
		return choise;
	}
}
