import java.util.Scanner;

public class veintiuno {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a year");
        int a = Integer.parseInt(reader.nextLine());

        if (a % 4 != 0){
          System.out.println("It's NOT a leap year");
        }
        else if (a % 100 !=0 ){
          System.out.println("It's a leap year");
        }
        else if (a % 400 != 0){
          System.out.println("It's a NOT a leap year");
        }
        else{
          System.out.println("It's a leap year");
        }
    }
}