package Aug5;
import java.util.*;
public class duplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,2,1,4,5,5,7};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int ele:arr){
            if(mp.containsKey(ele)){
                mp.put(ele,mp.get(ele)+1);
            }
            else{
                mp.put(ele,1);
            }
        }
        System.out.print("The duplicate values are: ");
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            if(e.getValue()>1){
                System.out.print(e.getKey()+" ");
            }
        }
    }
}
