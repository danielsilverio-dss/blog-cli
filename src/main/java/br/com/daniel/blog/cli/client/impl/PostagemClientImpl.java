package br.com.daniel.blog.cli.client.impl;

import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import br.com.daniel.blog.cli.client.PostagemClient;
import br.com.daniel.blog.cli.pojo.Postagem;

public class PostagemClientImpl implements PostagemClient{

	private String baseUrl;
	private String resourceUrl;
	private Client client;
		
	public PostagemClientImpl() {
		this.baseUrl = "http://localhost:8080";
		this.resourceUrl = "/blog-ws/postagem"; 
		this.client = Client.create();
	}

	public void save(Postagem postagem) {

		WebResource webResource = client.resource( baseUrl + resourceUrl );
		// Postagem resultado = 		
		// System.out.println(resultado);
	}

	public List<Postagem> findAll() {

		// List<Postagem> postagens = restTemplate.getForObject(this.baseUrl, ArrayList.class);
		
		return null;
	}
	
	

}
