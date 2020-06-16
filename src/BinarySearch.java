import java.util.ArrayList;

public class BinarySearch {

    public static int search(int key, int[] a){

        return search(key, a, 0, a.length);

    }

    public static int search(int key, int[] a, int low, int high){

        if (high < low) return -1;
        int mid = low + (high - low)/2;
        if (a[mid] > key) return search(key, a, low, mid);
        else if (a[mid] < key) return search(key, a, mid + 1, high);
        else return mid;

    }

}


