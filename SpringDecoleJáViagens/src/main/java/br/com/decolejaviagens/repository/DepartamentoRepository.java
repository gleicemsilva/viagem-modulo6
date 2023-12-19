package br.com.decolejaviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.decolejaviagens.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

}
