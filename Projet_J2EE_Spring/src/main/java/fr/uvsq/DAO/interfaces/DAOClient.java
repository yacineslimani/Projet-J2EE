package fr.uvsq.DAO.interfaces;

import fr.uvsq.bean.Client;

public interface DAOClient extends DAO<Client>{
	

	Client findByEmailAndPwd(String email, String mdp);


}
