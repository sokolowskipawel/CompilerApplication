import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramCompilerApplication {
    public static void main(String[] args) throws IOException {
//        Pattern compile = Pattern.compile("(\\d+)\\s+(\\S+)\\s+(.*)");
//        Matcher matcher = compile.matcher("12 PRINT Hello World");
//        if (matcher.find()){
//            String group0 = matcher.group(0);
//            String group1 = matcher.group(1);
//            String group2 = matcher.group(2);
//            String group3 = matcher.group(3);
//            System.out.println(group1);
//            System.out.println(group2);
//            System.out.println(group3);
//            System.out.println(group0);
//        }

        Loader loader = new Loader();
        loader.readFile("C:\\temp\\instrukcje.txt");
        List<Instruction> instructionList = loader.getInstructions();
        Parser parser = new Parser();
        parser.parsers(instructionList);
    }
}
