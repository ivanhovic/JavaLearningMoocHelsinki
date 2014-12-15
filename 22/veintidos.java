import java.util.Scanner;


public class veintidos {
	public static void main(String[] args) {
    	Scanner reader = new Scanner(System.in);

        //pide y lee password
        String password = "carrot";
        System.out.println("Password, pelase");
		String pass = reader.nextLine();
        //String passlow = pass.toLowerCase();
        //igualdad con equals
        if (pass.equals(password))
        	System.out.println("Correcto");
        else
        	System.out.println("Prueba de nuevo");
    }
}
