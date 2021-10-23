import java.util.Comparator;

/* Compare two cidades for use in sorting or data structures
 */ 
public class ComparadorCidade implements Comparator<Cidade> {
  /* compare cidades by their distancia from the start of the rail network
   * return: negative if c1 is closer to 0, 0 if equal distancia, 
   * positive if c2 is closer to 0
   */
  public int compare(Cidade c1, Cidade c2) { //Refatoração do codigo para aceite das condicoes do requisito
	 int distancia =c1.comparaDistancia(c1,c2);
	 if (c1.distancia <= 0 || c1.distancia < c2.distancia) {
		 distancia=-1;
  } else if (c1.distancia == c2.distancia) {
		distancia = 0;
	} else {
		distancia = 1;
	}
	 return distancia;
  }
}
