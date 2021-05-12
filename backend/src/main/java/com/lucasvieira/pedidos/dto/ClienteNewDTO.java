package com.lucasvieira.pedidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteNewDTO {

    private String nome;
    private String email;
    private String cpfOuCnpj;
    private Integer tipo;

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;

    private String telefone1;
    private String telefone2;
    private String telefone3;

    private Integer cidadeId;

//    @NotEmpty(message = "Preenchimento obrigatório.")
//    @Length(min = 5, max = 120, message = "O tamanho deve ser entre 5 e 120 caracteres.")
//    @NotEmpty(message = "Preenchimento obrigatório.")
//    @Email(message = "Email inválido.")

}
