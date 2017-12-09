package br.edu.unitri.posjava.desenvolvimentoweb.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unitri.posjava.desenvolvimentoweb.blog.domain.Blog;
import br.edu.unitri.posjava.desenvolvimentoweb.blog.domain.User;

public interface BlogRepository extends JpaRepository<Blog, Long> {

	public Blog findByUser(User user);
	
}