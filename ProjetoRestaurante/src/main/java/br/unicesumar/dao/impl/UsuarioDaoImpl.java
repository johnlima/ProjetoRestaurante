package br.unicesumar.dao.impl;





import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.unicesumar.dao.GenericHibernateDao;
import br.unicesumar.persistence.Usuario;
import br.unicesumar.utils.HibernateUtils;

public class UsuarioDaoImpl extends GenericHibernateDao<Usuario, Long> {
	Session session = HibernateUtils.getSession();
	
	private String nome;
	public void updateUser(int id){
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("UPDATE Usuario u SET u.login = :login" + " WHERE u.id = :user_id");  
	    query.setParameter("login","John Lima");  
	    query.setParameter("user_id",id);
	    query.executeUpdate();
	    t.commit();
	    session.close();
	}    
	    

	public String consulta(){
		Query query = session.createQuery("Usuario.login from Usuario where id = :id ");
		query.setParameter("id", 11);
		nome = query.toString();
		return nome;
	}


	public void removerUser(int id) {

		session.beginTransaction();
		String hql = "DELETE FROM Usuario "  + 
	             "WHERE id = :usuario_id";
	Query query = session.createQuery(hql);
	query.setParameter("usuario_id", id);
	query.executeUpdate();
	}
	
	public Usuario alterar(Usuario user){

		user.setId(user.getId());
		user = (Usuario) session.merge(user);
		user.setLogin("john Lima");
		session.save(user);
		return user;
		
	}
}