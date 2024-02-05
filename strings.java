import java.util.*;

public class strings {
    public static void main(String[] args) {

        /* Strings are Immutable */

        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();

        // System.out.println(name);

        // for(int i = 0; i < name.length(); i++) {
        //     System.out.println(name.charAt(i));
        // }

        String name1 = "Delwar";
        String name2 = "Delwar";


        // s1 > s2 : +ve value
        // s1 < s2 : -ve value
        // s1 == s2 : zero

        if(name1.compareTo(name2) == 0) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }


        /* String Builder */
        StringBuilder sb = new StringBuilder("Delu");
        System.out.println(sb);
        
        System.out.println(sb.charAt(0));

        // setCharAt
        sb.setCharAt(2,'n');
        System.out.println(sb);

        // insert
        sb.insert(2, 'n');
        System.out.println(sb);

        // delete
        sb.delete( 2, 3);
        System.out.println(sb);

        sb = new StringBuilder("");
        sb.append("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);


        /* Reverse a string */
        
    }
}
