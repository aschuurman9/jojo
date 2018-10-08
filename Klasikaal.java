
public class Klasikaal {
	public static void main (String[] args) {
	
		Leerling eenLeerling = new Leerling();
		System.out.println("naam: " + eenLeerling.naam + "\t leeftijd: " + eenLeerling.leeftijd + "\t geslaagd: " + eenLeerling.geslaagd);
		eenLeerling.naam = "Pietje";
		eenLeerling.leeftijd = 8;
		eenLeerling.geslaagd = true;
		System.out.println("naam: " + eenLeerling.naam + "\t leeftijd: " + eenLeerling.leeftijd + "\t geslaagd: " + eenLeerling.geslaagd);
	
		Leerling eenAndereLeerling = new Leerling();
		eenAndereLeerling.naam = "Klaasje";
		eenAndereLeerling.leeftijd = 7;
		eenAndereLeerling.geslaagd = false;
		System.out.println("naam: " + eenAndereLeerling.naam + "\t leeftijd: " + eenAndereLeerling.leeftijd + "\t geslaagd: " + eenAndereLeerling.geslaagd);
	
		Leerling weerEenAndereLeerling = new Leerling("Henk", 11,false);
		System.out.println("Naam: " + weerEenAndereLeerling.naam);
		System.out.println("Leeftijd: " + weerEenAndereLeerling.leeftijd);
		System.out.println("Geslaagd: " + weerEenAndereLeerling.geslaagd);
		
		weerEenAndereLeerling.isJarig();
		System.out.println(weerEenAndereLeerling.leeftijd);
//		isAlweerJarig(weerEenAndereLeerling);
		
	}
}

class Leerling{
	
	String naam;
	int leeftijd;
	boolean geslaagd;
	
	public Leerling(){
		
	}
	
	public Leerling (String eenNaam, int eenLeeftijd,boolean isGeslaagd) {
		naam = eenNaam;
		leeftijd = eenLeeftijd;
		geslaagd = isGeslaagd;
	} 
	
	public int isJarig() {
		leeftijd++;
		return leeftijd;
	}
	
	public int isAlweerJarig(Leerling deLeerling) {
		leeftijd++;
		return leeftijd;
	}
}
