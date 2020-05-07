package model;

import java.time.LocalDate;

public class Blog{
	String title;
	String description;
	LocalDate postedOn;

	public Blog(String title, String blogDescription, LocalDate postedOn) {
		super();
		this.title = title;
		this.description = blogDescription;
		this.postedOn = postedOn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String blogDescription) {
		this.description = blogDescription;
	}
	public LocalDate getDate() {
		return postedOn;
	}
	public void setDate(LocalDate postedOn) {
		this.postedOn = postedOn;
	}

	
}