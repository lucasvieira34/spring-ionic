package com.lucasvieira.pedidos.repository;

import com.lucasvieira.pedidos.domain.Categoria;
import com.lucasvieira.pedidos.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
