package Model;


public class Professor extends Pessoa {
	
	private String matricula;
	private String salario;
	private String dataContratacao;
	private Turma [] listar_turma;
	private Disciplina disciplina;
	
	public Professor(String nome, String CPF, String dataNascimento,String matricula, String salario, String dataContratacao){
		super(nome, CPF, dataNascimento);
		this.matricula = matricula;
		this.salario = salario;
		this.dataContratacao = dataContratacao;
		listar_turma = new Turma[10];
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getSalario(){
		return salario;
	}
	
	public void setSalario(String salario){
		this.salario = salario;
	}
	
	public String getdataContatacao(){
		return dataContratacao;
	}
	
	public void setdaContratacao(String dataContratacao){
		this.dataContratacao = dataContratacao;
	}
	
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}


	public int AdicionaTurma(Turma turma){
		
		if(RevisaTurma(turma)){
			AdicionaNovaTurma(turma);
		}else{
			return -1;
		}
		
		return 0;
	}
	
	public void AdicionaNovaTurma(Turma turma){
		
		if(RevisaTurma(turma)){
			
			int posicao_livre = -1;	
			boolean encontrou = false;
			for(int count = 0; count < listar_turma.length; count++){
				if((listar_turma[count] == null) && !encontrou){
					posicao_livre = count;
					encontrou = true;
				}
			
			}
		
			listar_turma[posicao_livre] = turma;
			turma.setProfessor(this);
		} else {
			System.out.println("Lista cheia.");
		}
		
	}
	
	public boolean RevisaTurma(Turma turma){
		
		for(int count = 0; count < listar_turma.length; count++){
		
			if(listar_turma[count] == null){
				return true;
			}
		}
		
		return false;
	}

	
	
}	
	


	