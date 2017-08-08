package br.ufrpe.social_network.gui;

import java.time.LocalDate;

import br.ufrpe.social_network.negocio.Fachada;
import br.ufrpe.social_network.negocio.beans.Person;
import br.ufrpe.social_network.negocio.beans.Post;

public class TextualUserInterface {
    
    public void showUserInterface() {
    	
    	Fachada fac = Fachada.getInstance();
    	
    	
    	LocalDate data = LocalDate.of(1993, 07, 26);
    	Person p1 = new Person("Thyerry", "Brasil",data);
    	
    	data = LocalDate.of(1965, 01, 26);
    	Person p2 = new Person("Tony", "Italia", data);
    	
    	data = LocalDate.of(1999, 04, 05);
    	Person p3 = new Person("Emily", "EUA", data);
    	
    	data = LocalDate.of(1998, 03, 19);
    	Person p4 = new Person("Nathany", "França", data);
    	
    	fac.savePerson(p1);
    	fac.savePerson(p2);
    	fac.savePerson(p3);
    	fac.savePerson(p4);
    	////////////////
    	System.out.println(p1 +"\n"
    					 + p2 +"\n"
    					 + p3 +"\n" 
    					 + p4);
    	
    	fac.deletePerson(p1);
    	
    	
    	p2.setName("Mario");
    	fac.updatePerson(p2);
    	
    	System.out.println(fac.findPerson(3));
    	
    	for(int i = 1; i<15; i++){
    		Post posts;
    		if(i % 3 == 1){
    			posts = new Post("olá", p2);
    		}
    		else if(i % 3 == 2){
    			posts = new Post("oi", p3);
    		}
    		else{
    			posts = new Post("bom dia", p4);
    		}
    	}
    	
        // TODO implementar código que usa a Fachada. Detalhamento:
        
        /*
        
        1.  Crie quatro pessoas e salve-as
        2.  Apague uma das pessoas
        3.  Atualize o nome de uma das pessoas
        4.  Busque por um objeto do tipo pessoa que tenha um ID qualquer.
        5.  Crie 15 posts aleatórios, 5 para cada uma das pessoas criadas anteriormente
        6.  Crie 2 comentários de resposta de uma das pessoas em cada um dos posts de outra pessoa
        7.  Liste todos os posts de todas as pessoas
        8.  (DESAFIO) Liste somente os comentários que cada uma das pessoas fez em outros posts de outras pessoas

        */
        
    }

}
