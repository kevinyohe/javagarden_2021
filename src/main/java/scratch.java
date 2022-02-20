import java.util.Arrays;
import java.util.Scanner;

public class scratch {

    public static void main(String[] args)
    {
        System.out.println("Hi!"  );
        System.out.println("I'm a Java program.");

        //which returns 12?
//        System.out.println(24 % 2);
//        System.out.println(25 / 2);
//        System.out.println(24 / 2);
//        System.out.println(12 % 13);
//


        boolean b1 = true;
        boolean b2 = false;

//boolean fun
//        System.out.println(b1 || b2);
//        System.out.println(b1 && b2);
//        System.out.println(!b1 && b2);
//        System.out.println(b1 ^ b2);

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            if (i < 3) {
//                continue;
//            } else {
//                for (int j = 0; j < 5; j++) {
//                    System.out.println(j);
//                }
//            }
//        }

//    char c = '1' + '3';
//
//        int i = 0;
//        for (int k = 0; k < 100; k++) {
//            i = i++;
//        }
//        System.out.println(i);



//        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//        int n = 6;
//        n = arr[arr[n]];
//        System.out.println("n = " + n);
//
//        int numbers[] = { 1, 2, 3, 4, 5 };
//
//        Arrays.fill(numbers, 1, 5, 10);
//
//        System.out.println(Arrays.toString(numbers));
//        char[] array = new char[0];
//        array.toString();
//        System.out.println("array.length = " + array.length);

        var str = new String("Hello!");
        var ss  =str.substring(0,5);
        System.out.println("ss = " + ss);
        System.out.println(str.charAt(5));
        final Scanner scanner = new Scanner(System.in); // 1
        final int a;                                    // 2
//        final int b = scanner.nextInt() + a;            // 3
        final int c = 0;                                // 4
//        c = b;                                          // 5
        System.out.println(c + 1);
        checkTheCode("");

        String str1;
        String str2 = "123";

        if (str2.equals(str1 = "123")) {
            str2 = null;
        }

        str1 = str2;
        str2 = str1;

        System.out.println(str2);
        Long val = new Long(4321);

        Long val2 = 4321L;

        Long val3 = Long.parseLong("4321");

        Long val4 = new Long("4321");
        System.out.println("val = " + val);
        System.out.println("val2 = " + val2);
        System.out.println("val3 = " + val3);
        System.out.println("val4 = " + val4);

    }

    private static void pressAnyKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    public static void checkTheCode (String input) {
        boolean result = Boolean.parseBoolean(input);
        result = !result;
        String output = String.valueOf(result);
        System.out.println(output);
    }
}