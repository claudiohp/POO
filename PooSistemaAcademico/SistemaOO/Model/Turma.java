package Model;

import java.util.Date;

public class Turma {
	
	private String codigo;
	private String qtdVagas;
	private String diasdaSemana;
	private String horaInicio;
	private String horaFinal;
	private String periodoReferencia;
	private ItemInscricao [] listar_iteminscricao;
	private Professor professor;
	private Disciplina disciplina;
	
	public Turma(String codigo, String qtdVagas, String diasdaSemana, String horaInicio, String horaFinal, String periodoReferencia){
		super();
		this.codigo = codigo;
		this.qtdVagas = qtdVagas;
		this.diasdaSemana = diasdaSemana;
		this.horaInicio = horaInicio;
		this. horaFinal = horaFinal;
		this.periodoReferencia = periodoReferencia;
		listar_iteminscricao = new ItemInscricao[10];
	}
	
	public String getCodigo(){
		return codigo;
	}

	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	
	public String getQtdVagas(){
		return qtdVagas;
	}
	
	public void setQtdVagas(String qtdVagas){
		this.qtdVagas = qtdVagas;
	}
	
	public String getDiasdeSemana(){
		return diasdaSemana;
	}
	
	public void setDiasdeSemana(String diasdeSemana){
	this.diasdaSemana = diasdeSemana;
	}
	
	public String getHoraInicio(){
		return horaInicio;
	}
	
	public void setHoraInicio(String horaInicio){
		this.horaInicio = horaInicio;
	}
	
	public String getHoraFinal(){
		return horaFinal;
	}
	
	public void setHoraFinal(String horaFinal){
		this.horaFinal = horaFinal;
	}
	
	public String getPeriodoReferencia(){
		return periodoReferencia;
	}
	
	public void setPeriodoReferencia(String periodoReferencia){
		this.periodoReferencia = periodoReferencia;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public ItemInscricao[] getListar_iteminscricao() {
		return listar_iteminscricao;
	}

	public void setListar_iteminscricao(ItemInscricao[] listar_iteminscricao) {
		this.listar_iteminscricao = listar_iteminscricao;
	}
	
	
	
	

	public int AdicionaItemInscricao(ItemInscricao iteminscricao){
		
		if(RevisaItemInscricao(iteminscricao)){
			AdicionaNovoItemInscricao(iteminscricao);
		}else{
			return -1;
		}
		
		return 0;
	}
	
	public void AdicionaNovoItemInscricao(ItemInscricao iteminscricao){
		
		if(RevisaItemInscricao(iteminscricao)){
			
			int posicao_livre = -1;	
			boolean encontrou = false;
			for(int count = 0; count < listar_iteminscricao.length; count++){
				if((listar_iteminscricao[count] == null) && !encontrou){
					posicao_livre = count;
					encontrou = true;
				}
			
			}
		
			listar_iteminscricao[posicao_livre] = iteminscricao;
			iteminscricao.setTurma(this);
		} else {
			System.out.println("Lista cheia.");
		}
		
	}
	
	public boolean RevisaItemInscricao(ItemInscricao iteminscricao){
		
		for(int count = 0; count < listar_iteminscricao.length; count++){
		
			if(listar_iteminscricao[count] == null){
				return true;
			}
		}
		
		return false;
	}


}
	
	
