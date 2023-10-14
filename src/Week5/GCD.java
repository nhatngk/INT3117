package Week5;

public class GCD {
    static int gcd(int a, int b) {
        int tmp;
        if(a < 0) a = -a;
        if(b < 0) b = -b;
        while(b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
