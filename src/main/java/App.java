import xuning.compare.Comparer;
import org.apache.log4j.PropertyConfigurator;
import xuning.util.TextFile;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        PropertyConfigurator.configure("log4j.properties");

        Comparer c = new Comparer();
        c.sameRangesOutput = true;
        c.DEBUG = true;

        String p = null;
        String s = null;

        if (!args[0].isEmpty()) {
            p = TextFile.getFileContent(args[0]);
        }
        if (!args[1].isEmpty()) {
            s = TextFile.getFileContent(args[1]);
        }

        c.compare(TextFile.splitFrom(p),
                TextFile.splitFrom(s));
    }
}
