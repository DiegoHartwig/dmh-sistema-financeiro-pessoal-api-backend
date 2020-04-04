package br.net.hartwig.dmhsisfinanceiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.hartwig.dmhsisfinanceiro.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
