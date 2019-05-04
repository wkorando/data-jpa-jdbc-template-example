package com.ibm.developer.blog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Blogs")
public class Blog {
	@Id
	@GeneratedValue
	private long id;
	@Column(name = "Title")
	private String title;
	@Column(name = "Body")
	private String body;

	public Blog() {
	}

	public Blog(long id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
