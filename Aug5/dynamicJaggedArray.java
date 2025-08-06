import java.util.Scanner;
public class dynamicJaggedArray{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = inp.nextInt();
        int[][] arr = new int[rows][];
        for(int i=0;i<rows;i++){
            System.out.println("Enter the number of elements in row-"+i+": ");
            int col = inp.nextInt();
            arr[i] = new int[col];
            System.out.println("Enter the elements: ");
            for(int j=0;j<col;j++){
                arr[i][j] = inp.nextInt();
            }
        }
        for(int[] ele: arr){
            for(int el:ele){
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}