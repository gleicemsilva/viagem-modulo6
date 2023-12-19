package br.com.decolejaviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.decolejaviagens.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
