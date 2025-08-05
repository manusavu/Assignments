package Aug5;
public class secondMax {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int maxi = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                sec_max = maxi;
                maxi = arr[i];
            }
            if(arr[i]<maxi && arr[i]>sec_max){
                sec_max = arr[i];
            }
        }
        System.out.println("The second maximum number is : "+sec_max);
    }
}
