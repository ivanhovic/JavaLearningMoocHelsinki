import java.util.Scanner;

public class dieciocho {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Puntos 0-60");
        int a = Integer.parseInt(reader.nextLine());

        if (a<30){
        	System.out.println("Nota : Failed");
        }
        else if(a>=30 && a<35){
        	System.out.println("Nota : 1");
        }
        else if(a>=35 && a<39){
            System.out.println("Nota : 2");
        }
        else if(a>=40 && a<44){
            System.out.println("Nota : 3");
        }
        else if(a>=45 && a<49){
            System.out.println("Nota : 4");
        }
        else if(a>=50 && a<=60){
            System.out.println("Nota : 5");
        }
    }
}