import java.util.Scanner;

public class diecisiete {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Number a: ");
        int a = Integer.parseInt(reader.nextLine());

        System.out.print("Number b: ");
        int b = Integer.parseInt(reader.nextLine());


        if (a>b){
        	System.out.println("a es mayor que b ");
        }
        else if(a<b){
        	System.out.println("b es mayor que a");
        }
        else{
        	System.out.println("a y b son iguales.");
        }
    }
}