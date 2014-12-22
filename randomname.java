import java.util.ArrayList;
import java.util.Scanner;

	public class anaprogram {
		public static void main(String[] args) {
			ArrayList<String> liste = new ArrayList<String>() ;
			
			String secim;
			Scanner dil = new Scanner (System.in);
			System.out.println (" Bir dil seciniz?(turkce/ingilizce) ");
			secim = dil.next();
			
			int adet;
			Scanner geldi = new Scanner(System.in);
			System.out.println("lutfen adet giriniz");
			adet = geldi.nextInt();
			
			int sayac;
			for (sayac = 0; sayac < adet ; sayac++){
				if (secim.equals("turkce")){
					String tamlama = türkce.main();
					Boolean sonuc = kontrolet.kontol(tamlama, liste);
					if (sonuc.equals(true)){
						System.out.println(tamlama);
						liste.add(tamlama);
					} else {
						sayac--;
					}
				}
				else {
					String tamlama = ingilizce.main();
					Boolean sonuc = kontrolet.kontol(tamlama, liste);
					if (sonuc.equals(true)){
						System.out.println(tamlama);
						liste.add(tamlama);
					} else {
						sayac--;
					}
				}
			}
		}
	}


