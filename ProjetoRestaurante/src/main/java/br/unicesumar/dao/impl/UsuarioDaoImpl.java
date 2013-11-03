package br.unicesumar.dao.impl;



import org.hibernate.Query;
import org.hibernate.Session;

import br.unicesumar.dao.GenericHibernateDao;
import br.unicesumar.persistence.Usuario;
import br.unicesumar.utils.HibernateUtils;

public class UsuarioDaoImpl extends GenericHibernateDao<Usuario, Long> {
	Session session = HibernateUtils.getSession();
	private String nome;
	public void updateUser(){  
	    Query query = session.createQuery("UPDATE Usuario SET login = :login" + " WHERE id = :id");  
	    query.setParameter("login","John Lima");  
	    query.setParameter("id",4);  
	    int result = query.executeUpdate(); 
	    System.out.println("linha afetada: " + result);
	}    
	    

	public String consulta(){
		Query query = session.createQuery("Usuario.login from Usuario where id = :id ");
		query.setParameter("id", 4);
		nome = query.toString();
		return nome;
	}


	public void removerUser() {

		String hql = "DELETE FROM Usuario "  + 
	             "WHERE id = :usuario_id";
	Query query = session.createQuery(hql);
	query.setParameter("usuario_id", 5);
	int result = query.executeUpdate();
	System.out.println("linha afetada: " + result);
	}
}