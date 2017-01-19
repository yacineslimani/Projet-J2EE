package fr.uvsq.DAO.implementation;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import fr.uvsq.DAO.interfaces.DAOAdresse;
import fr.uvsq.bean.Adresse;
import fr.uvsq.hibernate.HibernateUtil;

public class DAOAdresseImplementation implements DAOAdresse {

	public Adresse findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean insert(Adresse nouveau) {
		Transaction tx =null;
		Session session = HibernateUtil.currentSession();
		try{
			tx =(Transaction) session.beginTransaction();
			session.save(nouveau);
			tx.commit();
		}catch(HibernateException e){
			tx.rollback();
		}
		return true;
	}
	

	public boolean update(Adresse nouveau) {
		// TODO Auto-generated method stub
		return false;
	}

}
