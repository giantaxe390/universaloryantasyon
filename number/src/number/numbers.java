package number;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class numbers {

       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numbersList=new ArrayList<Integer>();
		//Menu
		while(true) {
			System.out.println("Islem yapmak icin \n"
					+ "Faktoriyel almak icin 1\n"
					+"Arraye ekleme yapmak icin 2 \n"
					+"Arraydeki en buyuk ve en kucuk elemani bulmak icin 3\n"
					+"Arrayi ters cevirip yeni bir array olusturmak icin 4\n"
					+"Arrayi oldudug halin tersine cevirmek icin 5\n"
					+ "Menuden cikmak icin 0 tuslayin");
			int menuNumber=sc.nextInt();
			if(menuNumber==1) {
				System.out.println("Faktoriyel almak icin bir numbersList veriniz");
				int fact=sc.nextInt();
				int mresult=factorial(fact);
				System.out.println("Girilen sayinin faktoriyeli= "+mresult);
			}
			if(menuNumber==2) {
				while(true) {
					System.out.println("Arraye numbersList eklemek icin numbersList giriniz sonra 0 a tiklayin");
					int arrNumb=sc.nextInt();	
					if(arrNumb!=0) {
						numbersList.add(arrNumb);	
					}
					else break;
				}
			}
			if(menuNumber==3) {
				if(numbersList.isEmpty()) {
					System.out.println("Listeyi doldurmaniz gerekli 2.adima donun");
				}
				else {
					array_sort(numbersList);
					System.out.println(numbersList);
					System.out.println("en kucuk"+numbersList.get(0));
					System.out.println("en buyuk"+numbersList.get(numbersList.size()-1));	
				}
				
			}
			if(menuNumber==4) {
				if(numbersList.isEmpty()) {
					System.out.println("Listeyi doldurmaniz gerekli 2.adima donun");
				}
				else {
					array_sortOpposite(numbersList);
					System.out.println(numbersList);
					System.out.println("en buyuk= "+numbersList.get(0));
					System.out.println("en kucuk= "+numbersList.get(numbersList.size()-1));	
				}
			}
			if(menuNumber==5) {
				if(numbersList.isEmpty()) {
					System.out.println("Listeyi doldurmaniz gerekli 2.adima donun");
				}
				else {
					array_reverse(numbersList);
					System.out.println(numbersList);
				}
			}
			if(menuNumber==0) {
				break;
			}
		}
		System.out.println("Basarili cikis yaptiniz");
	}
		
		
	
       
	public static Integer factorial(int fnumb){
		int result=1;
		for(int i=1;i<=fnumb;i++) {
			result=result*i;
		}
		return result;
	}
	public static void array_sort(List<Integer> array){
		int opp;
		for(int i=0;i<array.size();i++) {
			for(int j=i+1;j<array.size();j++) {
				if(array.get(j)<array.get(i)) {
					opp=array.get(i);
					array.set(i, array.get(j));
					array.set(j, opp);
				}
			}
		}
	}
	public static void array_sortOpposite(List<Integer> array){
		int opp;
		for(int i=0;i<array.size();i++) {
			for(int j=i+1;j<array.size();j++) {
				if(array.get(j)>array.get(i)) {
					opp=array.get(i);
					array.set(i, array.get(j));
					array.set(j, opp);
				}
			}
		}
	}
	public static void array_reverse(List<Integer> array){
		
		for (int i = 0; i < array.size() / 2; i++) {
		     int chosenNumb = array.get(i);
		     array.set(i, array.get(array.size() - i - 1));
		     array.set(array.size() - i - 1, chosenNumb);
		   }
	}
	

}




