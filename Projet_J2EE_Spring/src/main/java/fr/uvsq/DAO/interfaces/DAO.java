package fr.uvsq.DAO.interfaces;

import java.util.List;

public interface DAO <T>{
	
	T findById(long id);
	List<T> findAll(String query);
	boolean insert (T nouveau);
	boolean update(T nouveau);
	boolean delete(T nouveau);
	
}
