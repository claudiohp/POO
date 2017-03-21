package Model;

public class ItemInscricao {

	private int id_item;
	private int nota;
	private boolean cancelado;
	private Inscricao inscricao;
	private Turma turma;
	
	public ItemInscricao(int id_item, int nota, boolean cancelado){
		super();
		this.id_item = id_item;
		this.nota = nota;
		this.cancelado = cancelado;
	
	}
	
	public ItemInscricao(int id) {
		// TODO Auto-generated constructor stub
	}

	public int getId_item(){
		return id_item;
	}
	
	public void setId_item(int id_item){
		this.id_item = id_item;
	}
	
	public int getNota(){
		return nota;
	}

	public void setNota(int nota){
		this.nota = nota;
	}

	public boolean getCancelado(){
		return cancelado;
	}
	
	public void setCancelado(boolean cancelado){
		this.cancelado = cancelado;
	}
	
	public Inscricao getInscricao() {
		return inscricao;
	}
	
	public void setInscricao(Inscricao inscricao) {
		
	}
	
	public void setTurma(Turma turma) {
		
	}
	
	public Turma getTurma() {
		return turma;
	}

	
}