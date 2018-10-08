import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Rekeninghouder klant1 = new Rekeninghouder("Jan", "BA0012", 100);
		Rekeninghouder klant2 = new Rekeninghouder("Miep", "BA0896", 500);

		klant1.print();
		klant2.print();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Voer het op te nemen bedrag in: ");
		double bedrag = scanner.nextDouble();
		
		checkVoldoendeSaldo(klant1, bedrag);
		klant1.print();
		checkVoldoendeSaldo(klant2, bedrag);
		klant2.print();
	}

	public static void checkVoldoendeSaldo(Rekeninghouder persoon, double hetOpTeNemenBedrag) {
		if (persoon.saldo <= hetOpTeNemenBedrag) {
			System.out.println("Het saldo op de rekening van " + persoon.naam + " is onvoldoende");
		} else {
			persoon.saldo -= hetOpTeNemenBedrag;
			System.out.println("Na opname van " + hetOpTeNemenBedrag + " is het nieuwe saldo op de rekening van " + persoon.naam + ": " + persoon.saldo);
		}
	}

}

class Rekeninghouder {
	String naam;
	String rekeningnummer;
	double saldo;

	public Rekeninghouder(String deNaam, String hetRekeningnummer, double hetSaldo) {
		naam = deNaam;
		rekeningnummer = hetRekeningnummer;
		saldo = hetSaldo;

	}

	public void print() {
		System.out.printf("Naam: %s \t Rekeningnummer: %s \t Huidige saldo: %.2f \n", naam, rekeningnummer, saldo);

	}
}