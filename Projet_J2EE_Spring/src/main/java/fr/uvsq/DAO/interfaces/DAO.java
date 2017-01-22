package fr.uvsq.DAO.interfaces;

public interface DAO <T>{
	
	T findById(long id);
	boolean insert (T nouveau);
	boolean update(T nouveau);
	
	
}
