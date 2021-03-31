package ex7;

public class ex7 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int n = 1; n <= 10000; n++) {
            int m = 0;

            for (int i = 1; i < n; i++) {
                if ((n % i) == 0) {
                    m = m + i;
                }
            }

            if (m == n) {
                System.out.println(n);
            }
        }
    }
}
