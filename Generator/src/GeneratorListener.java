// Generated from /home/vitalii/Generator.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GeneratorListener extends ParseTreeListener {
	void enterProg(GeneratorParser.ProgContext ctx);
	void exitProg(GeneratorParser.ProgContext ctx);

	void enterPrulepart(GeneratorParser.PrulepartContext ctx);
	void exitPrulepart(GeneratorParser.PrulepartContext ctx);

	void enterNterm(GeneratorParser.NtermContext ctx);
	void exitNterm(GeneratorParser.NtermContext ctx);

	void enterLexems(GeneratorParser.LexemsContext ctx);
	void exitLexems(GeneratorParser.LexemsContext ctx);

	void enterPrules(GeneratorParser.PrulesContext ctx);
	void exitPrules(GeneratorParser.PrulesContext ctx);

	void enterLexem(GeneratorParser.LexemContext ctx);
	void exitLexem(GeneratorParser.LexemContext ctx);

	void enterParams(GeneratorParser.ParamsContext ctx);
	void exitParams(GeneratorParser.ParamsContext ctx);

	void enterNterms(GeneratorParser.NtermsContext ctx);
	void exitNterms(GeneratorParser.NtermsContext ctx);

	void enterPrule(GeneratorParser.PruleContext ctx);
	void exitPrule(GeneratorParser.PruleContext ctx);
}