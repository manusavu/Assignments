package Aug4;
import java.util.HashSet;
public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,5};
        HashSet<Integer> se = new HashSet<>();
        for(int el: arr){
            se.add(el);
        }
        System.out.println("The unique values are: ");
        for(int ele: se){
            System.out.print(ele+" ");
        }

    }
}
