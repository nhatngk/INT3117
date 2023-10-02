package Week3;

public class Tax {
    static double taxCalculator(double I) {
        double result ;
        if (I <= 0) {
            return -1;
        } else if (I > 0 && I <= 5) {
            result = Math.round(I * 5 / 100.0 * 1000.0) / 1000.0;
        } else if (I > 5 && I <= 10) {
            result = Math.round(I * 10 / 100.0 * 1000.0 - 0.25 * 1000.0) / 1000.0;
        } else if (I > 10 && I <= 18) {
            result = Math.round(I * 15 / 100.0 * 1000.0 - 0.75 * 1000.0) / 1000.0;
        } else if (I > 18 && I <= 32) {
            result = Math.round(I * 20 / 100.0 * 1000.0 - 1.65 * 1000.0) / 1000.0;
        } else if (I > 32 && I <= 52) {
            result = Math.round(I * 25 / 100.0 * 1000.0 - 3.25 * 1000.0) / 1000.0;
        } else if (I > 52 && I <= 80) {
            result = Math.round(I * 30 / 100.0 * 1000.0 - 5.85 * 1000.0) / 1000.0;
        } else {
            result = Math.round(I * 35 / 100.0 * 1000.0 - 9.85 * 1000.0) / 1000.0;
        }

        return result;
    }
}