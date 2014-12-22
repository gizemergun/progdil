

import java.util.Scanner;

public class cizik {
	public static void main(String[] args ) {
		Scanner geldi = new Scanner(System.in);
		String cumle;
		System.out.println("lutfen cumle giriniz");
		cumle = geldi.next();
		
		int i = 1;
		String tutac;
		String on;
		String arka;
		for ( i=1; i < ( cumle.length()-1) ; i++ ) {
		//tutac = cumle.substring(i, i+1) ;
			if ( cumle.substring(i, i+1).equals("_") ){
				on = cumle.substring(i-1, i) ;
				arka = cumle.substring(i+1, i+2) ;
				if (( ! on.equals("_") )) {
					if(  arka.equals("_") ){
						
						cumle = cumle.substring(0, i)+"  "+cumle.substring(i+1+j, cumle.length()) ;
						j++;
					}
				
					else
						cumle = cumle.substring(0, i)+" "+cumle.substring(i+1, cumle.length()) ;
						
					
				}
				
			}
			
		}
			System.out.println(cumle);
			
		}
		
	}

	

}
