package Week3;
public class Tax {
    static double taxCalculator (double I) {
        if (I <= 0 ) {
            return -1;
        } else if (I > 0 && I <= 5 ) {
            return I * 5 /100;
        } else if (I > 5 && I <= 10 ) {
            return I * 10 /100 - 0.25;
        } else if (I > 10 && I <= 18 ) {
            return I * 15 /100 - 0.75;
        } else if (I > 18 && I <= 32 ) {
            return I * 20 /100 - 1.65;
        } else if (I > 32 && I <= 52 ) {
            return I * 25 /100 - 3.25;
        } else if (I > 52 && I <= 80 ) {
            return I * 30 /100 - 5.85;
        } else {
            return I * 35 /100 - 9.85;
        }
    }
}