package Controller;

import java.util.Scanner;

import Model.Aluno;
import Model.Disciplina;
import Model.Inscricao;
import Model.ItemInscricao;
import Model.Professor;
import Model.Turma;

public class ManipulaAssociacoes {
	
		public static void relacionaAlunoComInscricoes(Aluno[] listaA, Inscricao[] listaI){
		
			
			Aluno a = ManipulaAluno.AlunoLocaliza(listaA);
			
			if(a != null){
				
				Inscricao insc = ManipulaInscricao.InscricaoLocaliza(listaI);
				
					if(insc != null){
						
						a.AdicionaInscricoes(insc);
					
					} else{
						
						System.out.println("Não foi possível inserir associação - Inscricoes não encontrada.");
					}
			} else{
				
				System.out.println("Não foi possível inserir associação - Inscricoes não encontrada.");
			 }
		}
		
		public static void relacionaDisciplinaComTurma(Disciplina[] listaD, Turma[] listaT){
		
			
			Disciplina d = ManipulaDisciplina.DisciplinaLocaliza(listaD);
			
				if(d != null){
				
					Turma t = ManipulaTurma.TurmaLocaliza(listaT);
				
						if(t != null){
							d.AdicionaTurma(t);
						} else{
							
							System.out.println("Não foi possível inserir associação - Turma não encontrada.");
						}
				}else{
				
				System.out.println("Não foi possível inserir associação - Turma não encontrada.");
				}
		}
		
		public static void relacionaDisciplinaComProfessor(Disciplina[] listaD, Professor[] listaP){
		
			Disciplina d = ManipulaDisciplina.DisciplinaLocaliza(listaD);
			
			if(d != null){
				
				Professor p = ManipulaProfessor.ProfessorLocaliza(listaP);
				
					if(p != null){
						
						d.AdicionaProfessor(p);
					
					} else{
						
						System.out.println("Não foi possível inserir associação - Professor não encontrado.");
					}
			} else{
				
				System.out.println("Não foi possível inserir associação - Professor não encontrado.");
			 }
		}
		
		public static void relacionaProfessorComTurma(Professor[] listaP, Turma[] listaT){
		
			
			Professor p = ManipulaProfessor.ProfessorLocaliza(listaP);
			
			if(p != null){
				
				Turma t = ManipulaTurma.TurmaLocaliza(listaT);
				
					if(t != null){
						
						p.AdicionaTurma(t);
					
					} else{
						
						System.out.println("Não foi possível inserir associação - Turma não encontrada.");
					}
			} else{
				
				System.out.println("Não foi possível inserir associação - Turma não encontrada.");
			 }
		}
	
		public static void relacionaInscricaoComTurma(Inscricao[] listaI, Turma[] listaT){
		
			
			Inscricao insc = ManipulaInscricao.InscricaoLocaliza(listaI);
			Turma t = ManipulaTurma.TurmaLocaliza(listaT);
			
			if(insc != null){
				
				
				Scanner t1 = new Scanner(System.in);
				System.out.println();
				System.out.println("Digite o id_item_inscrição: ");		
				int id = t1.nextInt();
				ItemInscricao it_insc = new ItemInscricao(id);
				insc.AdicionaItemInscricao(it_insc);
				t.AdicionaItemInscricao(it_insc);
				
			} else{
						
						System.out.println("Não foi possível inserir associação - Turma não encontrada.");
					}
			} 
		
		
		
		public static void ExibeListaAlunosDeTurma( Turma[] listaT){
			
			Turma t = ManipulaTurma.TurmaLocaliza(listaT);
		
			ItemInscricao [] listar_iteminscricao = t.getListar_iteminscricao();
		
			
			boolean esta_vazia = true;
			
			for(int count = 0; count < listar_iteminscricao.length; count++){
					if(listar_iteminscricao[count] == null){
						
					}else{
						esta_vazia = false;
						System.out.println( count + " - " + 
						(listar_iteminscricao[count].getInscricao().getAluno().getNome()));
					
					}
			}
			
			if(esta_vazia){
					
				System.out.println("Lista vazia.");
			}
			
			
			
		}

		public static void ExibeListaProfessoresDisciplina(Disciplina [] listaD){
		
			Disciplina d = ManipulaDisciplina.DisciplinaLocaliza(listaD);
			
			ManipulaProfessor.ProfessorLista(d.getListar_professor());
}
}