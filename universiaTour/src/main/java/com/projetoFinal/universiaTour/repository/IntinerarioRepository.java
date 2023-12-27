package com.projetoFinal.universiaTour.repository;

import com.projetoFinal.universiaTour.model.Intinerario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntinerarioRepository extends JpaRepository<Intinerario, Integer> {
}