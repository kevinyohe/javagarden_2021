import org.junit.*;

public class FunZoneTest {
    public FunZoneTest(){
        System.out.println("Created new object");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class()");
    }
    @Before
    public void before(){
        System.out.println("before()");
        }

    @Test
    public void test1(){
        System.out.println("test1()");
        Assert.assertEquals("should be equal", 1, 1);
    }
    @Test
    public void test2(){
        System.out.println("test2()");
        Assert.assertEquals("should be equal", 2, 2);
    }
    @After
    public void after(){
        System.out.println("Wash it after()!");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class()");
    }
}
