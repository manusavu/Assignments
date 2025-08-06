import java.util.Arrays;
public class swap2arrays{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        System.out.println("Before: ");
        System.out.println("Array1: "+Arrays.toString(arr1));
        System.out.println("Array2: "+Arrays.toString(arr2));
            for(int i=0;i<arr2.length;i++){
                int temp = arr2[i];
                arr2[i] = arr1[i];
                arr1[i] = temp;
            }
        System.out.println("After: ");
        System.out.println("Array1: "+Arrays.toString(arr1));
        System.out.println("Array2: "+Arrays.toString(arr2));
    }
}