public class Instruction {

    private Long lineNumber;
    private String name;
    private String arguments;

    public Instruction(Long lineNumber, String name, String arguments) {
        this.lineNumber = lineNumber;
        this.name = name;
        this.arguments = arguments;
    }

    public Long getLineNumber() {
        return lineNumber;
    }

    public String getName() {
        return name;
    }

    public String getArguments() {
        return arguments;
    }

    public String toString() {
        return lineNumber + " : " + name + " : " + arguments;
    }

}
