package com.lucasvieira.pedidos.service;

import com.lucasvieira.pedidos.domain.Pedido;
import com.lucasvieira.pedidos.exceptions.ObjectNotFoundException;
import com.lucasvieira.pedidos.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                        "Objeto não encontrado! ID: " + id + ", TIPO: " + Pedido.class.getName()
        ));

    }

}
