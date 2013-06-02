import java.util.ArrayList;

public class Rule {
	public Rule(Term root) {
		this.root = root;
		sons = new ArrayList<>();
	}
	Term root;
	ArrayList<Term> sons;
}
