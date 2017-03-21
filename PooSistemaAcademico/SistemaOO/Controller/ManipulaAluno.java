package Controller;

import java.util.Scanner;

import Model.Aluno;

public class ManipulaAluno {

	
	public static void AlunoAdiciona(Aluno [] listaAluno){
		
		String nome, CPF, dataNascimento,matricula, dataIngresso;
		
		if(AlunoListaNaoCheia(listaAluno)){
			
			Scanner t = new Scanner(System.in);
			System.out.println("Digite o nome: ");
			nome = t.nextLine();
			System.out.println("Digite o CPF: ");
			CPF = t.nextLine();
			System.out.println("Digite a data de nascimento: ");
			dataNascimento = t.nextLine();
			System.out.println("Digite a matrícula: ");
			matricula = t.nextLine();
			System.out.println("Digite a data de ingresso no curso: ");
			dataIngresso = t.nextLine();
			
			Aluno a = new Aluno(nome, CPF, dataNascimento, matricula, dataIngresso);
			AlunoPosicaoLivre(a, listaAluno);
			System.out.println("Aluno inserido com sucesso.");
		
		}
	}		
		
		private static void AlunoPosicaoLivre(Aluno a, Aluno [] lista){
			
			if(AlunoListaNaoCheia(lista)){
				
				int posicao_livre = -1;
				boolean encontrou = false;
				
				for(int count = 0; count < lista.length; count++){
					if((lista[count] == null) && !encontrou){
						posicao_livre = count;
						encontrou = true;
					}
				}
				
				lista[posicao_livre] = a;
			
			}else{
				System.out.println("Lista cheia.");
			}
	}	
		
		public static void AlunoLista(Aluno [] lista){
			
			boolean esta_vazia = true;
			
			for(int count = 0; count < lista.length; count++){
					if(lista[count] == null){
						
					}else{
						esta_vazia = false;
						System.out.println( count + " - " + AlunoExibe(lista[count]));
					}
			}
			
			if(esta_vazia){
					
				System.out.println("Lista vazia.");
			}
			
		}
		
		
		private static boolean AlunoListaNaoCheia(Aluno [] lista){
			
			for(int count = 0; count < lista.length; count++){
				if(lista[count]== null){
					return true;
				}
			}	
			return false;	
		}
		
		
		private static String AlunoExibe(Aluno aluno){
			return "["+aluno.getMatricula()+"]["+aluno.getNome()+"]["+aluno.getDataNascimento()+"]";
		}
		
		public static Aluno AlunoLocaliza(Aluno[] lista){
			
			Scanner t = new Scanner(System.in);
			System.out.println("Digite sua matricula: ");	
			String matricula = t.nextLine();
			
			if(AlunoListaVazia(lista)){
				
				System.out.println("Lista Vazia. Não tem informação aqui.");
			
			}	else{
					int count = AlunoPosicao(lista,matricula);
					
					if(count != -1){
						System.out.println("Aluno informado. O aluno está na posição " + count);
						return lista[count];
					
					}else{
						System.out.println("Aluno não encontrado.");
					}
				}
			
			return null;
				
		}
			
		
		private static int AlunoPosicao(Aluno [] lista, String matricula){
			
			for(int count = 0; count < lista.length; count++){
				
				if(lista[count] != null){
				
						if (lista[count].getMatricula().equals(matricula)){
							
								return count;
						}	
				}
			}		
			
			return -1;
		}		
		private static boolean AlunoListaVazia(Aluno[] lista){
		
		for(int count = 0; count < lista.length; count++){
			if(lista[count] != null){
				return false;
			}
		}
		return true;
	}
	
	
}

