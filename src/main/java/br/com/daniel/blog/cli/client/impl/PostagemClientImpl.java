package br.com.daniel.blog.cli.client.impl;

import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.daniel.blog.cli.client.PostagemClient;
import br.com.daniel.blog.cli.pojo.Postagem;

public class PostagemClientImpl implements PostagemClient{

	private String baseUrl;
	private String resourceUrl;
	private Client client;
		
	public PostagemClientImpl() {
							/* use consul! */
		this.baseUrl = "http://localhost:8080";
		this.resourceUrl = "/postagens";
		this.client = Client.create();
	}

	public void save(Postagem postagem) {

		WebResource webResource = client.resource( this.baseUrl + this.resourceUrl );
		webResource.type("application/json");
		ClientResponse response = webResource.post(ClientResponse.class, postagem);
		System.out.println( response );
		
		// Postagem resultado = 		

	}

	public List<Postagem> findAll() {

		WebResource webResource = client.resource( this.baseUrl + this.resourceUrl );
		String resultAsString = webResource.get(String.class);
		System.out.println( resultAsString );
		
		return null;
	}
	

}
