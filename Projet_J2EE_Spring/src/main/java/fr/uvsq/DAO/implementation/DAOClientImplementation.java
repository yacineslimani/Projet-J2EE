package fr.uvsq.DAO.implementation;

import java.util.List;

import fr.uvsq.DAO.interfaces.DAOClient;
import fr.uvsq.bean.Client;

public class DAOClientImplementation implements DAOClient{

	public Client findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean insert(Client nouveau) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Client nouveau) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Client> findAll(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Client nouveau) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Client findByEmailAndPwd(String email, String mdp) {
		// TODO Auto-generated method stub
		return null;
	}

}
