import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;

import MyAntLL.Context;
import MyAntLL.ParseTree;

public class Main {
	public static void main(String[] args) throws FileNotFoundException,
			ParseException {
		InfixLexer in = new InfixLexer(new FileInputStream(new File(
				"test.txt")));
		InfixParser p = new InfixParser(in);
		ParseTree root;
		try {
			root = p.startParse();			
		} catch (ParseException e) {
			System.err.println(e.getMessage());
			return;
		}
		Context ctx = root.getRoot();
		int a = ((InfixContext.e) ctx).res;
		System.out.println(a);
		System.out.println(root);
	}

}
