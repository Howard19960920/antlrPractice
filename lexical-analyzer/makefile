compile:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myLexer.g
	javac -cp ./antlr-3.5.2-complete.jar testLexer.java myLexer.java
test1:
	java -cp ./antlr-3.5.2-complete.jar:. testLexer testCode1.c
test2:
	java -cp ./antlr-3.5.2-complete.jar:. testLexer testCode2.c
test3:
	java -cp ./antlr-3.5.2-complete.jar:. testLexer testCode3.c
