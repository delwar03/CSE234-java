import java.util.*;

public class recursion_2 {
    public static int first = -1;
    public static int last = -1;
    public static String[] keyPad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // towerOfHanoi(n, "S", "H", "D");

        // String str = sc.nextLine();
        // printRev(str, str.length() - 1);
        // calculateFirstAndLastOccurrence(str, 0, 'a');
        
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // if(isSorted(arr, 0) == true) {
        //     System.err.println("array is sorted");
        // } else {
        //     System.out.println("array is not sorted");
        // }

        String str = sc.nextLine();
        // moveAll_x_toEnd(str, 0, 0, "");
        // removeDuplicates(str, 0, new boolean[26], "");

        // HashSet<String> st = new HashSet<>();
        // printSubsequences(str, 0, "", st);
        // printSuitCasePassword();
        // printKeyPadCombination(str, 0, "");
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest)  {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void printRev(String str, int ind) {
        if(ind < 0) {
            return;
        }
        System.out.print(str.charAt(ind));
        printRev(str, ind - 1);
    }

    public static void calculateFirstAndLastOccurrence(String str, int ind, char ch) {
        if(ind >= str.length()) {
            System.out.println("first occurrence in index " + first + " last occurrence in index " + last);
            return;
        }
        if(str.charAt(ind) == ch) {
            if(first == -1) first = ind;
            last = ind;
        }
        calculateFirstAndLastOccurrence(str, ind + 1, ch);
    }

    public static boolean isSorted(int[] arr, int ind) {
        if(ind == arr.length - 1) {
            return true;
        }

        if(arr[ind] < arr[ind + 1]) {
            return isSorted(arr, ind + 1);
        } else {
            return false;
        }
    }

    public static void moveAll_x_toEnd(String str, int ind, int cnt, String newStr) {
        if(ind == str.length() - 1) {
            newStr += str.charAt(ind);
            for(int i = 0; i < cnt; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        if(str.charAt(ind) == 'x') {
            cnt++;
        } else {
            newStr += str.charAt(ind);
        }
        moveAll_x_toEnd(str, ind + 1, cnt, newStr);
    }

    public static void removeDuplicates(String str, int ind, boolean[] freq, String newStr) {
        if(ind == str.length()) {
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(ind);
        if(freq[ch - 'a'] == false) {
            newStr += ch;
            freq[ch - 'a'] = true;
        }
        removeDuplicates(str, ind + 1, freq, newStr);
    }

    public static void printSubsequences(String str, int ind, String subSequence, HashSet<String> st) {
        if(ind == str.length()) {
            if(!st.contains(subSequence)) {
                System.out.println(subSequence);
                st.add(subSequence);
            }
            return;
        }
        
        char ch = str.charAt(ind);
        printSubsequences(str, ind + 1, subSequence + ch, st);
        printSubsequences(str, ind + 1, subSequence, st);
    }

    public static void printSuitCasePassword() {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    System.out.println(k + " " + j + " " + i);
                }
            }
        }
    }

    public static void printKeyPadCombination(String str, int ind, String combination) {
        if(ind == str.length()) {
            System.out.println(combination);
            return;
        }
        
        char ch = str.charAt(ind);
        String mapping = keyPad[ch - '0'];
        for(int i = 0; i < mapping.length(); i++) {
            printKeyPadCombination(str, ind + 1, combination + mapping.charAt(i));
        }
    }
};