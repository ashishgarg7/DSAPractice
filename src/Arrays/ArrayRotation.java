package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayRotation {

    public static void main(String [] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = 2;
        int [] newArray = new int[arr.length];
        int count = 0;
        for(int i = n; i < arr.length; i++) {
            newArray[count++] = arr[i];
        }

        for(int i = 0; i < n; i++) {
            newArray[count++] = arr[i];
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
    }
}
