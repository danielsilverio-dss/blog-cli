package br.com.daniel.blog.cli.test;

import br.com.daniel.blog.cli.client.PostagemClient;
import br.com.daniel.blog.cli.client.impl.PostagemClientImpl;
import br.com.daniel.blog.cli.pojo.Postagem;

public class Teste {

	public static void main(String[] args) {
		
		PostagemClient postagemClient = new PostagemClientImpl();
		
		
		Postagem postagem = new Postagem(0, "Posatgem salva pelo client", "teste", "teste");
		postagemClient.save(postagem);
		
		postagemClient.findAll();

	}

}
