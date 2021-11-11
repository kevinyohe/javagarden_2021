import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Testing Standard out examples
public class StopLightTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void testsWorking(){
        StopLight stopLight = new StopLight();
        assertEquals(stopLight, stopLight);
        stopLight.changeLight(Light.RED);
        assertEquals("STOP!!", outputStreamCaptor.toString().trim());
    }
//  When an exception will be thrown add it to expected = line on @test annotation
//   @Test(expected = IllegalStateException.class)


    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
