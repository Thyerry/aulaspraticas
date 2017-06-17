package br.ufrpe.social_network.negocio;

import java.util.ArrayList;

import br.ufrpe.social_network.negocio.beans.Person;
import br.ufrpe.social_network.negocio.beans.Post;

public class Fachada {

	private PersonController personCtrl;
	private PostController postsCtrl;
	private static Fachada fac = new Fachada();

	private Fachada() {

	}

	public static Fachada getInstance() {
		return fac;
	}

	public boolean equals(Object obj) {
		return personCtrl.equals(obj);
	}

	public void savePerson(Person p) {
		personCtrl.savePerson(p);
	}

	public Person findPerson(long personId) {
		return personCtrl.find(personId);
	}

	public String toString() {
		return personCtrl.toString();
	}

	public void updatePerson(Person newPerson) {
		personCtrl.update(newPerson);
	}

	public void deletePerson(Person p) {
		personCtrl.delete(p);
	}

	public void newPost(Post p) {
		postsCtrl.newPost(p);
	}

	public Post find(long id){
		return postsCtrl.find(id);
	}

	public void updatePost(Post newPost) {
		postsCtrl.update(newPost);
	}

	public void deletePost(Post p) {
		postsCtrl.delete(p);
	}

	public long buscaAuthor(Post p) {
		return postsCtrl.buscaAuthor(p);
	}

	public ArrayList<Post> visualizaPosts(Person p) {
		return postsCtrl.visualizaPosts(p);
	}

	public int hashCode() {
		return personCtrl.hashCode();
	}

	
	
	// TODO Implementar Fachada que usa métodos do controlador de pessoas e
	// posts
	// Todos os métodos devem ser do tipo delegate e podem ser gerados
	// automaticamente pelo Eclipse se não houver conflito de nomes

	// TODO implementar singleton

}
