import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Garden {
    static Logger logger = Logger.getLogger(Garden.class);
    static <T> void displayClassName(T variable) {
        System.out.println(variable.getClass().getName());
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        NDC.push("Client #45890");

        logger.info("Awake awake. Put on thy strength.");
        Garden.someDB();
        InnerTrivial.foo();
        logger.info("Exiting Trivial.");


        StopLight street = new StopLight();

        street.changeLight(Light.YELLOW);
        ArrayList<Object> variables = new ArrayList<Object>();
        Double doubleNumber = 1.5;
        String name = "Sally";
        int intNumber = 1;
        char letter = 'a';

        variables.add(doubleNumber);
        variables.add(name);
        variables.add(intNumber);
        variables.add(letter);

        for (Object variable : variables) {
            Garden.displayClassName(variable);
        }

        // hashset test
        HashSet<Integer> things = new HashSet();
        things.add(1);
        things.add(2);
        things.add(3);
        things.add(3);
        for (int thing: things ) {
            System.out.println(thing + "");

        }

        int[] numbers = {1,5,6,4,3,4,5,6,7,5,3,2,2,4,5,6};
        for (int number:numbers
             ) {
            System.out.println("processing " + number);
        }
        // print length and sum
        System.out.println(numbers.length + " " + Arrays.stream(numbers).sum());
        int x = 1;
        System.out.println(Arrays.stream(numbers).allMatch(e -> e > 0) + "");


            // Get some file specs
        File cDrive = new File("C:");
        System.out.println(String.format("Total space: %.2f GB",
                (double)cDrive.getTotalSpace() /1073741824));
        System.out.println(String.format("Free space: %.2f GB",
                (double)cDrive.getFreeSpace() /1073741824));
        System.out.println(String.format("Usable space: %.2f GB",
                (double)cDrive.getUsableSpace() /1073741824));

        // monitor memory
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        System.out.println(String.format("Initial memory: %.2f GB",
                (double)memoryMXBean.getHeapMemoryUsage().getInit() /1073741824));
        System.out.println(String.format("Used heap memory: %.2f GB",
                (double)memoryMXBean.getHeapMemoryUsage().getUsed() /1073741824));
        System.out.println(String.format("Max heap memory: %.2f GB",
                (double)memoryMXBean.getHeapMemoryUsage().getMax() /1073741824));
        System.out.println(String.format("Committed memory: %.2f GB",
                (double)memoryMXBean.getHeapMemoryUsage().getCommitted() /1073741824));


        // Thread info:
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        for(Long threadID : threadMXBean.getAllThreadIds()) {
            ThreadInfo info = threadMXBean.getThreadInfo(threadID);
            System.out.println("Thread name: " + info.getThreadName());
            System.out.println("Thread State: " + info.getThreadState());
            System.out.println(String.format("CPU time: %s ns",
                    threadMXBean.getThreadCpuTime(threadID)));
        }



    }

    static
    void someDB() {
        NDC.push("DB???");
        logger.debug("Now king David was old.");
        NDC.pop();
    }

    static class InnerTrivial {
        static  Logger logger = Logger.getLogger(InnerTrivial.class);

        static
        void foo() {
            logger.info("Entered foo.");
        }
    }
}
