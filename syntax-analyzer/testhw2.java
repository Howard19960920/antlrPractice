import org.antlr.runtime.*;

public class testhw2 {
    public static void main(String[] args) throws Exception
    {
        CharStream input = new ANTLRFileStream(args[0]);
        hw2Lexer lexer = new hw2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
	
        hw2Parser parser = new hw2Parser(tokens);
        parser.entryPoint();
    }
}

