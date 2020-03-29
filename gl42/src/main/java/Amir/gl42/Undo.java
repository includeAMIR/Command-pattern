package Amir.gl42;

public class Undo implements Commande{
	private Interpreteur interpreteur = new Interpreteur();
	public Undo(Interpreteur interpreteur){
		this.interpreteur = interpreteur;
	}
	public void exe() {
		// TODO Auto-generated method stub
		interpreteur.undo();
	}

}
