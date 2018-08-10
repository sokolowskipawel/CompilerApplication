import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {

    private List<Instruction> instructions;

    public Loader() {
        this.instructions = new ArrayList<Instruction>();
    }


    public void readFile(String filePath) throws IOException {
        File dataFile = new File(filePath);
        BufferedReader fileReader = new BufferedReader((new FileReader(dataFile)));
        String line = "";
        Pattern compile = Pattern.compile("(\\d+)\\s+(\\S+)\\s+(.*)");

        while ((line = fileReader.readLine()) != null) {
            Matcher matcher = compile.matcher(line);
            if (matcher.find()) {
                Long lineNumber = Long.parseLong(matcher.group(1));
                String name = matcher.group(2);
                String arguments = matcher.group(3);
                instructions.add(new Instruction(lineNumber, name, arguments));
            }
        }
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }
}
