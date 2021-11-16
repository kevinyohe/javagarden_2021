import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class CSVTool {
    private static final String SAMPLE_CSV_FILE = "./sample.csv";
    public static void main(String[] args) throws IOException {
        Reader in = new FileReader("target/file.csv");
        CSVParser records;

            try {
                records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(in);

                for(CSVRecord record : records){
                    System.out.println("record.get(\"Last Name\") = " + record.get("Last Name"));
                    System.out.println("record.get(\"First Name\") = " + record.get("First Name"));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        {}
        {}
        {}
            writeData();
    }
    
    public enum Things {
        First_Name, Last_name
    }

    public static void writeData() throws IOException{
        try (
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));

                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        .withHeader("ID", "Name", "Designation", "Company"));
        ) {
            csvPrinter.printRecord("1", "Sundar Pichai", "CEO", "Google");
            csvPrinter.printRecord("2", "Satya Nadella", "CEO", "Microsoft");
            csvPrinter.printRecord("3", "Tim cook", "CEO", "Apple");

            csvPrinter.printRecord(Arrays.asList("4", "Jamie Dimon", "CEO", "JPMorgan Chase Inc"));

            csvPrinter.flush();
        }
    }


}
