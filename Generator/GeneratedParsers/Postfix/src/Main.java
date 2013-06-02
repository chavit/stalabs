import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;

import MyAntLL.Context;
import MyAntLL.ParseTree;

public class Main {
	public static void main(String[] args) throws FileNotFoundException,
			ParseException {
		PostfixLexer in = new PostfixLexer(new FileInputStream(new File(
				"test.txt")));
		PostfixParser p = new PostfixParser(in);
		ParseTree root;
		try {
			root = p.startParse();			
		} catch (ParseException e) {
			System.err.println(e.getMessage());
			return;
		}
		Context ctx = root.getRoot();
		int a = ((PostfixContext.l) ctx).res;
		System.out.println(a);
		System.out.println(root);
	}

}
