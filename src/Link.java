/* Classe que trata da construção de links entre as cidades
 */
public class Link implements Comparable<Link> {
  public Cidade cidade1;
  public Cidade cidade2;
  public int tamanho;
  public boolean usado = false;

  /* Construct cria um Link entre a primeiracidade e a segunda cidade com um tamanho "tam
   * As cidades são comparadas alfabeticamente e criadas no link em ordem alfabética
   * o link é criado entre as cidades
   */
  public Link(Cidade c1, Cidade c2, int tam) {
    if (c1.comparaNome(c1,c2) < 0) {// Adicionando dois parametros para comparacao entre elas (metodo ajustado na classe Cidade
      cidade1 = c1;
      cidade2 = c2;
    } else {
      cidade1 = c2;
      cidade2 = c1;
    }
    tamanho = tam;
    c1.addLink(this);
    c2.addLink(this);
		usado = true;
  }

  /* retorna o tamanho de um link entre duas cidades */
  public int getTamanho() {
    return tamanho;
  }

  /* returna true se o link entre duas cidades existir */
  public boolean isUsado() {
    return usado;
  }

  /* Metodo para setar o booelando no atributo usado */  // Alteracao da descricao do metodo
  public void setUsado(boolean booleano) { //Alteracao do nome da variavel
    usado = booleano;
  }

  /* returna uma string com a descrição de um Link entre cidades
   * exemplo "Cidade1 3 Cidade2"
   * O nome das cidades tem de vir em ordem alfabética, exemplo, Olinda vem antes de Recife
   */
  public String toString(Link link) {//Alteracao para metodo receber parametro do tipo Link
	int ordenacao=cidade1.comparaNome(link.cidade1,link.cidade2);
	String descricao;
	
	if (ordenacao < 0) {
		descricao=cidade1.toString() + " " + cidade2.toString();
	} else if (ordenacao > 0) {
		descricao=cidade2.toString() + " " + cidade1.toString();
	} else {// se cidades possuirem o mesmo nome
		descricao=cidade1.toString() + " " + cidade2.toString();
	}
    return descricao;
  }

  /* Compara dois links para saber se são o mesmo caminho
   * returna 0 se os links tiverem as mesmas cidade1 e cidade2
   * return negativo se this.cidade1 < l.cidade1 ou se cidade1 é igual 
   *nos dois links e this.cidade2 < l.cidade2
   * retorna positivo caso contrário
   */
  public int compareTo(Link l){ //Refatora��o do codigo para aceite das condicoes do requisito
	    int diferenca = cidade1.comparaNome(l.cidade1,l.cidade2);
	    if (diferenca < 0) {
	    	diferenca = -1;
		} else if (diferenca > 0) {
			diferenca = 1;
		} else {
			diferenca = 0;
		}
	    return diferenca;
	  }
}
