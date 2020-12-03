package Laba7;


public class Main {
    public static void main(String[] args){
        //Installation of utility class
        Processor sorter = new Processor();
        Printer print = new Printer();
        RandomArray randomArray = new RandomArray();
        //Sorting and output
        System.out.println("Bubble Sort");
        sorter.SetSort(new BubbleSorter());
        print.Output(sorter.Start(randomArray.Generate(5)));
        System.out.println("Insertion Sort");
        sorter.SetSort(new InsertionSorter());
        print.Output(sorter.Start(randomArray.Generate(5)));
        System.out.println("Selection Sort");
        sorter.SetSort(new SelectionSorter());
        print.Output(sorter.Start(randomArray.Generate(5)));
    }
}
