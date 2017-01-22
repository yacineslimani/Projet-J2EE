package fr.uvsq.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.uvsq.DAO.implementation.DAOAdresseImplementation;
import fr.uvsq.service.AdresseService;


public class Test {

	public static void main(String[] args) {


		ApplicationContext appContext =
				new ClassPathXmlApplicationContext("spring/conf/BeanLocations.xml");

		AdresseService adresseService = (AdresseService)appContext.getBean("adresseService");

		Adresse adresse = new Adresse("menil", "Versaille", 78000);
		adresseService.insert(adresse);

	}


}

