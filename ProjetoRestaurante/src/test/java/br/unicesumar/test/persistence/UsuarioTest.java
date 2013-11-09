package br.unicesumar.test.persistence;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.unicesumar.dao.impl.UsuarioDaoImpl;
import br.unicesumar.persistence.Usuario;
import br.unicesumar.types.TipoUsuario;

public class UsuarioTest {
	UsuarioDaoImpl userDao = new UsuarioDaoImpl();
	Usuario user = new Usuario();
/*	
 //INSERT FUNCIONA OK
	@Test
	public void testInsert() {
		user.setLogin("john");
		user.setSenha("1234");
		user.setTipoUsuario(TipoUsuario.GERENTE);
		userDao.save(user);
		assertEquals(user.getClass(), Usuario.class);
	}
	
*/
			
 //UPDATE PASSA NO TESTE MAS NAO ALTERA NADA NO BANCO
	@Test
	public void testUpdate() {
		//userDao.alterar(user);
		userDao.updateUser(user.getId());
		//String usuario = "john Lima";
		//assertEquals(userDao.consulta(), usuario);
	}
		
/*
	// REMOVER PASSA NO TESTE MAS NAO REMOVE NO BANCO
	@Test
	public void testRemove(){
		
		//userDao.removerUser(user.getId());
		//userDao.delete(user);	
		
	}
 */
}
