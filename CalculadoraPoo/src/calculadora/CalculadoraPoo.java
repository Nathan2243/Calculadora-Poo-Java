package calculadora;

import java.util.Scanner;

public class CalculadoraPoo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Calculadora c = new Calculadora(0, 0);
		
		// metodo do operador a ser acionado
		c.setOperador();
		// operadores
		c.operadorAdicao();
		c.operadorSubtracao();
		c.operadorMultiplicacao();
		c.operadorDivisao();
	}

}
