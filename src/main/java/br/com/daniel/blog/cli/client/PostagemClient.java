package br.com.daniel.blog.cli.client;

import java.util.List;

import br.com.daniel.blog.cli.pojo.Postagem;

public interface PostagemClient {
	
	public void save(Postagem postagem);
	public List<Postagem> findAll();

}
