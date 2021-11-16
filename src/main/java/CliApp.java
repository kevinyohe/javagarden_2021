import org.apache.commons.cli.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CliApp {

    public static void main(String[] args) throws ParseException {
            // create Options object
            Options options = new Options();

// add t option
            options.addOption("t", false, "display current time");
            options.addOption("f", true, "file");
        options.addOption(Option.builder("SIZE").longOpt("block-size")
                .desc("use SIZE-byte blocks")
                .hasArg()
                .build());
            CommandLineParser parser = new DefaultParser();
            CommandLine cmd = parser.parse(options, args);

            if(cmd.hasOption("t")){
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                System.out.println(dtf.format(now));
                System.out.println("The Time is " + dtf.format(now));
                System.out.println(cmd.getOptionValue("f") + "");
            }
            else{
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDateTime now = LocalDateTime.now();
                System.out.println("Today is " + dtf.format(now));
                System.out.println(cmd.getOptionValue("f"));
            }
            System.out.println(cmd.hasOption("f"));
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java -jar CliApp.jar", options);
        System.out.println(cmd.getOptionValue("block-size"));
    }

}
