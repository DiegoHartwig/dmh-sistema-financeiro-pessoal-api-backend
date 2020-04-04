package br.net.hartwig.dmhsisfinanceiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.hartwig.dmhsisfinanceiro.entities.Lancamento;
import br.net.hartwig.dmhsisfinanceiro.repositories.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
