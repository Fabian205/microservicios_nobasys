package com.nobasys.carroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nobasys.carroservice.entity.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer>{
	List<Carro> findByUsuarioId(int usuarioId);
}
