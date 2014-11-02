import java.util.ArrayList;
import java.util.Scanner;

	public class anaprogram {
		public static void main(String[] args) {
			ArrayList<String> liste = new ArrayList<String>();
			Scanner dil = new Scanner (System.in);
			System.out.println (" Bir dil seciniz?(turkce/ingilizce) ") ;
			String secim ;
			secim = dil.next();
			Scanner geldi = new Scanner(System.in);
			System.out.println("lutfen adet giriniz");
			int adet;
			adet = geldi.nextInt();
			
			
			
			if (secim.equals("turkce")) {
				int sayac;
				for (sayac = 0; sayac < adet ; sayac++) {
					String tamlama = türkce.main();
					Boolean sonuc = kontrolet.kontol(tamlama, liste);
					if (sonuc.equals(true)) {
						System.out.println(tamlama);
						liste.add(tamlama);
					} else {
						sayac--;
					}
				 }
			}
			else {
				int sayac;
				for (sayac = 0; sayac < adet ; sayac++) {
					String tamlama = ingilizce.main();
					Boolean sonuc = kontrolet.kontol(tamlama, liste);
					if (sonuc.equals(true)) {
						System.out.println(tamlama);
						liste.add(tamlama);
					} else {
						sayac--;
					}
				 }
			}

		}

	}


