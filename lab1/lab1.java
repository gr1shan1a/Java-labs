package lab1;

import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.*;

public class lab1 {
    static int e[] = new int[11];
    static double x[] = new double[20];
    static double a[][]= new double[11][20];
    static int k[] = {4, 6, 10, 16, 20};
    public static void main(String[] args) {
        Random random = new Random();
        for (int k = 0; k < e.length; k++) e[k] = 4 + 2 * k;
        for (int l = 0; l < x.length; l++) x[l] = -15.0 + random.nextDouble() * 29.0;

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 20; j++) {
                if (e[i] == 14) a[i][j] = Math.pow(Math.pow(Math.asin((x[j] - 0.5)/29.0), 1.0/3), (3.0/4 + (Math.pow(Math.PI/(Math.pow(Math.E, x[j])), 2.0))));
                else if (contains(k, e[i])) a[i][j] = Math.asin(1.0 / (Math.pow(Math.E, Math.pow((3 * Math.pow(Math.sin(x[j]), 2.0)), 2.0))));
                else a[i][j] = Math.pow(Math.pow(Math.E, Math.atan(Math.sin(x[j]))), 2.0);
            }
        }

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(String.format("%.3f ", a[i][j]));
            }
            System.out.println();
        }

    }
    private static boolean contains(int[] arr, int key) {
        for (int i : arr) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}
