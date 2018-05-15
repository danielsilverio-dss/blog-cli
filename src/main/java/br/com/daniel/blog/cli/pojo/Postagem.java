package br.com.daniel.blog.cli.pojo;

public class Postagem {
	
	public long id;
	public String titulo;
	public String texto;
	public String tags;
	
	public Postagem() {}

	public Postagem(long id, String titulo, String texto, String tags) {
		this.id = id;
		this.titulo = titulo;
		this.texto = texto;
		this.tags = tags;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

}
