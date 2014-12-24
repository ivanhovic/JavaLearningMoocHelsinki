/*30*/
import java.util.Scanner;

class treinta
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Escribe un numero:  ");
		int number = Integer.parseInt(reader.nextLine());
		int a = 0;
		
		while (a <= number){
			System.out.println(a);
			a++;
		}
	}
}