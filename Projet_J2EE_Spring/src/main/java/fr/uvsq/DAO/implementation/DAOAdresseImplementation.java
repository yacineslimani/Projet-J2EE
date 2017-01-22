package fr.uvsq.DAO.implementation;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import fr.uvsq.DAO.interfaces.DAOAdresse;
import fr.uvsq.bean.Adresse;
import fr.uvsq.hibernate.HibernateUtil;
import fr.uvsq.util.CustomHibernateDaoSupport;

@Repository("DAOAdresse")
public class DAOAdresseImplementation extends CustomHibernateDaoSupport implements DAOAdresse {
	
	
	public Adresse findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean insert(Adresse nouveau) {
		/*Transaction tx =null;
		Session session = HibernateUtil.currentSession();
		try{
			tx =(Transaction) session.beginTransaction();
			session.save(nouveau);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
		}
		return true;*/
		getHibernateTemplate().save(nouveau);
		
		return true;
	}
	

	public boolean update(Adresse nouveau) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
