fichJar = agenda.jar
compile:clean
	mkdir bin
	find src -name "*.java" | xargs javac -d bin
jar:compile
	jar -cvfm $(fichJar) Manifest.txt -C bin .
clean:
	rm -rf bin
	rm -rf $(fichJar)
	rm -rf doc/javadoc
javadoc:
	find $(SOURCE_DIR) -name "*.java" | xargs javadoc -d doc/javadoc
run:
	java -jar $(fichJar)
completo:jar javadoc run