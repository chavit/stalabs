import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Generator {
	public static void main(String[] args) throws IOException {
		try {
			args = new String[2];
			args[0] = "Infix";
			args[1] = "../Infix/src";
			new File(args[1]).mkdir();
			InputStream in = new FileInputStream(new File(args[0].toLowerCase()
					+ ".gM"));
			ANTLRInputStream input = new ANTLRInputStream(in);
			GeneratorLexer lexer = new GeneratorLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			GeneratorParser parser = new GeneratorParser(tokens);
			ParseTree tree = parser.prog(); 
			ParseTreeWalker walker = new ParseTreeWalker();
			GenParserListener parseListener = new GenParserListener(parser,
					args[0], args[1]);
			walker.walk(parseListener, tree);
		
			walker = new ParseTreeWalker();
			GenFilesListener fileListener = new GenFilesListener(parser,
					args[0], args[1]);
			walker.walk(fileListener, tree);
		} catch (IllegalStateException e) {
			System.err.println(e.getMessage());
		}

	}
}
