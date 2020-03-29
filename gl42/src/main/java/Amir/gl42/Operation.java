package Amir.gl42;

public enum Operation {

	PLUS("+"){
		public Double eval (Double operande_gauche, Double operande_droite) {
			return operande_gauche + operande_droite;
		}
		
	},
	MOINS("-"){
		public Double eval(Double operande_gauche, Double operande_droite) {
			return operande_gauche - operande_droite;
		}
	},
	MULT("*"){
		public Double eval(Double operande_gauche, Double operande_droite) {
			return operande_gauche * operande_droite;
		}
	},
	DIV("/"){
		public Double eval(Double operande_gauche, Double operande_droite) {
			return operande_droite/operande_gauche;
		}
	};
	
	private String symbol;
	Operation(String symbol){
		this.setSymbol(symbol);
	}
	public abstract Double eval(Double operande_gauche, Double operande_droite);
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
