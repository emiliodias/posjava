package br.edu.unitri.posjava.desenvolvimentoweb.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unitri.posjava.desenvolvimentoweb.blog.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

}
