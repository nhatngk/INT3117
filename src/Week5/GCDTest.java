package Week5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDTest {

    @Test
    public void gcd1() {
        assertEquals(7, GCD.gcd( 7, 0));
    }

    @Test
    public void gcd2() {
        assertEquals(3, GCD.gcd( -3 , 0));
    }

    @Test
    public void gcd3() {
        assertEquals(2, GCD.gcd(  0, 2));
    }


    @Test
    public void gcd4() {
        assertEquals(4, GCD.gcd( -4, -8));
    }
}