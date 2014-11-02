import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ingilizce {
	public static String main() {
		Random rnd = new Random();	
		Random rndm = new Random();
		
		List<String> isimcik = new ArrayList<String>();
		isimcik.add ("book");
		isimcik.add ("shoes");
		isimcik.add ("watermelon");
		isimcik.add ("glass");
		isimcik.add ("pen");
		isimcik.add ("milk");
		isimcik.add ("lemon");
		isimcik.add ("wave");
		isimcik.add ("world");
		
		
		List<String> sifatcik = new ArrayList<String>();
		sifatcik.add ("good");
		sifatcik.add ("bad");
		sifatcik.add ("yellow");
		sifatcik.add ("green");
		sifatcik.add ("happy");
		sifatcik.add ("fat");
		sifatcik.add ("new");
		sifatcik.add ("hot");
		sifatcik.add ("ugly");
		
		
		int sayi = rnd.nextInt(isimcik.size());
		int sayi1 = rndm.nextInt(sifatcik.size());
		String birinci = isimcik.get(sayi);
		String ikinci = sifatcik.get(sayi1);
		return ikinci + " " + birinci ;
		
		
	}

}
