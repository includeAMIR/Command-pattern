package Amir.gl42;

import java.util.Stack;

public class Interpreteur {
	protected Stack<Double> stack;
	protected Stack <Stack<Double>> historique;
	public Interpreteur() {
		stack = new Stack<Double>();
		historique = new Stack<Stack<Double>>();
	}
	public void exit() {
		System.exit(0);
	}
	public void undo(){
		if(historique.size()>1){
			historique.pop();
			stack = historique.peek();
		}
		else System.out.println("historique vide");
	}
}
