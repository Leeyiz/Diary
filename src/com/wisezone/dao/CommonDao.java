package com.wisezone.dao;

import java.util.List;

public interface CommonDao<T> {
	public int add(T t);
	
	public int delete(int id);
	
	public List<T> queryAll();
}
