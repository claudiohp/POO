package Controller;

import java.util.Date;
import java.util.Scanner;


import Model.Turma;

public class ManipulaTurma {
	
	public static void TurmaAdiciona(Turma [] listaTurma){
		
		String codigo, qtdVagas, diasdaSemana, horaInicio, horaFinal, periodoReferencia;
	
			if(TurmaListaNaoCheia(listaTurma)){
			
				Scanner t = new Scanner(System.in);
				System.out.println("Digite o código: ");
				codigo = t.nextLine();
				System.out.println("Digite a quantidade de Vagas: ");
				qtdVagas = t.nextLine();
				System.out.println("Digite a quantidade de dias da semana: ");
				diasdaSemana = t.nextLine();
				System.out.println("Digite a hora inicial: ");
				horaInicio = t.nextLine();
				System.out.println("Digite a hora final: ");
				horaFinal = t.nextLine();
				System.out.println("Digite o periodo de referência: ");
				periodoReferencia = t.nextLine();
				
				Turma t1 = new Turma(codigo, qtdVagas, diasdaSemana, horaInicio, horaFinal, periodoReferencia);
				TurmaPosicaoLivre(t1, listaTurma);
				System.out.println("Turma inserida com sucesso.");
		
		}
	}		
		
		private static void TurmaPosicaoLivre(Turma t1, Turma [] lista){
			
			if(TurmaListaNaoCheia(lista)){
				
				int posicao_livre = -1;
				boolean encontrou = false;
				
				for(int count = 0; count < lista.length; count++){
					if((lista[count] == null) && !encontrou){
						posicao_livre = count;
						encontrou = true;
					}
				}
				
				lista[posicao_livre] = t1;
				
			}else{
				System.out.println("Lista cheia.");
			}
	}	
		
		public static void TurmaLista(Turma [] lista){
			
			boolean esta_vazia = true;
			
			for(int count = 0; count < lista.length; count++){
					if(lista[count] == null){
						
					}else{
						esta_vazia = false;
						System.out.println( count + " - " + TurmaExibe(lista[count]));
					}
			}
			
			if(esta_vazia){
					
				System.out.println("Lista vazia.");
			}
			
		}
		
		
		private static boolean TurmaListaNaoCheia(Turma [] lista){
			
			for(int count = 0; count < lista.length; count++){
				if(lista[count]== null){
					return true;
				}
			}	
			return false;	
		}
		
		
		private static String TurmaExibe(Turma turma){
			return "["+turma.getCodigo()+"]["+turma.getHoraFinal()+"]["+turma.getHoraInicio()+"]";
		}
		
		public static Turma TurmaLocaliza(Turma[] lista){
			
			Scanner t = new Scanner(System.in);
			System.out.println("Digite o codigo: ");	
			String codigo = t.nextLine();
			
			if(TurmaListaVazia(lista)){
				
				System.out.println("Lista Vazia. Não tem informação aqui.");
			
			}	else{
					int count = TurmaPosicao(lista,codigo);
					
					if(count != -1){
						System.out.println("Turma informada. Turma está na posição " + count);
						return lista[count];
					
					}else{
						System.out.println("Turma não encontrada.");
					}
				}
			
			return null;
				
		}
			
		
		private static int TurmaPosicao(Turma [] lista, String codigo){
			
			for(int count = 0; count < lista.length; count++){
				
				if(lista[count] != null){
				
						if (lista[count].getCodigo().equals(codigo)){
							
								return count;
						}	
				}
			}		
			
			return -1;
		}		
		private static boolean TurmaListaVazia(Turma[] lista){
		
		for(int count = 0; count < lista.length; count++){
			if(lista[count] != null){
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	

}
