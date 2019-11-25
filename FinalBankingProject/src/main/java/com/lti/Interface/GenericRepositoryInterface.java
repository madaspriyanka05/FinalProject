package com.lti.Interface;

public interface GenericRepositoryInterface 
{
	public void upsert(Object obj);  //insert or update a row/object
	 
	public Object fetchById(Class clazz,Object pk);  //find a row/object by primary key
	
	public void delete(Class clazz, Object pk); //remove a row/object by primary key
	
	
	public Object fetchData(Class clazz, Object pk);
}
