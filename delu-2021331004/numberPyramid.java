import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(args[0]);
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int cnt = n - i + 1;
            for(int j = i; j >= 1; j--) {
                System.out.print(cnt++);
            }
            cnt--;
            cnt--;
            for(int j = 2; j <= i; j++) {
                System.out.print(cnt--);
            }
            System.out.println();
        }
    }
}
