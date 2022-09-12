package io.github.brunoyillli.mscartoes.infra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.brunoyillli.mscartoes.domain.ClienteCartao;

public interface ClienteCartaoRepository extends JpaRepository<ClienteCartao, Long>{
	List<ClienteCartao> findByCpf(String cpf);
}
