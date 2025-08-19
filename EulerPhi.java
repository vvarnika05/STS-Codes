import java.util.Scanner;

public class EulerPhi {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int n = so.nextInt();
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (gcd(i, n) == 1) {
                c++;
            }
        }
        System.out.println(c);
        so.close();
    }
}
