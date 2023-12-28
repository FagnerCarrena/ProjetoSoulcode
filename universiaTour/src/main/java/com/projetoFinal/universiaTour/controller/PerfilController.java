package com.projetoFinal.universiaTour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.projetoFinal.universiaTour.repository.IntinerarioRepository;
import com.projetoFinal.universiaTour.repository.TuristicoRepository;
import com.projetoFinal.universiaTour.repository.UsuarioRepository;

@Controller
public class PerfilController {
  
  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private IntinerarioRepository intinerarioRepository;

  @Autowired
  private TuristicoRepository turisticoRepository;

  

}
