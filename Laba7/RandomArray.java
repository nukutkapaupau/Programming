package Laba7;
import java.util.Random;

public class RandomArray {
    public static byte[] Generate(int length) {
        byte[] num = new byte[length];
        new Random().nextBytes(num);
        return num;
    }

}
