import java.util.*;

public class recursion_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // printPermutation(str, "");
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int totalPaths = calculatePath(0, 0, n, m);
        // System.err.println(totalPaths);

        // int totalWays = placeTiles(n, m);
        // System.out.println(totalWays);

        int n = sc.nextInt();
        // int totalInvitation = calculateTotalInvitations(n);
        // System.out.println(totalInvitation);

        ArrayList<Integer> subSet = new ArrayList<>();
        findSubset(n, subSet);
    }

    public static void printPermutation(String str, String permutation) {
        if(str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, permutation + ch);
        }
    }

    public static int calculatePath(int i, int j, int n, int m) {
        if(i == n || j == m) {
            return 0;
        }
        
        if(i == n - 1 && j == m - 1) {
            return 1;
        }
        int rightPaths = calculatePath(i + 1, j, n, m);
        int downPaths = calculatePath(i, j + 1, n, m);
        return rightPaths + downPaths;
    }

    public static int placeTiles(int n, int m) {
        if(n == m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }
        int horizontalWays = placeTiles(n - 1, m);
        int verticalWays = placeTiles(n - m, m);
        return horizontalWays + verticalWays;
    }

    public static int calculateTotalInvitations(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int singleInvitationWays = calculateTotalInvitations(n - 1);
        int pairInvitationWays = (n - 1) * calculateTotalInvitations(n - 2);
        return singleInvitationWays + pairInvitationWays;
    }

    public static void findSubset(int n, ArrayList<Integer> subSet) {
        if(n == 0) {
            printSubset(subSet);
            return;
        }
        // consider 'n'
        subSet.add(n);
        findSubset(n - 1, subSet);

        // do not consider 'n'
        subSet.remove(subSet.size() - 1);
        findSubset(n - 1, subSet);
    }

    public static void printSubset(ArrayList<Integer> subSet) {
        for(int i = 0; i < subSet.size(); i++) {
            System.out.print(subSet.get(i) + " ");
        }
        System.out.println();
    }
}