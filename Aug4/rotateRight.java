package Aug4;
import java.util.Arrays;
public class rotateRight {
    public static void reverse(int[] arr,int a,int b){
        int i=a;
        int j=b;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k= 2;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
