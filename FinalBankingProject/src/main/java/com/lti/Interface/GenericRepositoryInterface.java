package com.lti.Interface;

public interface GenericRepositoryInterface 
{
	public void upsert(Object obj);  //insert or update a row/object
	 
	public Object fetchById(Class clazz,Object pk);  //find a row/object by primary key
	
}
	
