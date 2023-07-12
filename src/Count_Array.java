import java.util.Scanner;

public class Count_Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        System.out.println(array_counter(array));

    }

    static int array_counter(int[] array) {
        int max_element=Integer.MIN_VALUE;
        int counter=0;
        for(int iterator=0;iterator<array.length;iterator++){
            if(array[iterator]>max_element){
                max_element=array[iterator];
            }
        }
        for(int iterator=0;iterator<array.length;iterator++){
            if(array[iterator]<max_element){
                counter++;
            }
        }
        return counter;
    }
}
