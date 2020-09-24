package br.com.controller;

import br.com.model.User;

public class UserLoger {

	public boolean validacaoLogin(String usuario, String senha) {
		
	User user = dummyUser();
		return user.getUsuario().equals(usuario) && user.getSenha().equals(senha);
	}
	public User dummyUser() {
		return new User("teste","teste");
	}
}
