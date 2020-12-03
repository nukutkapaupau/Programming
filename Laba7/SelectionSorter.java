package Laba7;

public class SelectionSorter implements SorterInterface {
    @Override
    public void Sort(byte[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int mi = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[mi])
                    mi = j;
            byte save = array[mi];
            array[mi] = array[i];
            array[i] = save;
        }
    }
}