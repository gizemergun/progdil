package proje2;

import java.util.Scanner;

public class cizik {
	public static void main(String[] args ) {
		Scanner geldi = new Scanner(System.in);
		String cumle;

		System.out.println("lutfen cumle giriniz");
		cumle = geldi.next();
		
		int i = 1;
		String tutac;
		String tutac1;
		String tutac2;
		for( i=1; i < ( geldi.length()-1) ; i++ ) {
			tutac = geldi.substring(i, i+1);
			if( tutac.equals("_") ) {
				tutac1 = geldi.substring(i-1, i);
				tutac2 = geldi.substring(i+1, i+2);
				if(tutac1 != "_"){
					if(tutac2 !="_"){
						cumle=cumle.substring(0, i)+" "+cumle.substring(i+1, cumle.length());
						
					}
				}
				
			}
			System.out.println(cumle);
			
		}
		
	}

	

}
