package primefactors;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {
    @Test
    public void canFactorIntoPrimes() {
        assertPrimeFactors(1, list());
        assertPrimeFactors(2, list(2));
        assertPrimeFactors(3, list(3));
        assertPrimeFactors(4, list(2, 2));
        assertPrimeFactors(5, list(5));
        assertPrimeFactors(6, list(2, 3));
        assertPrimeFactors(8, list(2, 2, 2));
        assertPrimeFactors(9, list(3, 3));
        assertPrimeFactors(2 * 3 * 2 * 5 * 7 * 11 * 11 * 13, list(2, 2, 3, 5, 7, 11, 11, 13));
        assertPrimeFactors(3*5*7*11*11*107, list(3, 5, 7, 11, 11, 107));
    }

    private void assertPrimeFactors(int n, List<Integer> primeFactors) {
        assertEquals(primeFactors, of(n));
    }

    private List<Integer> of(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        int stop = integerSqrt(n);

        for (int divisor = 2; n > stop; divisor++)
            for (; n % divisor == 0; n /= divisor)
                factors.add(divisor);
        if (n > 1)
            factors.add(n);
        return factors;
    }

    private int integerSqrt(int n) {
        return new BigDecimal(Double.toString(Math.sqrt(n))).intValue();
    }

    private List<Integer> list(Integer... numbers) {
        return Arrays.asList(numbers);
    }
}
