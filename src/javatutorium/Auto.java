package javatutorium;

public class Auto { // <= Klasse :)

	// 1. Attribute / Objekteigenschaften
	private double motorleistung;

	// 2. Methoden
	public Auto(int leistung) {
		this.motorleistung = leistung;
	}

	public void setMotorleistung(double zahl) {
		if (zahl < 0) {
			System.out.println("Dieses Auto hat eine negative Leistung");
		} else {
			this.motorleistung = zahl;
		}
	}

	public double getMotorleistung() {
		return this.motorleistung;
	}
}
