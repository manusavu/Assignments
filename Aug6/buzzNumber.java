import java.util.*;
public class buzzNumber{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = inp.nextInt();
        boolean buzz = false;
        if(num%7 == 0 || num%10 == 7){
            buzz = true;
        }
        else{
            buzz = false;
        }
        if(buzz){
            System.out.println("It's a buzz number");
        }
        else{
            System.out.println("It's not a buzz number");
        }
    }
}