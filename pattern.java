import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // System.out.print(n);

        /* Normal Pattern */
        // solidRectangle();
        // hollowRectnagle();
        // halfPyramid();
        // invertedHalfPyramid();
        // invertedHalfPyramid_180_degree_rotated();
        // halfPyramidWithNumbers();
        // invertedPyramidWithNumbers();
        // floydsTriangle();
        // zeroOneTriangle();

        /* Advanced Pattern */
        // butterFlyPattern();
        // solidRhombusPattern();
        // numberPyramid();
        // palindromicPattern();
        diamondPattern();
    }


    public static void solidRectangle() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRectnagle() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid_180_degree_rotated() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j <= n - i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramidWithNumbers() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void invertedPyramidWithNumbers() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydsTriangle() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        for(int i = 1; i <= n; i++) {
            int val = num;
            for(int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = 1 - val;
            }
            System.out.println();
            num = 1 - num;
        }
    }

    public static void butterFlyPattern() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 2 * n; j++) {
                if(j <= i || j >= 2 * n + 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= 2 * n; j++) {
                if(j <= i || j >= 2 * n + 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void solidRhombusPattern() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberPyramid() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromicPattern() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            int cnt = i, unit = -1;
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(cnt + " ");
                if(cnt == 1) unit = 1;
                cnt += unit;
            }
            System.out.println();
        }
    }

    public static void diamondPattern() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            int cnt = i, unit = -1;
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
                if(cnt == 1) unit = 1;
                cnt += unit;
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            int cnt = i, unit = -1;
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
                if(cnt == 1) unit = 1;
                cnt += unit;
            }
            System.out.println();
        }
    }
};
