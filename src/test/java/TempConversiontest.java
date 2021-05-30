//package sprcom.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import sprcom.demo.MyController;

public class TempConversiontest {
    @Test
    public void testTempConversion() throws Throwable {

        MyController underTest = new MyController();
        double temperature = 21.0;
        String unit = "F";
        double result = underTest.tempConversion(temperature, unit);
        assertEquals(68.0, result, "Test result failed");

    }

}
