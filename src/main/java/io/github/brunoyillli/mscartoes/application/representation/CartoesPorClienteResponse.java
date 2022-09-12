package io.github.brunoyillli.mscartoes.application.representation;

import java.math.BigDecimal;

import io.github.brunoyillli.mscartoes.domain.ClienteCartao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartoesPorClienteResponse {
	private String nome;
	private String bandeira;
	private BigDecimal limiteLiberado;
	
	public static CartoesPorClienteResponse fromModel(ClienteCartao clienteCartao) {
		return new CartoesPorClienteResponse(
				clienteCartao.getCartao().getNome(),
				clienteCartao.getCartao().getBandeira().toString(),
				clienteCartao.getLimite()
		);
	}
}
