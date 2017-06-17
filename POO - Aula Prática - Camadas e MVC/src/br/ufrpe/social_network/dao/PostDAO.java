package br.ufrpe.social_network.dao;

import java.util.ArrayList;

import br.ufrpe.social_network.negocio.beans.Person;
import br.ufrpe.social_network.negocio.beans.Post;

public class PostDAO {

	private ArrayList<Post> posts;
	private static PostDAO instancia = new PostDAO();

	private PostDAO() {

	}

	public static PostDAO getInstance() {
		return instancia;
	}

	public int getIndicePost(long id) {
		int indice = 0;
		boolean achou = false;
		while ((achou != true) && (indice < this.posts.size())) {
			if (id == this.posts.get(indice).getId()) {
				achou = true;
			} else
				indice++;
		}

		return indice;
	}

	public void NovoPost(Post post) {
		posts.add(post);

	}

	public Post procuraPost(long id) {

		Post postagem = new Post();

		int i = this.getIndicePost(id);

		if (i != this.posts.size()) {
			postagem = this.posts.get(i);
		}

		return postagem;
	}
	
	//busca os comentários feitos por um autor
	public ArrayList<Post> procuraPost(Person p){
		int i = 0;
		ArrayList<Post> resultado = new ArrayList<Post>();
		
		while(i <= this.posts.size()){
			if(p.getId() == this.posts.get(i).getAuthor().getId()){
				resultado.add(this.posts.get(i));
				i++;
			}else
				i++;
		}
		
		return resultado;
	}

	public void removePost(long id) {
		int i = this.getIndicePost(id);

		if (i != this.posts.size()) {
			this.posts.remove(i);
			System.out.println("Post removido com sucesso!");
		} else
			System.out.println("Post não existe!");
	}

	public void atualizaPost(Post novoPost) {
		int i = this.getIndicePost(novoPost.getId());

		if (i != this.posts.size()){
			this.posts.get(i).setTexto(novoPost.getTexto());
			System.out.println("Post atualizado com sucesso!");
		}
		else
			System.out.println("Post não existe");
	}
	// TODO Implementar CRUD para classe básica Post usando ArrayList

	/*
	 * Antes de implementar os métodos, pense bem na assinatura dos mesmos
	 */
}
