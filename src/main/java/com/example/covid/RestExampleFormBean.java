package com.example.covid;

public class RestExampleFormBean {

	
	 private long id;
	  private String content;
	  private String firstName;
	  public RestExampleFormBean(long id, String content) {
			this.id = id;
			this.content = content;
		}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	 



}
