public class loopTest {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5) System.out.println(i++);
        do System.out.println(i++); while(i < 5);
        while(i++ < 5);
        do; while(i++ < 5);

        for(int j = 0, k = 10; j < k; j++, k--)
            System.out.println(j);
        for(i = 0; i < 5; i++) for(int j = 0; j < 5; j++)
            System.out.println(j);
        
        
    }
}
