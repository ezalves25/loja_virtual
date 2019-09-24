package br.com.lojavirtual.loja.beans;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.lojavirtual.loja.dados.UsuarioDao;
import br.com.lojavirtual.loja.models.Usuario;

@Model
public class CheckOutBean {	
	
	private Usuario usuario=new Usuario();
	
	@Inject
	private UsuarioDao dao;
	
	@Transactional
	public void finalizar() {
		dao.salvar(usuario);
		
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
