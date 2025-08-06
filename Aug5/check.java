import java.util.Scanner;
public class check{
    public static void main(String[] args){
        String[] names = {"manu","suri","ram","gnane"};
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter one of the name of four members in group: ");
        String guess = inp.next();
        boolean gu = false;
        for(String ele: names){
            if(ele.equals(guess)){
                gu = true;
               
            }
        }
        if(gu){
            System.out.println("Present");
        }
        else{
            System.out.println("No");
        }
    }
}