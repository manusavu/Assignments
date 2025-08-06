public class print1to100{
    public static void main(String[] args){
        StringBuilder name = new StringBuilder("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // System.out.println(name.length());
        while(name.length()>0){
            System.out.println(name.length());
            name.deleteCharAt(0);
        }

    }
}