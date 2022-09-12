
public class Robot extends Jatekos {
private static int szamlalo=0;
private int azonosito;

public Robot() {
	szamlalo++;
	azonosito=szamlalo;
}

	public void lep() {
		System.out.println("Move by: " +toString());
		System.out.println(  "Tet: " + asztal.getTet());
		System.out.println("Kor:" +asztal.getKor());
		
	}
	public String toString() {
		return "Robot" +azonosito;
	}
}
