package br.net.hartwig.dmhsisfinanceiro.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.hartwig.dmhsisfinanceiro.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);

}
