package br.unicesumar.test.persistence;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.junit.Test;

import br.unicesumar.dao.impl.UsuarioDaoImpl;
import br.unicesumar.persistence.Usuario;
import br.unicesumar.types.TipoUsuario;

public class UsuarioTest {
	UsuarioDaoImpl userDao = new UsuarioDaoImpl();
	Usuario user = new Usuario();
	
	@Test
	public void testSave(){
		userDao.updateUser();
	}
/*	
 //INSERT FUNCIONA OK
	@Test
	public void testInsert() {
		user.setLogin("john");m
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
		//userDao.updateUser();
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
