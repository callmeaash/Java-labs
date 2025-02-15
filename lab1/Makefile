# Makefile for Java project

# Compiler
JAVAC = javac
JAVA = java

# Rule to compile and run a given Java file
%: %.java
	$(JAVAC) $<
	$(JAVA) $@

# Rule to clean up compiled class files
clean:
	rm -f *.class

