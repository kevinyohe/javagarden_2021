import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNumberReader {
    
    public static void main(String[] args) {
        var count = 0;
        File file = new File("C:\\Users\\kevin\\IdeaProjects\\javagarden2021\\src\\main\\resources\\numbers.txt");
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {
                var number = scanner.nextInt();
                if (number == 0 ) {
                    break;
                } else if (number % 2 == 0){
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");

        }
        System.out.println("count = " + count);
        sum();
    }



    public static void sum() {
        var sum = 0;
        File file = new File("C:\\Users\\kevin\\IdeaProjects\\javagarden2021\\src\\main\\resources\\numbers_sum.txt");
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {
                var number = scanner.nextInt();
                sum += number;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");

        }
        System.out.println("sun = " + sum);
    }
}
