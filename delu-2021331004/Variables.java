public class Variables {
    public static void main(String[] args) {
        byte bt = 100;
        short sh = 1000;
        int i = 10000;
        long l = 100000;
        float f = 123.456F;
        double d = 123456.123456;
        char c = 65;
        boolean bl = true;


        System.out.println("Byte bt = " + bt + ", MAX = " + Byte.MAX_VALUE + ", MIN = " + Byte.MIN_VALUE);
        System.out.println("Short sh = " + sh + ", MAX = " + Short.MAX_VALUE + ", MIN = " + Short.MIN_VALUE);
        System.out.println("Integer i = " + i + ", MAX = " + Integer.MAX_VALUE + ", MIN = " + Integer.MIN_VALUE);
        System.out.println("Long l = " + l + ", MAX = " + Long.MAX_VALUE + ", MIN = " + Long.MIN_VALUE);
        System.out.println("Float f = " + l + ", MAX = " + Float.MAX_VALUE + ", MIN = " + Float.MIN_VALUE);
        System.out.println("Double d = " + d + ", MAX = " + Double.MAX_VALUE + ", MIN = " + Double.MIN_VALUE);
        System.out.println("Character c = " + c + ", MAX = " + Character.MAX_VALUE + ", MIN = " + Character.MIN_VALUE);
        System.out.println("Character integer c = " + c + ", MAX = " +(int) Character.MAX_VALUE + ", MIN = " + (int) Character.MIN_VALUE);
        System.out.println("Boolean bl = " + bl);
    }
}
