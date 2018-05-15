package br.com.daniel.blog.cli.client.impl;

import java.util.List;

import javax.ws.rs.client.ClientBuilder;

import com.sun.jersey.api.client.Client;

import br.com.daniel.blog.cli.client.PostagemClient;
import br.com.daniel.blog.cli.pojo.Postagem;

public class PostagemClientImpl implements PostagemClient{

	private String baseUrl;
		
	public PostagemClientImpl() {
		this.baseUrl = "/blog-ws/postagem"; 
	}

	public void save(Postagem postagem) {

		Client client = ClientBuilder.newClient();
		// Client client = ClientBuilder.ne
		
		// Postagem resultado = 		
		// System.out.println(resultado);
	}

	public List<Postagem> findAll() {

		// List<Postagem> postagens = restTemplate.getForObject(this.baseUrl, ArrayList.class);
		
		return null;
	}
	
	

}
