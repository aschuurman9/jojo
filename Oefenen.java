
public class Oefenen {
	public static void main (String[] args) {
		Deelnemer sollicitant1 = new Deelnemer();
		sollicitant1.vullen(true,60, 25);
		Deelnemer sollicitant2 = new Deelnemer();
		sollicitant2.vullen(false,55, 25);
		aannemen(sollicitant1);
		aannemen(sollicitant2);
	}
	static void aannemen(Deelnemer deelnemer) {
		if(deelnemer.geschiktePersoonlijkheid && deelnemer.ta >= 55 && deelnemer.leeftijd<35) {
			System.out.println("U bent aangenomen");
		} else {
			System.out.println("U bent niet aangenomen");
		}
	}
}

class Deelnemer{
	boolean geschiktePersoonlijkheid;
	int ta;
	int leeftijd;
	
	void vullen(boolean gp, int tu, int deLeeftijd) {
		geschiktePersoonlijkheid = gp;
		ta = tu;
		leeftijd = deLeeftijd;
	}
}

// Aantekening