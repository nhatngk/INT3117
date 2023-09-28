package Week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxTest {
    @Test
    public void taxCalculator1() {
        assertEquals(-1, Tax.taxCalculator(-0.5));
    }

    @Test
    public void taxCalculator2() {
        assertEquals(0.125, Tax.taxCalculator(2.5));
    }

    @Test
    public void taxCalculator3() {
        assertEquals(0.26, Tax.taxCalculator(5.1 ));
    }

    @Test
    public void taxCalculator4() {
        assertEquals(1.95, Tax.taxCalculator(18.0));
    }

    @Test
    public void taxCalculator5() {
        assertEquals(3.35, Tax.taxCalculator(25));
    }

    @Test
    public void taxCalculator6() {
        assertEquals(9.75, Tax.taxCalculator(52));
    }

    @Test
    public void taxCalculator7() {
        assertEquals(12.15 , Tax.taxCalculator(60));
    }

    @Test
    public void taxCalculator8() {
        assertEquals(18.185, Tax.taxCalculator(80.1));
    }

    @Test
    public void taxCalculator9() {
        assertEquals(-1, Tax.taxCalculator(-5));
    }

    @Test
    public void taxCalculator10() {
        assertEquals(0.25, Tax.taxCalculator(4.996));
    }

    @Test
    public void taxCalculator11() {
        assertEquals(0.648, Tax.taxCalculator(8.977 ));
    }

    @Test
    public void taxCalculator12() {
        assertEquals(0.83, Tax.taxCalculator(10.533));
    }

    @Test
    public void taxCalculator13() {
        assertEquals(4.74, Tax.taxCalculator(31.95));
    }

    @Test
    public void taxCalculator14() {
        assertEquals(5.006, Tax.taxCalculator(33.023));
    }

    @Test
    public void taxCalculator15() {
        assertEquals(18.15 , Tax.taxCalculator(79.999));
    }

    @Test
    public void taxCalculator16() {
        assertEquals(21.65, Tax.taxCalculator(90));
    }
}