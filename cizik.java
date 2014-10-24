package proje2;

public class cizik {
	public static void main(String geldi ) {
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
						geldi=geldi.substring(0, i)+" "+geldi.substring(i, geldi.length()-1);
						
					}
				}
				
			}
			System.out.println(geldi);
			
		}
		
	}

	

}
