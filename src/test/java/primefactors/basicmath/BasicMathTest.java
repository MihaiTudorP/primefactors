package primefactors.basicmath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicMathTest {
    @Test
    public void canExtractIntegerSqrt(){
        assertEquals(1, BasicMath.integerSqrt(1));
        assertEquals(1, BasicMath.integerSqrt(2));
        assertEquals(1, BasicMath.integerSqrt(3));
        assertEquals(2, BasicMath.integerSqrt(4));
        assertEquals(3, BasicMath.integerSqrt(9));
        assertEquals(3, BasicMath.integerSqrt(10));
        assertEquals(11, BasicMath.integerSqrt(121));
        assertEquals(11, BasicMath.integerSqrt(122));
    }
}
