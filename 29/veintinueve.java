/*29*/


class veintinueve
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		System.out.println("prints all even numbers between 2 and 100.");
		int a = 2;
		while(a<101){
			if(a%2 == 0){
				System.out.println(a);
				a++;
			}
			else{
				a++;
			}
		}
	}
}