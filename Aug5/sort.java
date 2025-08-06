import java.util.Arrays;
public class sort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            
        }
    }
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        System.out.println("The sorted integer array is: ");
        selectionSort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] arr2 =  {8,4,6,5,9,7};
        System.out.println("The sorted array using builtin method: ");
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        String[] arr3 = {"manu","suri","ram","gnane"};
        System.out.println("The sorted string array is: ");
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
