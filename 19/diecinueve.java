import java.util.Scanner;


public class diecinueve {
	public static void main(String[] args) {

    	Scanner reader = new Scanner(System.in);

            System.out.println("¿cuántos años tienes?");
            int edad = Integer.parseInt(reader.nextLine());
            if (edad>0 && edad<120){
                System.out.println("su edad es: " + edad);
            }
            else{
                System.out.println("No mienta!");
            }
    }
}
