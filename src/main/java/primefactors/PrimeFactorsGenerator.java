package primefactors;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsGenerator {
    public PrimeFactorsGenerator() {
    }

    public static List<Integer> of(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int stop = integerSqrt(n);

        for (int divisor = 2; n > stop; divisor++)
            for (; n % divisor == 0; n /= divisor)
                factors.add(divisor);
        if (n > 1)
            factors.add(n);
        return factors;
    }

    private static int integerSqrt(int n) {
        return new BigDecimal(Double.toString(Math.sqrt(n))).intValue();
    }
}