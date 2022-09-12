
public class Main {

	public static void main (String[] args) {
		Asztal asztal= new Asztal();
		Kezdo K1= new Kezdo("Bela");
		Kezdo K2= new Kezdo("Andras");
		Robot R1= new Robot();
		Robot R2= new Robot();
		
		asztal.addJatekos(K1);
		asztal.addJatekos(K2);
		asztal.addJatekos(R1);
		asztal.addJatekos(R2);
		
		System.out.println("The goal is: "+asztal.getGoal() );
		for(int rounds=0; rounds <3; rounds++) {
			asztal.kor();
		}
		
	}
	
}
