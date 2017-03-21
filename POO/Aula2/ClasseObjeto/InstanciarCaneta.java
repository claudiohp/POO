package ClasseObjeto;

public class InstanciarCaneta {
	
	public static void main(String[] args) {
			/*
			 * Instanciação da Classe Caneta definindo um atributo de nome c1.
			 */
			Caneta c1 = new Caneta();
			
			/*
			 * Atribuindo valores a Caneta.
			 */
			c1.carga = 10;
			c1.cor = "azul";
			c1.modelo = "BIC";
			c1.ponta = 0.5f;
			
			/*
			 * Chamando os métodos da Classe destampar para dizer os estados da Caneta. 
			 */
			c1.destampar();
			c1.rabiscar();
			c1.status();
			System.out.println();
			
			Caneta c2 = new Caneta();
			c2.carga = 10;
			c2.cor ="Vermelha";
			c2.modelo = "Trojan";
			c2.ponta = 0.7f;	
			c2.tampar();
			c2.rabiscar();
			c2.status();
			
				
			}
	}

