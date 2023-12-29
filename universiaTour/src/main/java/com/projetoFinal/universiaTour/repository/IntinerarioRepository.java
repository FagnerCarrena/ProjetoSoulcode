package com.projetoFinal.universiaTour.repository;

import java.util.List;
import com.projetoFinal.universiaTour.model.Intinerario;
import com.projetoFinal.universiaTour.model.Usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntinerarioRepository extends JpaRepository<Intinerario, Integer> {
  List<Intinerario> findByUsuario(Usuario usuario);
}