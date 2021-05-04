package com.lucasvieira.pedidos.domain.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TipoCliente {

    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURIDICA(2, "Pessoa Jurídica");

    private int codigo;
    private String descricao;

    public static TipoCliente toEnum(Integer codigo) {
        if (codigo == null){
            return null;
        }

        for (TipoCliente x : TipoCliente.values()) {
            if (codigo.equals(x.getCodigo())) {
                return x;
            }
        }

        throw new IllegalArgumentException("ID inválido: " + codigo);
    }
}
