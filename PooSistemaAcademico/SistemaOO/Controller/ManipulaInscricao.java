package Controller;

import java.util.Scanner;

import Model.Inscricao;
import Model.ItemInscricao;

public class ManipulaInscricao {
	
	
	public static void InscricaoAdiciona(Inscricao [] listaInscricao){
		
		int id_inscricao, qtdlimite;
		String dataRealizacao, dataAprovacao, periodoReferencia;
		
		if(InscricaoListaNaoCheia(listaInscricao)){
			
			Scanner t = new Scanner(System.in);
			System.out.println("Digite a quantidade de id de inscri��o: ");
			id_inscricao = t.nextInt();
			System.out.println("Digite a data de realiza��o: ");
			dataRealizacao = t.next();
			System.out.println("Digite a quantidade limite: ");
			qtdlimite = t.nextInt();
			System.out.println("Digite a data de aprova��o: ");
			dataAprovacao = t.next();
			System.out.println("Digite o per�odo de refer�ncia: ");
			periodoReferencia = t.next();
			
			Inscricao i = new Inscricao(id_inscricao, dataRealizacao, dataAprovacao, qtdlimite, periodoReferencia);
			InscricaoPosicaoLivre(i, listaInscricao);
			System.out.println("Inscri��o inserida com sucesso.");
		
		}
	}
	
	public static void ItemInscricaoAdiciona(ItemInscricao [] listaItemInscricao){
		
		int id_item, nota;
		boolean cancelado;
			
			Scanner t = new Scanner(System.in);
			System.out.println("Digite o id_item: ");
			id_item = t.nextInt();
			System.out.println("Digite a nota: ");
			nota = t.nextInt();
			System.out.println("Digite true para inserir: ");
			cancelado = t.nextBoolean();
			
			ItemInscricao it = new ItemInscricao(id_item, nota, cancelado);
			System.out.println("Item Inscri��o inserido com sucesso.");
		
		}
	
	
		private static void InscricaoPosicaoLivre(Inscricao i, Inscricao [] lista){
			
			if(InscricaoListaNaoCheia(lista)){
				
				int posicao_livre = -1;
				boolean encontrou = false;
				
				for(int count = 0; count < lista.length; count++){
					if((lista[count] == null) && !encontrou){
						posicao_livre = count;
						encontrou = true;
					}
				}
				
				lista[posicao_livre] = i;
			
			}else{
				System.out.println("Lista cheia.");
			}
	}	
		
		public static void InscricaoLista(Inscricao [] lista){
			
			boolean esta_vazia = true;
			
			for(int count = 0; count < lista.length; count++){
					if(lista[count] == null){
						
					}else{
						esta_vazia = false;
						System.out.println( count + " - " + InscricaoExibe(lista[count]));
					}
			}
			
			if(esta_vazia){
					
				System.out.println("Lista vazia.");
			}
			
		}
		
		
		private static boolean InscricaoListaNaoCheia(Inscricao [] lista){
			
			for(int count = 0; count < lista.length; count++){
				if(lista[count]== null){
					return true;
				}
			}	
			return false;	
		}
		
		
		private static String InscricaoExibe(Inscricao inscricao){
			return "["+inscricao.getId_incricao()+"]["+inscricao.getPeriodoReferencia()+"]["+inscricao.getQtdlimite()+"]";
		}
		
		public static Inscricao InscricaoLocaliza(Inscricao[] lista){
			
			Scanner t = new Scanner(System.in);
			System.out.println("Digite o id_inscri��o: ");	
			int id_inscricao = t.nextInt();
			
			if(InscricaoListaVazia(lista)){
				
				System.out.println("Lista Vazia. N�o tem informa��o aqui.");
			
			}	else{
					int count = InscricaoPosicao(lista,id_inscricao);
					
					if(count != -1){
						System.out.println("Inscricao informada. O inscricao est� na posi��o " + count);
						return lista[count];
					
					}else{
						System.out.println("Inscricao n�o encontrada.");
					}
				}
			
			return null;
				
		}
			
		
		private static int InscricaoPosicao(Inscricao [] lista, int id_inscricao){
			
			for(int count = 0; count < lista.length; count++){
				
				if(lista[count] != null){
				
						if (lista[count].getId_incricao() ==(id_inscricao)){
							
								return count;
						}	
				}
			}		
			
			return -1;
		}		
		private static boolean InscricaoListaVazia(Inscricao[] lista){
		
		for(int count = 0; count < lista.length; count++){
			if(lista[count] != null){
				return false;
			}
		}
		return true;
	}
	
	
}
