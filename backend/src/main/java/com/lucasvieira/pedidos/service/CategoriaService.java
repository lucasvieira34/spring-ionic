package com.lucasvieira.pedidos.service;

import com.lucasvieira.pedidos.domain.Categoria;
import com.lucasvieira.pedidos.exceptions.ObjectNotFoundException;
import com.lucasvieira.pedidos.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                        "Objeto não encontrado! ID: " + id + ", TIPO: " + Categoria.class.getName()
        ));

    }

}
