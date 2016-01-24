import java.util.Scanner;

public class Primitives {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Digite um texto:"); 
		
		while(sc.hasNext())
		{ 
			if (sc.hasNextBoolean())
			{
				boolean b = sc.nextBoolean();
				System.out.println("Primitive : boolean");
			} else if(sc.hasNextInt() )
			{
				int i = sc.nextInt();
				System.out.println("Primitive : int");
			} else if(sc.hasNextFloat() )
			{
				float f = sc.nextFloat();
				System.out.println("Primitive : float");
			} else if(sc.hasNextDouble() )
			{
				double f = sc.nextDouble();
				System.out.println("Primitive : double");
			}
			else{
				String s = sc.nextLine();
				if (s.length() == 1)
				{
					System.out.println("Primitive : char");
				}
				else
				{
					System.out.println("Primitive : String");
				}
			}
		} 
		sc.close(); //Encerra o programa
		

	}

}
