package MyAntLL;
import java.util.ArrayList;


public class ParseTree {
	private Context root;
	private ArrayList<ParseTree> sons = new ArrayList<>();

	public Context getRoot() {
		return root;		
	}
	
	public int getChildCount() {
		return sons.size();
	}
	
	public ParseTree getChild(int pos) {
		return sons.get(pos);
	}
	
	public ParseTree(Context root) {
		this.root = root;
	}

	public void add(ParseTree son) {
		sons.add(son);
	}

	public String toString() {
		StringBuilder res = new StringBuilder("(" + root.getText());
		for (ParseTree s : sons) {
			res.append(s.toString());
		}
		res.append(")");
		return res.toString();
	}
}
