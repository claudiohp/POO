package View;

import java.util.Scanner;

import Controller.ManipulaAluno;
import Controller.ManipulaAssociacoes;
import Controller.ManipulaDisciplina;
import Controller.ManipulaInscricao;
import Controller.ManipulaProfessor;
import Controller.ManipulaTurma;
import Model.Aluno;
import Model.Disciplina;
import Model.Inscricao;
import Model.ItemInscricao;
import Model.Professor;
import Model.Turma;

public class MainApp {
	
	public static Aluno[] listaA;
	public static Professor[] listaP;
	public static Disciplina[] listaD;
	public static Turma[] listaT;
	public static Inscricao[] listaI;
	public static ItemInscricao[] listaIt;
	
	//MÉTODO PARA LISTAR ARRAYS E ESTRUTURA PARA CHAMAR OPÇÕES DE CLASSES.
	public static void main(String[] args) {
		
		listaA = new Aluno[10];
		listaP = new Professor[10];
		listaD = new Disciplina[10];
		listaT = new Turma[10];
		listaI = new Inscricao[10];
		
		int opcao;
		 	
		 	do{
		 		opcao = opcaoMenuPrincipal();
			
		 		switch(opcao){
			
					case 1:
						cadastroAluno();
						break;
						
					case 2:
						cadastroProfessor();	
						break;
					
					case 3:
						cadastroDisciplina();	
						break;
						
					case 4:
						cadastroTurma();
						break;
					
					case 5:
						cadastroInscricao();
						break;
						
					case 6:
						CriaAssociacoes();
						break;
						
					case 7:
						listarAlunoDeTurma();
						break;
						
					case 8:
						listarProfessorDisciplina();
						break;
					
					case -1:
						System.out.println("Fim.");
						break;
					
					default:
						System.out.println("Opção inválida.");
		 		}
	
		 	} while(opcao !=-1);
		 		System.out.println("Fim.");
			 	
	}


	//MENU PRINCIPAL TELA DE IMPRESSÃO.
	private static int opcaoMenuPrincipal() {
		
		System.out.println("####SISTEMA ACADÊMICO###");
		System.out.println("#################################");
		System.out.println("#####B E M  V I N D O	! !#######");
		System.out.println("#################################");
		System.out.println("#################################");
		System.out.println("");
		System.out.println("1 - CADASTRO ALUNOS;");
		System.out.println("2 - CADASTRO PROFESSORES;;");
		System.out.println("3 - CADASTRO DISCIPLINAS;");
		System.out.println("4 - CADASTRO TURMAS;");
		System.out.println("5 - REALIZAR INSCRIÇÃO;");
		System.out.println("6 - CRIAR ASSOCIAÇÕES;");
		System.out.println("7 - LISTAR ALUNOS DE UMA TURMA;");
		System.out.println("8 - LISTAR PROFESSORES DE UMA DISCIPLINA;");
		System.out.println("#(para sair digite -1)#");
		System.out.println("#################################");
		System.out.println("Opção Desejada: ");
		
		Scanner t = new Scanner(System.in);
		int opcao = t.nextInt();
		
		return opcao;
	}
	
	
	//TODOS OS MÉTODOS USADOS PARA A CLASSE ALUNO.
	private static void cadastroAluno() {
		
		int opcao;
		
		do{
			
			opcao = MenuCadastroAluno();
		
			switch(opcao){
				case 1:
					ManipulaAluno.AlunoAdiciona(listaA);
					break;
					
				case 2:
					ManipulaAluno.AlunoLista(listaA);
					break;
					
				case 3:
					ManipulaAluno.AlunoLocaliza(listaA);
					break;
					
				case -1: 
					System.out.println("##### saindo de Menu Aluno.");
					break;
					
				default:
					System.out.println("Opção inválida.");
		
		
			} 
		}while(opcao!=1);
	}

	private static int MenuCadastroAluno() {
		
		System.out.println("====MODULO DE CADASTRO DE ALUNOS===");
		System.out.println("");
		System.out.println("1 - CADASTRAR ALUNO;");
		System.out.println("2 - LISTAR ALUNOS;;");
		System.out.println("3 - LOCALIZAR ALUNOS;;");
		System.out.println("");
		System.out.println("(para sair digite -1)");
		System.out.println("==================================");
		System.out.println("Opção Desejada: ");
		
		Scanner t = new Scanner(System.in);
		int opcao = t.nextInt();
  
		return opcao;
	}
	
	//TODOS OS MÉTODOS USADOS PARA A CLASSE PROFESSOR.
	private static void cadastroProfessor() {
		
		int opcao;
		
		do{
			
			opcao = MenuCadastroProfessor();
		
			switch(opcao){
				case 1:
					ManipulaProfessor.ProfessorAdiciona(listaP);
					break;
					
				case 2:
					ManipulaProfessor.ProfessorLista(listaP);
					break;
					
				case 3:
					ManipulaProfessor.ProfessorLocaliza(listaP);
					break;
					
				case -1: 
					System.out.println("##### saindo de Menu Professor.");
					break;
					
				default:
					System.out.println("Opção inválida.");
		
			} 
		}while(opcao!=1);
	}
		
	
	
	private static int MenuCadastroProfessor() {
		System.out.println("====MODULO DE CADASTRO DE PROFESSORES===");
		System.out.println("");
		System.out.println("1 - CADASTRAR PROFESSOR;");
		System.out.println("2 - LISTAR PROFESSORES;;");
		System.out.println("3 - LOCALIZAR PROFESSORES;;");
		System.out.println("");
		System.out.println("(para sair digite -1)");
		System.out.println("==================================");
		System.out.println("Opção Desejada: ");
		
		Scanner t = new Scanner(System.in);
		int opcao = t.nextInt();
  
		return opcao;
	}
	
	//TODOS OS MÉTODOS USADOS PARA A CLASSE DISCIPLINA.
	private static void cadastroDisciplina() {
		
	int opcao;
		
		do{
			
			opcao = MenuCadastroDisciplina();
		
			switch(opcao){
				case 1:
					ManipulaDisciplina.DisciplinaAdiciona(listaD);
					break;
					
				case 2:
					ManipulaDisciplina.DisciplinaLista(listaD);
					break;
					
				case 3:
					ManipulaDisciplina.DisciplinaLocaliza(listaD);
					break;
					
				case -1: 
					System.out.println("##### saindo de Menu Disciplina.");
					break;
					
				default:
					System.out.println("Opção inválida.");
		
			} 
		}while(opcao!=1);
	}
	
	private static int MenuCadastroDisciplina() {
		System.out.println("====MODULO DE CADASTRO DE DISCIPLINAS===");
		System.out.println("");
		System.out.println("1 - CADASTRAR DISCIPLINA;");
		System.out.println("2 - LISTAR DISCIPLINAS;;");
		System.out.println("3 - LOCALIZAR DISCIPLINAS;;");
		System.out.println("");
		System.out.println("(para sair digite -1)");
		System.out.println("==================================");
		System.out.println("Opção Desejada: ");
		
		Scanner t = new Scanner(System.in);
		int opcao = t.nextInt();
  
		return opcao;
	}
	
	//TODOS OS MÉTODOS USADOS PARA A CLASSE TURMA.
	private static void cadastroTurma() {
	
		int opcao;
		
		do{
			
			opcao = MenuCadastroTurma();
		
			switch(opcao){
				case 1:
					ManipulaTurma.TurmaAdiciona(listaT);
					break;
					
				case 2:
					ManipulaTurma.TurmaLista(listaT);
					break;
				
				case 3:
					ManipulaTurma.TurmaLocaliza(listaT);
					break;
					
				case -1: 
					System.out.println("##### saindo de Menu Turma.");
					break;
				default:
					System.out.println("Opção inválida.");
		
			} 
		}while(opcao!=1);
		
		
	}
	
	private static int MenuCadastroTurma() {
		System.out.println("====MODULO DE CADASTRO DE TURMAS===");
		System.out.println("");
		System.out.println("1 - CADASTRAR TURMA;");
		System.out.println("2 - LISTAR TURMAS;;");
		System.out.println("3 - LOCALIZAR TURMAS;;");
		System.out.println("");
		System.out.println("(para sair digite -1)");
		System.out.println("==================================");
		System.out.println("Opção Desejada: ");
		
		Scanner t = new Scanner(System.in);
		int opcao = t.nextInt();
  
		return opcao;
	}
	
	//TODOS OS MÉTODOS USADOS PARA A CLASSE INSCRICAO.
	
	private static void cadastroInscricao() {
		

		int opcao;
		
		do{
			
			opcao = MenuCadastroInscricao();
		
			switch(opcao){
				case 1:
					ManipulaInscricao.InscricaoAdiciona(listaI);
					break;
					
				case 2:
					ManipulaInscricao.InscricaoLista(listaI);
					break;
				
				case 3:
					ManipulaInscricao.InscricaoLocaliza(listaI);
					break;
					
				case 4:
					ManipulaInscricao.ItemInscricaoAdiciona(listaIt);
					
				case -1: 
					System.out.println("##### saindo de Menu Inscrição.");
					break;
				default:
					System.out.println("Opção inválida.");
		
			} 
		}while(opcao!=1);
		
		
	}
	
	private static int MenuCadastroInscricao() {
		System.out.println("====MODULO DE CADASTRO DE INSCRICAO===");
		System.out.println("");
		System.out.println("1 - CADASTRAR INSCRICAO;");
		System.out.println("2 - LISTAR INSCRICOES;;");
		System.out.println("3 - LOCALIZAR INSCRICOES;;");
		System.out.println("4 - CADASTRAR ITENS DE INSCRICAO;;");
		System.out.println("");
		System.out.println("(para sair digite -1)");
		System.out.println("==================================");
		System.out.println("Opção Desejada: ");
		
		Scanner t = new Scanner(System.in);
		int opcao = t.nextInt();
  
		return opcao;
	}
	
	
	//TODOS OS MÉTODOS USADOS PARA A CLASSE ASSOCIACOES.
	private static void CriaAssociacoes() {
	
		int opcao;
		
		do{
			
			opcao = MenuCriaAssociacoes();
		
			switch(opcao){
				case 1:
					
					ManipulaAssociacoes.relacionaAlunoComInscricoes(listaA, listaI);;
					break;
					
				case 2:
					
					ManipulaAssociacoes.relacionaDisciplinaComProfessor(listaD, listaP);
					break;
				
				case 3:
					
					ManipulaAssociacoes.relacionaDisciplinaComTurma(listaD, listaT);
					break;
					
				case 4:
					
					ManipulaAssociacoes.relacionaProfessorComTurma(listaP, listaT);
					break;
					
				case 5:
					ManipulaAssociacoes.relacionaInscricaoComTurma(listaI, listaT);
					
				case -1: 
					System.out.println("##### saindo de Menu Inscrição.");
					break;
				default:
					System.out.println("Opção inválida.");
		
			} 
		}while(opcao!=1);
		
	}
	
		private static int MenuCriaAssociacoes() {
		System.out.println("====MODULO DE ASSOCIAÇÕES===");
		System.out.println("");
		System.out.println("1 - Aluno - Inscricao");
		System.out.println("2 - Disciplina - Turma;");
		System.out.println("3 - Disciplina - Professor;");
		System.out.println("4 - Professor - Turma;");
		System.out.println("5 - Inscricão - Turma;");
		System.out.println("");
		System.out.println("(para sair digite -1)");
		System.out.println("==================================");
		System.out.println("Opção Desejada: ");
		
		Scanner t = new Scanner(System.in);
		int opcao = t.nextInt();
  
		return opcao;
	}			
	
	
	//MÉTODO USADO PARA LISTAR ALUNO DE TURMA.	
	private static void listarAlunoDeTurma() {
		
		ManipulaAssociacoes.ExibeListaAlunosDeTurma(listaT);;
		
	}


	//MÉTODO USADO PARA LISTAR PROFESSOR DE DISCIPLINA.	
	private static void listarProfessorDisciplina() {
		
		ManipulaAssociacoes.ExibeListaProfessoresDisciplina(listaD);
	}
}

	