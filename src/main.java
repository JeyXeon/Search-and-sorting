import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args){
        int n = input.len();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) random.getRandomInteger(0, 9);
        }
        String arrayString = Arrays.toString(array);
        System.out.println("Starting array: " + arrayString);
        get_values.values(array);
        bubble_sorting.sort(array, array.length);
        int key = input.key();
        System.out.println("Element's position: " + BinarySearch.search(key, array));
        }
    }



