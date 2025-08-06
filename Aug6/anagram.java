import java.util.Arrays;
public class anagram{
    public static void main(String[] args){
        String str1 = "htello";
        String str2 = "hello";
        char[] str1arr = str1.toCharArray();
        char[] str2arr = str2.toCharArray();
        Arrays.sort(str1arr);
        Arrays.sort(str2arr);
        // System.out.print(str1arr+" "+str2);
        str1 = new String(str1arr);
        str2 = new String(str2arr);
        if(str1.equals(str2)){
            System.out.println("They are anagrams");
        }
        else{
            System.out.println("Ther are not anagrams.");
        }

    }
}