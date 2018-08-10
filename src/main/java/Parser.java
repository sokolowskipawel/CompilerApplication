import java.util.List;

public class Parser {

    public void parsers(List<Instruction> instructionList) {
        for (Instruction instruction : instructionList) {
            if (instruction.getName().equals("PRINT"))
                print(instruction);
        }
    }

    private void print(Instruction instruction) {
        System.out.println(instruction.getArguments());
    }
}
