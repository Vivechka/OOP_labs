public class Main {
    public Main() {
    }

public static void main(String[] args) {
        double result = 0.0D;
        int a = 1;
        int b = 1;
        int n = 12;
        int m = 5;
        int c = 1;
        boolean flag = true;
        if (flag) {
            for(long i = (long)a; i <= (long)n; ++i) {
                for(long j = (long)b; j <= (long)m; ++j) {
                    result += (double)(i - j) / (double)(i + (long)c);
                }

                if (i + (long)c == 0L) {
                    flag = false;
                }
            }

            System.out.println(result);
        }
    }
}
