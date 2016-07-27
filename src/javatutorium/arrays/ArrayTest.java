package javatutorium.arrays;

public class ArrayTest {

	// args ist ein String-Array
	public static void osterhasenfabrik(int alter, String... args) {
		String[] neuesarray = { "osterhase", "weihnachtsmann", "lehmann" };

		for (String string : neuesarray) {
			System.out.println(string);
		}

		for (int i = 0; i < neuesarray.length; i++) {
			String string = neuesarray[i];
			System.out.println(string);
		}

		int[][] schiffeversenken = new int[4][4];
		schiffeversenken[0][0] = 1;
		schiffeversenken[0][1] = 1;

		String[] kopie = neuesarray.clone();

	}

}
