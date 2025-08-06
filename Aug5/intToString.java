public class intToString{
    public static void main(String[] args){
        int num = 56;
        System.out.println("Before: "+num);
        System.out.println(String.valueOf(num)+1);
        String val = "456";
        System.out.println("Before: "+val);
        System.out.println(Integer.valueOf(val)+1);
    }
}