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
	 * M�todo status criado para cuidar da impress�o dos atributos do Objeto Caneta 
	 */
	public void status(){
		
		System.out.println("Carga:" + this.carga);
		System.out.println("Cor: " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Tampada: " + this.tampada);
	}
	
	/*
	 * M�todo criado para verificar se a caneta est� tampada ou n�o para poder rabiscar.
	 */
	public void rabiscar(){
		
		if(tampada == true){
			System.out.println("N�o pode rabiscar.");
		} else {
			System.out.println("Rabisco.");
		}
	}
	
	/*
	 * M�todo tampar criado para verificar se a Caneta est� tampada ou n�o.
	 * OBS: THIS sempre faz referencia ao objeto que foi chamado.
	 * Exemplo: Na Classe InsctanciarCaneta quando eu chamo c2.tampar(); estou chamando na verdade this.tampar();
	 * que est� fazendo a refer�ncia.
	 */
	public void tampar(){
		
		this.tampada = true;
	
	}
	
	/*
	 * Mesmo refer�ncia que o m�todo tampar s� q verificar o contr�rio.
	 */
	public void destampar(){
	
		this.tampada = false;
		
	}
	
}
