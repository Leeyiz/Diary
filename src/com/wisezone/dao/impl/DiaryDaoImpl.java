package com.wisezone.dao.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.wisezone.dao.DiaryDao;
import com.wisezone.entity.Diary;
import com.wisezone.util.DataSourceUtil;

public class DiaryDaoImpl implements DiaryDao{

	private QueryRunner qr = new QueryRunner(DataSourceUtil.getDataSource());
	
	@Override
	public int add(Diary t) {
		String sql = "insert into diary values(diary_seq.nextval,?,?,?,?)";
		Date diar_date = t.getDiary_date();
		java.sql.Date date = new java.sql.Date(diar_date.getTime());//将java.util.Date转换成为java.sql.Date;
		try {
			return qr.update(sql, t.getDiary_title(),t.getDiary_content(),date,t.getDiary_type());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from diary where diary_id = ?";
		try {
			return qr.update(sql, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Diary> queryAll() {
		String sql = "select * from diary";
		try {
			return qr.query(sql, new BeanListHandler<>(Diary.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
