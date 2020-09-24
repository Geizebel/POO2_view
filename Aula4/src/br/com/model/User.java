package br.com.model;

public class User {
	private String usuario;
	private String senha;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public User(String usuario, String senha) {
		
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public User(){
		
	}
	@Override
	public String toString() {
		return "User [usuario=" + usuario + ", senha=" + senha + "]";
	}

}
