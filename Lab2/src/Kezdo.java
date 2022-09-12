
public class Kezdo extends Jatekos{
private String nev;


public Kezdo() {}

public Kezdo(String nev) {
	this.nev= new String();
	this.nev = nev;
}

public String toString() {
	return nev;
}

public void lep() {
	System.out.println( "Move by : " +toString());
	System.out.println( "Kor: " + asztal.getKor());
	System.out.println( "Tet: " + asztal.getTet());
	
	
	int korokSzama = asztal.getKor();
	
	if(korokSzama % 2 == 1) {
		System.out.println("Pass!");
	}
	else {
		System.out.println("Raise: +1 FT");
		asztal.emel(1);
	}
	
}

}
