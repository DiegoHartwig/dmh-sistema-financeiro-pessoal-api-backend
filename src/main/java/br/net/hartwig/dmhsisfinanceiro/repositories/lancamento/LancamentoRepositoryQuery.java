package br.net.hartwig.dmhsisfinanceiro.repositories.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.net.hartwig.dmhsisfinanceiro.entities.Lancamento;
import br.net.hartwig.dmhsisfinanceiro.repositories.filter.LancamentoFilter;
import br.net.hartwig.dmhsisfinanceiro.repositories.projections.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	
	public Page<ResumoLancamento> resumoLancamento(LancamentoFilter lancamentoFilter, Pageable pageable);

}
