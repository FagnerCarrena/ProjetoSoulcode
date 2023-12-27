package com.projetoFinal.univertour.model.repository;

import com.soulcode.projetoFinal.model.Destino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.Column;
@Repository
public interface DestinoRepository extends JpaRepository<Destino, Integer> {
}
