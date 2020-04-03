package br.net.hartwig.dmhsisfinanceiro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.net.hartwig.dmhsisfinanceiro.entities.Lancamento;
import br.net.hartwig.dmhsisfinanceiro.entities.Pessoa;
import br.net.hartwig.dmhsisfinanceiro.repositories.LancamentoRepository;
import br.net.hartwig.dmhsisfinanceiro.repositories.PessoaRepository;
import br.net.hartwig.dmhsisfinanceiro.services.exception.PessoaInativaOuInexisteException;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoaSalva = this.pessoaRepository.findById(lancamento.getPessoa().getId())
				.orElseThrow(() -> new EmptyResultDataAccessException(1));
		if (pessoaSalva == null || pessoaSalva.isInativo()) {
			throw new PessoaInativaOuInexisteException();
		}

		return lancamentoRepository.save(lancamento);
	}

}
