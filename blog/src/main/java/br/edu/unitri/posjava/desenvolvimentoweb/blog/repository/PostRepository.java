package br.edu.unitri.posjava.desenvolvimentoweb.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unitri.posjava.desenvolvimentoweb.blog.domain.Post;
import br.edu.unitri.posjava.desenvolvimentoweb.blog.domain.User;

public interface PostRepository extends JpaRepository<Post, Long> {

	public List<Post> findByUser(User user);
	
}
