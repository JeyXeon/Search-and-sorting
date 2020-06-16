import java.util.Arrays;

public class bubble_sorting {
    public static void sort(int[] array, int n) {
        for (int j = 0; j < n - 1; j++) {
            for(int i = 0; i < n - 1; i++){
                if(array[i] > array[i + 1]){
                    int x = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = x;
                 }
            }
        }
        String arrayString = Arrays.toString(array);
        System.out.println("Sorted array: " + arrayString);
    }
}
