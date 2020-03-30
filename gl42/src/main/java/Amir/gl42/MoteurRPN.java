package Amir.gl42;

import java.util.EmptyStackException;
import java.util.Stack;

public class MoteurRPN extends Interpreteur {
	public MoteurRPN(){
		super();
	}

	public Stack<Double> getStack(){
		return stack;
	}
	public void Push_operande(Double operande){
		this.stack.push(operande);
		this.historique.push(stack);
	}
	public void Pop() {
		if(this.stack.isEmpty()) {
			System.out.println("la pile est vide");
			throw new EmptyStackException();
		}
		else this.stack.pop();
	}
	public Double resultOperation(Operation operation) {
		Double ope_operande;
		 ope_operande = this.stack.push(operation.eval(this.stack.pop(), this.stack.pop()));
		 return ope_operande;
	}
}
