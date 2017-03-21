package Controller;

import java.util.Scanner;

import Model.Disciplina;
import Model.Turma;

public class ManipulaDisciplina {
	
public static void DisciplinaAdiciona(Disciplina [] listaDisciplina){
		
		int cargaHorariaSemana;
		String codigo, nome;
	
			if(DisciplinaListaNaoCheia(listaDisciplina)){
			
				Scanner t = new Scanner(System.in);
				System.out.println("Digite o código: ");
				codigo = t.nextLine();
				System.out.println("Digite o nome da disciplina: ");
				nome = t.nextLine();
				System.out.println("Digite a quantidade de carga horária da semana: ");
				cargaHorariaSemana = t.nextInt();
				Disciplina d = new Disciplina(codigo, nome, cargaHorariaSemana);
				DisciplinaPosicaoLivre(d, listaDisciplina);
				System.out.println("Disciplina inserida com sucesso.");
		
		}
	}		
		
		private static void DisciplinaPosicaoLivre(Disciplina d, Disciplina [] lista){
			
			if(DisciplinaListaNaoCheia(lista)){
				
				int posicao_livre = -1;
				boolean encontrou = false;
				
				for(int count = 0; count < lista.length; count++){
					if((lista[count] == null) && !encontrou){
						posicao_livre = count;
						encontrou = true;
					}
				}
				
				lista[posicao_livre] = d;
			
			}else{
				System.out.println("Lista cheia.");
			}
	}	
		
		public static void DisciplinaLista(Disciplina [] lista){
			
			boolean esta_vazia = true;
			
			for(int count = 0; count < lista.length; count++){
					if(lista[count] == null){
						
					}else{
						esta_vazia = false;
						System.out.println( count + " - " + DisciplinaExibe(lista[count]));
					}
			}
			
			if(esta_vazia){
					
				System.out.println("Lista vazia.");
			}
			
		}
		
		
		private static boolean DisciplinaListaNaoCheia(Disciplina [] lista){
			
			for(int count = 0; count < lista.length; count++){
				if(lista[count]== null){
					return true;
				}
			}	
			return false;	
		}
		
		
		private static String DisciplinaExibe(Disciplina disciplina){
			return "["+disciplina.getCodigo()+"]["+disciplina.getNome()+"]["+disciplina.getCargaHorariaSemana()+"]";
		}
		
		public static Disciplina DisciplinaLocaliza(Disciplina[] lista){
			
			Scanner t = new Scanner(System.in);
			System.out.println("Digite o codigo: ");	
			String codigo = t.nextLine();
			
			if(DisciplinaListaVazia(lista)){
				
				System.out.println("Lista Vazia. Não tem informação aqui.");
			
			}	else{
					int count = DisciplinaPosicao(lista,codigo);
					
					if(count != -1){
						System.out.println("Disciplina informada. Turma está na posição " + count);
						return lista[count];
					
					}else{
						System.out.println("Disciplina não encontrada.");
					}
				}
			
			return null;
				
		}
			
		
		private static int DisciplinaPosicao(Disciplina [] lista, String codigo){
			
			for(int count = 0; count < lista.length; count++){
				
				if(lista[count] != null){
				
						if (lista[count].getCodigo().equals(codigo)){
							
								return count;
						}	
				}
			}		
			
			return -1;
		}		
		private static boolean DisciplinaListaVazia(Disciplina[] lista){
		
		for(int count = 0; count < lista.length; count++){
			if(lista[count] != null){
				return false;
			}
		}
		return true;
	}
	
	
	
}
