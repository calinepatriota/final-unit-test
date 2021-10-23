import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class LinkTest {
	Link link;
	
    @Test
    void getTamanho() {
        Cidade cidade= new Cidade("Rio de Janeiro");
    	Cidade cidade2= new Cidade("São Paulo");
    	link= new Link(cidade,cidade2,400);
    	Assertions.assertEquals(400, link.getTamanho(), "Erro ao verificar tamanho");
    }

    @Test
    void isUsado() {
        Cidade cidade= new Cidade("Rio de Janeiro");
     	Cidade cidade2= new Cidade("São Paulo");
     	link= new Link(cidade,cidade2,400);
    	Assertions.assertTrue(link.isUsado(), "Erro ao verificar se link está sendo utilzado");
    }

    @Test
    void setUsado(){
    	Cidade cidade= new Cidade("Rio de Janeiro");
      	Cidade cidade2= new Cidade("São Paulo");
      	link= new Link(cidade,cidade2,400);
      	link.setUsado(true);
      	Assertions.assertTrue(link.isUsado(), "Erro ao verificar se link está sendo utilzado");
    }

    @Test
    void testToStringCidade1MenorQueCidade2() {
    	Cidade cidade= new Cidade("Rio de Janeiro");
      	Cidade cidade2= new Cidade("São Paulo");
      	link= new Link(cidade,cidade2,400);
      	Assertions.assertEquals("Rio de Janeiro São Paulo", link.toString(link), "Erro ao validar descricao");    
      	}
    
    @Test
    void testToStringCidade2MenorQueCidade1() {
    	Cidade cidade= new Cidade("Recife");
      	Cidade cidade2= new Cidade("Belo Horizonte");
      	link= new Link(cidade,cidade2,400);
      	Assertions.assertEquals("Belo Horizonte Recife", link.toString(link), "Erro ao validar descricao");    
      	}
    
    @Test
    void testToStringCidadeIgualQueCidade2() {
    	Cidade cidade= new Cidade("Rio de Janeiro");
      	Cidade cidade2= new Cidade("São Paulo");
      	link= new Link(cidade,cidade2,400);
      	Assertions.assertEquals("Rio de Janeiro São Paulo", link.toString(link), "Erro ao validar descricao");    
      	}

    @Test
    void compareToCidade1MenorCidade2()  {
    Cidade cidade= new Cidade("Belo Horizonte");
	Cidade cidade2= new Cidade("São Paulo");
	Link link= new Link(cidade,cidade2,100);
	Assertions.assertEquals(-1, link.compareTo(link),"Erro ao comparar cidades");
    }
    
    @Test
    void compareToCidade2MenorCidade1()  {
    Cidade cidade= new Cidade("São Paulo");
	Cidade cidade2= new Cidade("Rio de Janeiro");
	Link link= new Link(cidade,cidade2,100);
	Assertions.assertEquals(-1, link.compareTo(link),"Erro ao comparar cidades");
    }
    
    
    @Test
    void compareToCidade1IgualCidade2()  {
    Cidade cidade= new Cidade("São Paulo");
	Cidade cidade2= new Cidade("São Paulo");
	Link link= new Link(cidade,cidade2,100);
	Assertions.assertEquals(0, link.compareTo(link),"Erro ao comparar cidades");
    }
}