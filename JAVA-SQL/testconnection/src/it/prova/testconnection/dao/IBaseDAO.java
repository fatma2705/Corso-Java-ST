package it.prova.testconnection.dao;

public interface IBaseDAO<T> {
	
	public   T   get(Long idInput) throws Exception;
	
	public int update(T input) throws Exception;
	
	public int insert(T input) throws Exception;
	
	public int delete(T input) throws Exception;
	

}
