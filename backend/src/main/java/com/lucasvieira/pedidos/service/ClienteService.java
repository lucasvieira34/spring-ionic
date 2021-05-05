package com.lucasvieira.pedidos.service;

import com.lucasvieira.pedidos.domain.Cliente;
import com.lucasvieira.pedidos.exceptions.ObjectNotFoundException;
import com.lucasvieira.pedidos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                        "Objeto não encontrado! ID: " + id + ", TIPO: " + Cliente.class.getName()
        ));

    }

}
