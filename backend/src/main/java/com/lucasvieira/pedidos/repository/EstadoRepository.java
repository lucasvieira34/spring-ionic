package com.lucasvieira.pedidos.repository;

import com.lucasvieira.pedidos.domain.Cidade;
import com.lucasvieira.pedidos.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
