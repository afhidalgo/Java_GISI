clean:
	rm -rf bin
compile: clean
	find src -name "*.java" | xargs javac -cp bin -d bin
run: compile
	java -cp bin Main
