package br.com.projeto.bo;

import br.com.projeto.beans.Usuario;
import br.com.projeto.dao.UsuarioDAO;

public class UsuarioBO {
	
	public String novoUsuario(Usuario novoUsuario) throws  Exception{
		if(novoUsuario.getCodigo()<=0) {
			return "Codigo Invalido";
		}
		
		//validações com login
		if((novoUsuario.getLogin().length() > 30) || (novoUsuario.getLogin().length() == 0) {
			return "Nome inálido";
		}
		novoUsuario.setLogin(novoUsuario.getLogin().toUpperCase());
		
		//validações com senha
		if((novoUsuario.getSenha().length() > 50) || (novoUsuario.getSenha().length() == 0)) {
			return "senha invalida";
		}
		
		//validações com email
		if((novoUsuario.getEmail().length() > 150) || (novoUsuario.getEmail().length() == 0)) {
			return "Email invalida";
		}
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.getUsuario(novoUsuario.getCodigo());
		
		if (usuario.getCodigo()==0) {
			return usuarioDAO.addUsuario(novoUsuario) + "Usuario Cadastrado"; 
		}else {
			return "usuario já existe";
		}
	}
}
