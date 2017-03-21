package Model;

public class Aluno extends Pessoa {
	
	private String matricula;
	private String dataIngresso;
	private Inscricao[] listar_incricao;
	
	public Aluno(String nome, String cpf, String dataNascimento, String matricula, String dataIngresso2){
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
		this.dataIngresso = dataIngresso2;
		listar_incricao = new Inscricao[10];
	}
	
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	public String getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
	
	public int AdicionaInscricoes(Inscricao inscricoes){
			
		if(RevisaInscricao(inscricoes)){
			AdicionaNovaInscricao(inscricoes);
		}else{
			return -1;
		}
		
		return 0;
	}
	
	public void AdicionaNovaInscricao(Inscricao inscricoes){
		
		if(RevisaInscricao(inscricoes)){
			
			int posicao_livre = -1;	
			boolean encontrou = false;
			for(int count = 0; count < listar_incricao.length; count++){
				if((listar_incricao[count] == null) && !encontrou){
					posicao_livre = count;
					encontrou = true;
				}
			
			}
		
			listar_incricao[posicao_livre] = inscricoes;
			inscricoes.setAluno(this);
		} else {
			System.out.println("Lista cheia.");
		}
		
	}
	
	public boolean RevisaInscricao(Inscricao inscricao){
		
		for(int count = 0; count < listar_incricao.length; count++){
		
			if(listar_incricao[count] == null){
				return true;
			}
		}
		
		return false;
	}

}
