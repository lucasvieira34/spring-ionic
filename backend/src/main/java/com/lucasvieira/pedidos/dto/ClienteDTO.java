package com.lucasvieira.pedidos.dto;

import com.lucasvieira.pedidos.domain.Cliente;
import com.lucasvieira.pedidos.service.validation.ClienteUpdate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ClienteUpdate
public class ClienteDTO {

    private Integer id;
    @NotEmpty(message = "Preenchimento obrigatório.")
    @Length(min = 5, max = 120, message = "O tamanho deve ser entre 5 e 120 caracteres.")
    private String nome;
    @NotEmpty(message = "Preenchimento obrigatório.")
    @Email(message = "Email inválido.")
    private String email;

    public ClienteDTO (Cliente obj) {
        id = obj.getId();
        nome = obj.getNome();
        email = obj.getEmail();
    }

}
