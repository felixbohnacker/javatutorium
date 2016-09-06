package javatutorium.exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		int i = 1;
		if (i == 2) {
			throw new IllegalArgumentException();
		}
	}

}
