package com.projetoFinal.universiaTour.repository;

import com.soulcode.projetoFinal.model.Intinerario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface IntinerarioRepository extends JpaRepository<Intinerario, Integer> {
}