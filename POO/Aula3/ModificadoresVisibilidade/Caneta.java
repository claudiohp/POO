package ModificadoresVisibilidade;

public class Caneta {
	
	/*
	 * Modificadores de visibilidade. 
	 * 
	 * Publico (+) = Todos os atributos e métodos podem ser acessados por qualquer outra classe. 
	 * Privado (-) = Só podem ser acessados dentro da sua classe.
	 * Protegido # = Acesso a sua classe e suas sublassses.
	 */
	
	// Exemplos de modificadores de visibilidades.
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status(){
		
		System.out.println("Carga:" + this.carga);
		System.out.println("Cor: " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Tampada: " + this.tampada);
	}

	
	public void rabiscar(){
		
		if(tampada == true){
			System.out.println("Não pode rabiscar.");
		} else {
			System.out.println("Rabisco.");
		}
	}
	
	protected void tampar(){
		
		this.tampada = true;
	
	}
	
	protected void destampar(){
		
		this.tampada = false;
		
	}
	
}
