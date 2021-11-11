import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;
}
public class BoxDemo {
//Java complete reference page 118 - 120
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.width = 110;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Volume is " + vol);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter student id: ");
        String id1 = scan.nextLine();
        System.out.println("id is " + id1);
        System.out.printf(Integer.MAX_VALUE + "");

    }

}
