import java.util.Scanner;


public class veintidostres {
	public static void main(String[] args) {
    	
        Scanner reader = new Scanner(System.in);
        String password = "carrot";

        while (true){
            System.out.println("Password, pelase");
            String pass = reader.nextLine();
            if (pass.equals(password)){
                break;
            }

        }
        System.out.println("bienvenido");
    }
}
