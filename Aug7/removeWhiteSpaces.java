import java.util.*;
public class removeWhiteSpaces{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String nu = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                nu = nu + str.charAt(i);
            }
        }
        System.out.println(str.replaceAll(" ",""));
        System.out.println(nu);
    }
}