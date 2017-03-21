package Controller;

import java.util.Scanner;

import Model.Professor;

public class ManipulaProfessor {
	
		public static void ProfessorAdiciona(Professor [] listaProfessor){
			
			String nome, CPF, dataNascimento, matricula, salario, dataContratacao;
			
			
			if(ProfessorListaNaoCheia(listaProfessor)){
				
				Scanner t = new Scanner(System.in);
				System.out.println("Digite o nome Professor: ");
				nome = t.nextLine();
				System.out.println("Digite o CPF: ");
				CPF = t.nextLine();
				System.out.println("Digite a data de nascimento: ");
				dataNascimento = t.nextLine();
				System.out.println("Digite a matrícula: ");
				matricula = t.nextLine();
				System.out.println("Digite o salário: ");
				salario = t.nextLine();
				System.out.println("Digite a data de contratação: ");
				dataContratacao = t.nextLine();
				
				Professor p = new Professor(nome, CPF, dataNascimento,matricula, salario, dataContratacao);
				ProfessorPosicaoLivre(p, listaProfessor);
				System.out.println("Professor inserido com sucesso.");
			
			}
		}		
			
			private static void ProfessorPosicaoLivre(Professor p, Professor [] lista){
				
				if(ProfessorListaNaoCheia(lista)){
					
					int posicao_livre = -1;
					boolean encontrou = false;
					
					for(int count = 0; count < lista.length; count++){
						if((lista[count] == null) && !encontrou){
							posicao_livre = count;
							encontrou = true;
						}
					}
					
					lista[posicao_livre] = p;
				
				}else{
					System.out.println("Lista cheia.");
				}
		}	
			
			public static void ProfessorLista(Professor [] lista){
				
				boolean esta_vazia = true;
				
				for(int count = 0; count < lista.length; count++){
						if(lista[count] == null){
							
						}else{
							esta_vazia = false;
							System.out.println( count + " - " + ProfessorExibe(lista[count]));
						}
				}
				
				if(esta_vazia){
						
					System.out.println("Lista vazia.");
				}
				
			}
			
			
			private static boolean ProfessorListaNaoCheia(Professor [] lista){
				
				for(int count = 0; count < lista.length; count++){
					if(lista[count]== null){
						return true;
					}
				}	
				return false;	
			}
			
			
			private static String ProfessorExibe(Professor professor){
				return "["+professor.getNome()+"]["+professor.getMatricula()+"]["+professor.getdataContatacao()+"]";
			}
			
			public static Professor ProfessorLocaliza(Professor[] lista){
				
				Scanner t = new Scanner(System.in);
				System.out.println("Digite sua matricula: ");	
				String matricula = t.nextLine();
				
				if(ProfessorListaVazia(lista)){
					
					System.out.println("Lista Vazia. Não tem informação aqui.");
				
				}	else{
						int count = ProfessorPosicao(lista,matricula);
						
						if(count != -1){
							System.out.println("Professor informado. O Professor está na posição " + count);
							return lista[count];
						
						}else{
							System.out.println("Professor não encontrado.");
						}
					}
				
				return null;
					
			}
				
			
			private static int ProfessorPosicao(Professor [] lista, String matricula){
				
				for(int count = 0; count < lista.length; count++){
					
					if(lista[count] != null){
					
							if (lista[count].getMatricula().equals(matricula)){
								
									return count;
							}	
					}
				}		
				
				return -1;
			}		
			private static boolean ProfessorListaVazia(Professor[] lista){
			
			for(int count = 0; count < lista.length; count++){
				if(lista[count] != null){
					return false;
				}
			}
			return true;
		}
		
		
	}

