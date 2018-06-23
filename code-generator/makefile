compile:
	java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	javac -cp ./antlr-3.5.2-complete.jar myCompilerLexer.java myCompilerParser.java myCompiler_test.java register.java
	java -cp ./antlr-3.5.2-complete.jar:. myCompiler_test test1.c > test1.s
	gcc test1.s -o test1.out