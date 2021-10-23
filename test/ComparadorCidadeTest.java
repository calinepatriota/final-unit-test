import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class ComparadorCidadeTest {
	ComparadorCidade comparadorCidade;

	@Test
	void compare() {
		Cidade cidade= new Cidade("Belo Horizonte");
    	Cidade cidade2= new Cidade("São Paulo");
    	cidade.distancia=50;
    	cidade2.distancia=100;
    	comparadorCidade = new ComparadorCidade();
		comparadorCidade.compare(cidade, cidade2);
    	Assertions.assertEquals(-1, comparadorCidade.compare(cidade, cidade2),"Erro ao comparar distancia");
	}
}