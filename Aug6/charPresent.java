import java.util.*;
public class charPresent{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str = inp.nextLine();
        System.out.println("Enter the charcter: ");
        char let = inp.next().charAt(0);
        boolean val = false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==let){
                val = true;
                
            }
        }
        if(val){
            System.out.println("present");
        }
        else{
            System.out.println("Not present");
        }
    }
}