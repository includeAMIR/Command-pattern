package Amir.gl42;

public class Quit implements Commande{
	private Interpreteur interpreteur = new Interpreteur();
	public Quit(Interpreteur interpreteur) {
		this.interpreteur = interpreteur;
	}
	public void exe() {
		// TODO Auto-generated method stub
		interpreteur.exit();
	}
}
