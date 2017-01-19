package fr.uvsq.bean;

import fr.uvsq.DAO.implementation.DAOAdresseImplementation;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	DAOAdresseImplementation daoAdresseImplementation= new DAOAdresseImplementation();	
	Adresse adresse = new Adresse("menil", "Versaille", 78000);
    daoAdresseImplementation.insert(adresse);
    
	}
	

}

