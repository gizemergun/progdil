import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class türkce {
	public static String main() {
		Random rnd = new Random();	
		Random rndm = new Random();
		
		List<String> isimcik = new ArrayList<String>();
		isimcik.add ("dünya");
		isimcik.add ("karpuz");
		isimcik.add ("kalorifer");
		isimcik.add ("termostat");
		isimcik.add ("ayakkabi");
		isimcik.add ("süpürge");
		isimcik.add ("havlu");
		isimcik.add ("oje");
		isimcik.add ("komidin");
		isimcik.add ("bardak");
		isimcik.add ("sandalye");
		isimcik.add ("cezve");
		isimcik.add ("rende");
		isimcik.add ("perde");
		isimcik.add ("halı");
		
		List<String> sifatcik = new ArrayList<String>();
		sifatcik.add("iyi");
		sifatcik.add("kötü");
		sifatcik.add("sımarık");
		sifatcik.add("tombul");
		sifatcik.add("sicak");
		sifatcik.add("kokusmus");
		sifatcik.add("islak");
		sifatcik.add("bikmis");
		sifatcik.add("mutlu");
		sifatcik.add("yeni");
		sifatcik.add("kirli");
		sifatcik.add("kırmızı");
		sifatcik.add("bezgin");
		sifatcik.add("eski");
		
		
		int sayi = rnd.nextInt(isimcik.size());
		int sayi1 = rndm.nextInt(sifatcik.size());
		String birinci = isimcik.get(sayi);
		String ikinci = sifatcik.get(sayi1);
		return ikinci + " " + birinci ;
		
	}

}
