package Recurrence.Foloat_care;

import java.math.BigDecimal;
import java.math.MathContext;

public class B {
    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(2).divide(BigDecimal.valueOf(3),new MathContext(3));
        System.out.println(a);
    }
}
