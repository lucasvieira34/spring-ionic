package com.lucasvieira.pedidos.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PagamentoComCartao extends Pagamento{

    private Integer numerodeParcelas;

}
