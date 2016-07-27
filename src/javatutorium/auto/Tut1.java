package javatutorium.auto;

public class Tut1 {
	public static void main(String[] args) {
		// System.out.println(doubleInteger(46));

		Auto polo = new Auto(123);
		polo.setMotorleistung(111);
		polo.setMotorleistung(150);

		Auto up = new Auto(20);
		up.setMotorleistung(240);
		System.out.println("Der VW Polo hat " + polo.getMotorleistung() + " kW!");
		System.out.println("Der VW Up hat " + up.getMotorleistung() + " kW!");
	}

	public static int doubleInteger(int zahl) {
		return zahl * 2;
	}
}
