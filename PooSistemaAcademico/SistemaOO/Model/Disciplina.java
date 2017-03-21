package Model;

public class Disciplina {
	
	private String codigo;
	private String nome;
	private int cargaHorariaSemana;
	private Turma [] listar_turma;
	private Professor [] listar_professor;
	private Professor professor;
	
	public Disciplina ( String codigo, String nome, int cargaHorariaSemana){
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHorariaSemana = cargaHorariaSemana;
		listar_professor = new Professor[10];
		listar_turma = new Turma[10];
	}

	public String getCodigo(){
		return codigo;
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	
	public int getCargaHorariaSemana(){
		return cargaHorariaSemana;
	}
	
	public void setCargaHorariaSemana(int cargaHorariaSemana){
		this.cargaHorariaSemana = cargaHorariaSemana;
	}
	
	
	public Professor getProfessor(){
		return professor;
	}
	
	public Professor[] getListar_professor() {
		return listar_professor;
	}

	public void setListar_professor(Professor[] listar_professor) {
		this.listar_professor = listar_professor;
	}

	public int AdicionaProfessor(Professor professor){
		
		if(RevisaProfessor(professor)){
			AdicionaProfessor(professor);
		}else{
			return -1;
		}
		
		return 0;
	}
	
	public void AdicionaNovoProfessor(Professor professor){
		
		if(RevisaProfessor(professor)){
			
			int posicao_livre = -1;	
			boolean encontrou = false;
			for(int count = 0; count < listar_professor.length; count++){
				if((listar_professor[count] == null) && !encontrou){
					posicao_livre = count;
					encontrou = true;
				}
			
			}
		
			listar_professor[posicao_livre] = professor;
			professor.setDisciplina(this);
		} else {
			System.out.println("Lista cheia.");
		}
		
	}
	
	public boolean RevisaProfessor(Professor professor){
		
		for(int count = 0; count < listar_professor.length; count++){
		
			if(listar_professor[count] == null){
				return true;
			}
		}
		
		return false;
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
			turma.setDisciplina(this);
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
