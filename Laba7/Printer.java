package Laba7;

public class Printer {
    public static void Output(byte[] array) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}

