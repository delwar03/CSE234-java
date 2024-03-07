import java.io.IOException;

public class classWork {
    public static void main(String[] args) throws java.io.IOException
    {
        int sum = 0, num = 0;
        while(true) {
            char ch = (char) System.in.read();
            if(ch >= '0' && ch <= '9') {
                num *= 10;
                num += (ch - '0');
            } else if(ch == '\n') {
                sum += num;
                num = 0;
            } else {
                char e = (char) System.in.read();
                char n = (char) System.in.read();
                char d = (char) System.in.read();
                if(e == 'E' && n == 'N' && d == 'D') break;
            }
        }
        System.out.println(sum);
    }
}
