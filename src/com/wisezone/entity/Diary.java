package com.wisezone.entity;

import java.io.Serializable;
import java.util.Date;

public class Diary implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int diary_id;
	private String diary_title;
	private String diary_content;
	private Date diary_date;
	private int diary_type;
	public int getDiary_id() {
		return diary_id;
	}
	public void setDiary_id(int diary_id) {
		this.diary_id = diary_id;
	}
	public String getDiary_title() {
		return diary_title;
	}
	public void setDiary_title(String diary_title) {
		this.diary_title = diary_title;
	}
	public String getDiary_content() {
		return diary_content;
	}
	public void setDiary_content(String diary_content) {
		this.diary_content = diary_content;
	}
	public Date getDiary_date() {
		return diary_date;
	}
	public void setDiary_date(Date diary_date) {
		this.diary_date = diary_date;
	}
	public int getDiary_type() {
		return diary_type;
	}
	public void setDiary_type(int diary_type) {
		this.diary_type = diary_type;
	}
	public Diary(int diary_id, String diary_title, String diary_content, Date diary_date, int diary_type) {
		super();
		this.diary_id = diary_id;
		this.diary_title = diary_title;
		this.diary_content = diary_content;
		this.diary_date = diary_date;
		this.diary_type = diary_type;
	}
	public Diary() {
		super();
	}
	
	
}
