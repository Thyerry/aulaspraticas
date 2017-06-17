package br.ufrpe.social_network.negocio;

import java.util.ArrayList;


import br.ufrpe.social_network.dao.PostDAO;
import br.ufrpe.social_network.negocio.beans.Person;
import br.ufrpe.social_network.negocio.beans.Post;


public class PostController {

	private PostDAO postsRepository;
	private static PostController instance = new PostController();

	private PostController() {

	}

	public static PostController getInstance() {
		return instance;
	}

	// TODO implementar corpo dos métodos CRUD deste controlador
	public void newPost(Post p) {
		postsRepository.NovoPost(p);
	}

	public Post find(Post p) {
		Post post = new Post();
		postsRepository.procuraPost(p.getId());
		return post;
	}

	public void update(Post newPost) {
		postsRepository.atualizaPost(newPost);
	}

	public void delete(Post p) {
		postsRepository.removePost(p.getId());
	}
	public long buscaAuthor(Post p){
		return p.getAuthor().getId();
	}
	public ArrayList<Post> visualizaPosts(Person p){
		ArrayList<Post> resultado = postsRepository.procuraPost(p);
		return resultado;
	}
	// TODO Implementar singleton para este controlador

	// TODO Implementar método que lista todos os posts de uma determinada
	// pessoa

	// TODO DESAFIO Implementar método que busque todos comentários que uma dada
	// pessoa realizou em posts de terceiros
	// Para implementar este método, você deve fazer uma buscar em todos os
	// comentários de todos os posts, verificando quem realizou aqueele
	// comentário.
	// Lembre-se que é possível realizar comentários de comentários e busca
	// precisaria ser feita em profundidade
}
