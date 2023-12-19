package br.com.decolejaviagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.decolejaviagens.model.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

}
