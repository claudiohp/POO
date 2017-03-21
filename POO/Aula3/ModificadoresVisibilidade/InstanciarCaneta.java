package ModificadoresVisibilidade;

public class InstanciarCaneta {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		/*
		 * Atributos publicos podem ser acessados normalmente por qualquer classe.
		 */

		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";

		/*
		 *  Atributos privados n�o podem ser chamados por uma classe externa normalmente igual p�blico.
		 *  
		 */
//		c1.ponta = 0.5f;

		/*
		 * Carga � aceita porque est� fazendo refer�ncia ao Objeto da Classe Caneta ai ele libera, mas quando
		 * se referencia a outra classe ele protege.
		 */
		c1.carga = 10;
		
		/*
		 * Exemplo m�todos colocados como p�blicos, podem ser acessados normalmente.
		 */
		c1.rabiscar();
		c1.tampar();
		c1.status();
	}
	
}
