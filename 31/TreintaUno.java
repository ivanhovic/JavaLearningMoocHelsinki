/*31*/
import java.util.Scanner;

class TreintaUno
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner reader = new Scanner(System.in);

		System.out.print("Escribe min: ");
		int min = Integer.parseInt(reader.nextLine());
		System.out.print("Escribe max: ");
		int max = Integer.parseInt(reader.nextLine());

		
		while(min <= max){
			System.out.println(min);
			min++;
		}
	}
}