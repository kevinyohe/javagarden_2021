import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CSVTool {

    public static void main(String[] args) throws FileNotFoundException {
        Reader in = new FileReader("target/file.csv");
        CSVParser records;

        {
            try {
                records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(in);

                for(CSVRecord record : records){
                    System.out.println("record.get(\"Last Name\") = " + record.get("Last Name"));
                    System.out.println("record.get(\"First Name\") = " + record.get("First Name"));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




}
