package br.unicesumar.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;

import br.unicesumar.dao.GenericHibernateDao;
import br.unicesumar.persistence.Produto;
import br.unicesumar.utils.HibernateUtils;

public class ProdutoDaoImpl extends GenericHibernateDao<Produto, Long>{
	Session session = HibernateUtils.getSession();
	public void updateProduto() {
		Query query = session.createQuery("UPDATE Produto SET preco = :preco WHERE id = :id");
		query.setParameter("preco", 4.00);
		query.setParameter("id", 1);
		query.executeUpdate();
		
		
	}

}
