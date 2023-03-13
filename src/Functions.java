import java.util.Arrays;

public class Functions {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) index = j;
            }
            if (index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
//            System.out.println(Arrays.toString(arr));
        }
    }

    public static void insertionSort(){

    }

    public static void main(String[] args) {
        int[] arr1  = {19,45,20,17,33,8};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
