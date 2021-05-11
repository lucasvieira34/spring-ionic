package com.lucasvieira.pedidos.dto;

import com.lucasvieira.pedidos.domain.Categoria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoriaDTO {

    private Integer id;
    private String nome;

    public CategoriaDTO(Categoria obj) {
        id = obj.getId();
        nome = obj.getNome();
    }

}
