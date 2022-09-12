import java.util.Random;

public class Asztal {
private Jatekos[] jatekosok;
private double tet;
private int kor;
private double goal;
private int jatekosokSzama;

public Asztal(){
	jatekosok= new Jatekos[10];
	jatekosokSzama=0;
	ujJatek();
	
}

public void ujJatek() {
	tet=0;
	kor=0;
	Random r = new Random();
	goal= r.nextDouble()*100;
}

public void addJatekos(Jatekos j) {
	j.setAsztal(this);
	if(getJatekosokSzama()==10) {
		System.out.println("Table is full!");
	}
	else {
		jatekosok[getJatekosokSzama()]= j;
		AddOneToJatekosokSzama();
	}
}


public void emel(double d) {
	tet+=d;
}

public void kor() {
	kor+=1;
	boolean isWinner =false;
	
	int i =0;
	while(i < getJatekosokSzama()) {
		jatekosok[i].lep();
		if(getTet() > getGoal() && getTet() < 1.10 * getGoal()) {
		System.out.println("The winner is number" + i);	
		isWinner = true;
		break;
		}
		i++;
	}
	if(isWinner ==false) { 
		System.out.println("There is no Winner!");
	}
		
		
	System.out.println(getTet());
	System.out.println("Game over");
}

public double getTet() {return tet;}
public int getKor(){return kor;}
public double getGoal() {return goal;}
public int getJatekosokSzama(){return jatekosokSzama;}
private void AddOneToJatekosokSzama() { jatekosokSzama = jatekosokSzama + 1;}
}

