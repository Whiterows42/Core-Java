package Day03;

public class Day03 {
    public static void main(String[] args) {

        // Explicit casting from byte to short to int to long
        byte a = 20;
        short c = (short) a;
        int b = (int) c;
        long e = (long) b;

        // Implicit casting from float to int to byte
        float f = 20.0f;
        int g = (int) f;
        byte d = (byte) g;

        // Explicit casting from float to long
        float x = 32.0f;
        long xx = (long) x;

        System.out.println(e); // Print the long value
        System.out.println(d); // Print the byte value
        System.out.println(xx); // Print the long value
    }
}
