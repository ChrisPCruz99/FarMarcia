package org.generation.farmarcia.repository;

import java.util.List;

import org.generation.farmarcia.model.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {
	public List<Categorias> findAllByNomeContainingIgnoreCase(String nome);

}
