package br.net.william.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.william.crud.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
    public Optional<Pessoa> findByNome(String nome);
}
