
package Aug5;
public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i=0;
        int j = arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.print("The reversed array is : ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
