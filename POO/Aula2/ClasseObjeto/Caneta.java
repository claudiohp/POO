package ClasseObjeto;

public class Caneta {
	/*
	 * Criando os atributos para a Classe Caneta.
	 */
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	/*
	 * Método status criado para cuidar da impressão dos atributos do Objeto Caneta 
	 */
	public void status(){
		
		System.out.println("Carga:" + this.carga);
		System.out.println("Cor: " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Tampada: " + this.tampada);
	}
	
	/*
	 * Método criado para verificar se a caneta está tampada ou não para poder rabiscar.
	 */
	public void rabiscar(){
		
		if(tampada == true){
			System.out.println("Não pode rabiscar.");
		} else {
			System.out.println("Rabisco.");
		}
	}
	
	/*
	 * Método tampar criado para verificar se a Caneta está tampada ou não.
	 * OBS: THIS sempre faz referencia ao objeto que foi chamado.
	 * Exemplo: Na Classe InsctanciarCaneta quando eu chamo c2.tampar(); estou chamando na verdade this.tampar();
	 * que está fazendo a referência.
	 */
	public void tampar(){
		
		this.tampada = true;
	
	}
	
	/*
	 * Mesmo referência que o método tampar só q verificar o contrário.
	 */
	public void destampar(){
	
		this.tampada = false;
		
	}
	
}
