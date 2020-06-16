public class get_values {
    public static void values(int[] array){
        int max = array[0];
        int min = array[0];
        double mean = 0;
        for (int value : array) {
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
            mean += (double) value / array.length;
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Mean = " + mean);
    }
}
