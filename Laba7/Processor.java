package Laba7;

public class Processor {
    private SorterInterface sorter;
    public byte[] Start(byte[] array){
        sorter.Sort(array);
        return array;
    }
    public void SetSort(SorterInterface method){
        sorter = method;
    }
}
