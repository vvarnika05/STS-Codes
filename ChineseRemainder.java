import java.util.*;

public class ChineseRemainder {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.println("Enter no. of equations:");
        int n = so.nextInt();
        int[] a = new int[n];
        int[] m = new int[n];
        int M = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter remainder and moduli: ");
            a[i] = so.nextInt();
            m[i] = so.nextInt();
            M *= m[i]; // product of all moduli
        }

        // validate the inputs
        for (int i = 0; i < n; i++) {
            if ((i < n - 1 && gcd(m[i], m[i + 1]) != 1) || a[i] >= m[i]) {
                System.out.println("No solution exists. ");
                return;
            }
        }

        // Apply the formula
        int z = 0;
        for (int i = 0; i < n; i++) {
            int k = M / m[i];
            int y = 1;
            // to find the inverse (k^-1)
            for (int j = 0; j < m[i]; j++) {
                if ((k * j) % m[i] == 1) {
                    y = j;
                    break;
                }
            }
            z += a[i] * k * y;
        }
        System.out.println("Solution is: " + (z % M));

    }
}
