package Amir.gl42;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class saisieRPN {
	private Scanner scan;
	private String expression;
    private String pattern_operandeD, pattern_operateur,pattern_operandeI;
    private MoteurRPN moteur;
    private Map<String,Commande> commande;

	public saisieRPN() {
		this.scan = new Scanner(System.in);
		pattern_operandeD = "\\d+?.\\d+?";
		pattern_operandeI = "\\d+?";
		pattern_operateur = "(\\+|\\-|\\*|\\/)";
		moteur = new MoteurRPN();


	}
	
	public String Interaction() {
		System.out.print("Entrez operande ou operateur : ");
		expression = scan.nextLine();
		if(expression.equals("exit")) {
			System.exit(0);
			return expression;
		}
		if(expression.equals("")) {
			System.out.println("vous n'avez rien saisi");
			return null;
		}
		else if(Pattern.matches(pattern_operandeD, expression) || Pattern.matches(pattern_operandeI, expression) || Pattern.matches("\\-\\d?", expression)) {
			System.out.println("Nombre");
			return expression;
		}
		else if(Pattern.matches(pattern_operateur, expression)) {
			System.out.println("Operateur");
			return expression;
		}
		else if(expression.equals("undo")){
			System.out.println("retour etat precedant");
			return expression;
		}
		else return null;
		
	}
	
	public Number ToNumber(String expression) {
		if(Pattern.matches(pattern_operandeD,expression)) {
			return Double.valueOf(expression);
		}
		else if(Pattern.matches(pattern_operandeI,expression)) {
			return Integer.valueOf(expression);
		}
		else if(Pattern.matches("\\-\\d?", expression)) {
			return Double.valueOf(expression);
		}
		else this.Interaction();
	 return 0;
	}

}
