package Aug5;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
     public static void main(String[] args) {
        int[] arr = {1,2,2,3,2,1,4,5,5,7};
        int max = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int ele:arr){
            if(mp.containsKey(ele)){
                mp.put(ele,mp.get(ele)+1);
                if(mp.get(ele)>max){
                    max = ele;
                }
            }
            else{
                mp.put(ele,1);
            }
        }
        System.out.print("The majority element is : "+max);

    }
}

