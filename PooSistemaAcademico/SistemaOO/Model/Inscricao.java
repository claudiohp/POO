package Model;

import java.util.Date;

public class Inscricao {
	
	private int id_inscricao;
	private String dataRealizacao;
	private String dataAprovacao;
	private int qtdlimite;
	private String periodoReferencia;
	private ItemInscricao [] listar_iteminscricao;
	private Aluno aluno;
	
	
	public Inscricao(int id_inscricao, String dataRealizacao, String dataAprovacao, int qtdlimite, String periodoReferencia){
		super();
		this.id_inscricao = id_inscricao;
		this.dataRealizacao = dataRealizacao;
		this.dataAprovacao = dataAprovacao;
		this.qtdlimite = qtdlimite;
		this.periodoReferencia = periodoReferencia;
		listar_iteminscricao = new ItemInscricao[10];
	}
	
	public int getId_incricao(){
		return id_inscricao;
	}
	
	public void setId_incricao(int id_inscricao){
		this.id_inscricao = id_inscricao;
	}

	public String getDataRealizacao(){
		return dataRealizacao;
	}
	
	public void setDataRealizacao(String dataRealizacao){
		this.dataRealizacao = dataRealizacao;
	}

	public String getDataAprovacao(){
		return dataAprovacao;
	}
	
	public void setDataAprovacao(String dataAprovacao){
		this.dataAprovacao = dataAprovacao;
	}
	
	public int getQtdlimite(){
		return qtdlimite;
	}
	
	public void setQtdlimite(int qtdlimite) {
		this.qtdlimite = qtdlimite;
	}

	public String getPeriodoReferencia(){
		return periodoReferencia;
	}

	public void setPeriodoReferencia( String periodoReferencia){
		this.periodoReferencia = periodoReferencia;
	}

	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		
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
			iteminscricao.setInscricao(this);
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
	