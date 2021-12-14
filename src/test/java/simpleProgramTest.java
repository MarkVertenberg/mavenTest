import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class simpleProgramTest {

    @Test
    void minimumTest(){
        int[] numbers = {23, 12, 5, 8, 98};
        assertEquals(5, simpleProgram.minimum(numbers));
        numbers = new int[]{};
        assertEquals(-1, simpleProgram.minimum(numbers));
    }
}