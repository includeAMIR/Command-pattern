package Amir.gl42;

import java.util.regex.Pattern;

public enum CalculatriceRPN {
	CALCUL(){
		public void calcul() {
			String expression = this.getSaisieRPN().Interaction();
			while (!(expression.equals("exit"))) {
				if(expression.equals("exit")) {
					break;
				}
				else {
						if (Pattern.matches("[\\+\\-\\*\\/]",expression)) {
							if (this.getMoteurRPN().getStack().size() < 2) {
								System.out.println("entrez d'abord votre deuxieme operande");
								break;
							}
							Operation operation = null;
							if(expression.equals("+")) {
								operation = Operation.PLUS;
							}
							else if(expression.equals("-")) {
								operation = Operation.MOINS;
							}
							else if(expression.equals("*")) {
								operation = Operation.MULT;
							}
							else if(expression.equals("/")) {
								operation = Operation.DIV;
							}
							
								this.getMoteurRPN().resultOperation(operation);
								System.out.println(this.getMoteurRPN().getStack());
						}
						else if (Pattern.matches("\\d+?\\.\\d+?",expression) || Pattern.matches("\\d+?",expression) || Pattern.matches("\\-\\d?", expression)) {
							this.getMoteurRPN().Push_operande(Double.parseDouble(expression));
							System.out.println(this.getMoteurRPN().getStack());
						}
						else
							break;
				}
				expression = this.getSaisieRPN().Interaction();
				System.out.println(this.getMoteurRPN().getStack());
			}
		}
	};
	private MoteurRPN moteur;
	private saisieRPN saisie;


	CalculatriceRPN() {
		this.moteur = new MoteurRPN();
		this.saisie = new saisieRPN();
	}
	public MoteurRPN getMoteurRPN() {
		return this.moteur;
	}

	public saisieRPN getSaisieRPN() {
		return this.saisie;
	}
	abstract public void calcul();

}
