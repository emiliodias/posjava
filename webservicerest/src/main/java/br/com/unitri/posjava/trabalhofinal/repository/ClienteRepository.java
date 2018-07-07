package br.com.unitri.posjava.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unitri.posjava.trabalhofinal.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
