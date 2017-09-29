package com.wisezone.biz.impl;

import java.util.List;

import com.wisezone.biz.DiaryBiz;
import com.wisezone.dao.DiaryDao;
import com.wisezone.dao.impl.DiaryDaoImpl;
import com.wisezone.entity.Diary;

public class DiaryBizImpl implements DiaryBiz {

	private DiaryDao dao = new DiaryDaoImpl();
	
	@Override
	public int add(Diary t) {
		return dao.add(t);
	}

	@Override
	public int delete(int id) {
		return dao.delete(id);
	}

	@Override
	public List<Diary> queryAll() {
		return dao.queryAll();
	}

}
