package br.edu.unitri.posjava.desenvolvimentoweb.blog.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {

	@Column
	@Id
	private String username;
	
	@Column
	private String password;
	
	public User(){}
	
	public User(String username) {
		this.username = username;
	}
	
	@OneToMany(mappedBy="user")
	private List<Post> posts;
	
	@OneToOne(mappedBy="user")
	private Blog blog;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	
}