package com.projetoFinal.universiaTour.repository;

import java.util.List;

import com.projetoFinal.universiaTour.model.Destino;
import com.projetoFinal.universiaTour.model.Turistico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuristicoRepository extends JpaRepository<Turistico, Integer> {
List<Turistico> findByDestino(Destino destino);
}