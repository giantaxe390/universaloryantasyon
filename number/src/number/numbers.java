package number;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class numbers {

       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> sayi=new ArrayList<Integer>();
		int opp;
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
				System.out.println("Faktoriyel almak icin bir sayi veriniz");
				int fact=sc.nextInt();
				int mresult=factorial(fact);
				System.out.println("Girilen sayinin faktoriyeli= "+mresult);
			}
			if(menuNumber==2) {
				while(true) {
					System.out.println("Arraye sayi eklemek icin sayi giriniz sonra 0 a tiklayin");
					int arrNumb=sc.nextInt();	
					if(arrNumb!=0) {
						sayi.add(arrNumb);	
					}
					else break;
				}
			}
			if(menuNumber==3) {
				if(sayi.isEmpty()) {
					System.out.println("Listeyi doldurmaniz gerekli 2.adima donun");
				}
				else {
					for(int i=0;i<sayi.size();i++) {
						for(int j=i+1;j<sayi.size();j++) {
							if(sayi.get(j)<sayi.get(i)) {
								opp=sayi.get(i);
								sayi.set(i, sayi.get(j));
								sayi.set(j, opp);
							}
						}
					}
					System.out.println(sayi);
					System.out.println("en kucuk"+sayi.get(0));
					System.out.println("en buyuk"+sayi.get(sayi.size()-1));	
				}
				
			}
			if(menuNumber==4) {
				if(sayi.isEmpty()) {
					System.out.println("Listeyi doldurmaniz gerekli 2.adima donun");
				}
				else {
					for(int i=0;i<sayi.size();i++) {
						for(int j=i+1;j<sayi.size();j++) {
							if(sayi.get(j)>sayi.get(i)) {
								opp=sayi.get(i);
								sayi.set(i, sayi.get(j));
								sayi.set(j, opp);
							}
						}
					}
					System.out.println(sayi);
					System.out.println("en buyuk= "+sayi.get(0));
					System.out.println("en kucuk= "+sayi.get(sayi.size()-1));	
				}
			}
			if(menuNumber==5) {
				if(sayi.isEmpty()) {
					System.out.println("Listeyi doldurmaniz gerekli 2.adima donun");
				}
				else {
					for (int i = 0; i < sayi.size() / 2; i++) {
					     int chosenNumb = sayi.get(i);
					     sayi.set(i, sayi.get(sayi.size() - i - 1));
					     sayi.set(sayi.size() - i - 1, chosenNumb);
					   }
					System.out.println(sayi);
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

}




