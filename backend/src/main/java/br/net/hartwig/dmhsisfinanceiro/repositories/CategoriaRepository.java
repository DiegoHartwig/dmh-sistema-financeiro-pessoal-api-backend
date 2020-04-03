package br.net.hartwig.dmhsisfinanceiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.hartwig.dmhsisfinanceiro.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
