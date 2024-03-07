public class conditionalTest {
    public static void main(String[] args) {
        // int[] v = {-1, 10, 1100,  5, -100};
        // for(int i : v)
        //     if(i > 0) if(i > 1000) System.out.println("IF_1"); 
        //     else if(i < 10) System.out.println("ELSE_IF_1");
        //     else System.out.println("ELSE");
        //     else if(i == -100) System.out.println("ELSE_IF_2");
        //     else System.out.println("ELSE_2");
        
        // double d = 2.578; boolean b = true;
        // if(d == 2.578) System.out.println("Double Matched");
        // if(b == true) System.out.println("Bool Matched");

        // Traditional Switch
        // for(int i : v)
        int i = 0; switch(i) {
            case 0:
                System.out.println("CASE_1");
                switch (i) {
                    case 0:
                        System.out.println("NESTED_CASE_0");
                        break;
                }
            case -100:
                System.out.println("CASE_-100");
            case 100:
                System.out.println("CASE_100");
            default:
                System.out.println("CASE_Default");
        }
    }
}