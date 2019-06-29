package primefactors;

import primefactors.basicmath.BasicMath;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsGenerator {

    public static List<Integer> of(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        int stop = BasicMath.integerSqrt(n);

        for (int divisor = 2; n > stop; divisor++)
            for (; n % divisor == 0; n /= divisor)
                factors.add(divisor);
        if (n > 1)
            factors.add(n);
        return factors;
    }

}