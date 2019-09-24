package br.com.lojavirtual.loja.dados;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.lojavirtual.loja.models.Usuario;

public class UsuarioDao {
	
	@PersistenceContext
	private EntityManager manager;

	
	public void salvar(Usuario usuario) {
		manager.persist(usuario);
	}
	
	
	
}
