package com.wisezone.biz;

import java.util.List;

public interface CommonBiz<T> {
	public int add(T t);
	
	public int delete(int id);
	
	public List<T> queryAll();
}
