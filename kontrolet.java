import java.util.ArrayList;

public class kontrolet {
	public static boolean kontol(String gelen, ArrayList<String> liste) {
		int i;

		ArrayList<String> list = liste;

		for (i = 0; i < list.size(); i++) {
			String tutac = list.get(i);
			return gelen.equals(tutac) ? false : true;

		}
		return gelen != null;

	}

}
