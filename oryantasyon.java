import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class oryantasyon {

       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list= new ArrayList<String>();
		System.out.println("How much name u will add the list");
		int ncounter=sc.nextInt();
		sc.nextLine();
		for(int nn=0;nn<ncounter;nn++){
			System.out.println("Give me name");					
			String names=sc.nextLine();
			list.add(names);
		}
                System.out.println(list);
		System.out.println("Give me a number for stars");
		int i=sc.nextInt();
		stars(i);
		

       }
	public static void stars(int scounter){
		int x1=scounter;
		int x=0;
		while(x<scounter){
			for(int y=0;y<x1;y++){
				System.out.print("*");
				
			}
			x1--;
			x++;
			System.out.println("\n");
		}
		
		while(x1<scounter){
			x1++;
			for(int z=0;z<x1;z++){
				System.out.print("*");		
			}
			
			System.out.println("\n");
		}
	}

}
