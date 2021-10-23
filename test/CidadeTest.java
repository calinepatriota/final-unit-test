import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class CidadeTest {
	
	Cidade cidade;

    @Test
    void encontrarCidadeExistenteNaLista() {
    	cidade = new Cidade("Recife");
    	cidade = new Cidade("Alagoas");
    	Assertions.assertEquals("Recife", cidade.encontrarCidade("Recife"),"Erro ao encontrar cidade");
    }
    
    @Test
    void encontrarCidadeQueNaoExistenteNaLista() {
    	cidade = new Cidade("Recife");
    	cidade = new Cidade("Alagoas");
    	Assertions.assertEquals("João Pessoa", cidade.encontrarCidade("João Pessoa"),"Erro ao encontrar cidade");
    }

    @Test
    void addLink() {
    	Cidade cidade= new Cidade("Belo Horizonte");
    	Cidade cidade2= new Cidade("São Paulo");
    	Link link= new Link(cidade,cidade2,100);
    	Assertions.assertTrue(cidade.addLink(link),"Erro ao adicionar link entre as cidades");
    }

    @Test
    void comparaNome() {
    	Cidade cidade= new Cidade("Belo Horizonte");
    	Cidade cidade2= new Cidade("São Paulo");
    	Assertions.assertEquals(-1, cidade.comparaNome(cidade, cidade2),"Erro ao comparar os nomes das cidades");
    }

    @Test
    void testToString() {
    	cidade = new Cidade("Salvador");
    	Assertions.assertEquals("Salvador", cidade.toString(),"Erro ao verificar nome da cidade");
    }

    @Test
    void comparaDistanciaCidade1MaisProxima() {
    	Cidade cidade= new Cidade("Belo Horizonte");
    	Cidade cidade2= new Cidade("São Paulo");
    	cidade.distancia=50;
    	cidade2.distancia=100;
    	Assertions.assertEquals(-1, cidade.comparaDistancia(cidade, cidade2),"Erro ao comparar distancia");
    }
    
    @Test
    void comparaDistanciasIguais() {
    	Cidade cidade= new Cidade("Belo Horizonte");
    	Cidade cidade2= new Cidade("São Paulo");
    	cidade.distancia=50;
    	cidade2.distancia=50;
    	Assertions.assertEquals(0, cidade.comparaDistancia(cidade, cidade2),"Erro ao comparar distancia");
    }
    
    @Test
    void comparaDistanciaCidade2MaisProxima() {
    	Cidade cidade= new Cidade("Belo Horizonte");
    	Cidade cidade2= new Cidade("São Paulo");
    	cidade.distancia=100;
    	cidade2.distancia=50;
    	Assertions.assertEquals(1, cidade.comparaDistancia(cidade, cidade2),"Erro ao comparar distancia");
    }
}