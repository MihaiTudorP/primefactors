package primefactors.basicmath;

import java.math.BigDecimal;

public class BasicMath {
    public static int integerSqrt(int n) {
        return new BigDecimal(Double.toString(Math.sqrt(n))).intValue();
    }
}