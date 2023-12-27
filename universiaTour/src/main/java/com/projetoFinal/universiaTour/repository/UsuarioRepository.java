package com.soulcode.projetoFinal.repository;

import com.soulcode.projetoFinal.model.Intinerario;
import com.soulcode.projetoFinal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}