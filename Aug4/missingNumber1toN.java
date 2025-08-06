package Aug4;

public class missingNumber1toN {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int n = 6;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("The missing number is : "+ (((n*(n+1)/2))-sum));
    }
}
