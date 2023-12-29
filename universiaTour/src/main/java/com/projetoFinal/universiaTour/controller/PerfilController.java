package com.projetoFinal.universiaTour.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.projetoFinal.universiaTour.model.Intinerario;
import com.projetoFinal.universiaTour.model.Turistico;
import com.projetoFinal.universiaTour.model.Usuario;
import com.projetoFinal.universiaTour.repository.IntinerarioRepository;
import com.projetoFinal.universiaTour.repository.TuristicoRepository;
import com.projetoFinal.universiaTour.repository.UsuarioRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class PerfilController {
  
  @Autowired
  private UsuarioRepository usuarioRepository;




  @Autowired
  private IntinerarioRepository intinerarioRepository;

  @Autowired
  private TuristicoRepository turisticoRepository;

  @GetMapping(value = "/testesperfil/{id}")
  public ModelAndView clientById(@PathVariable Integer id) {
    try{
      Optional<Usuario> usuarioOpt = usuarioRepository.findById(id);
      Usuario usuario = usuarioOpt.get();
      List<Intinerario> intinerarios = intinerarioRepository.findByUsuario(usuario);
      List<Turistico> turisticos = turisticoRepository.findAll();
      ModelAndView mv = new ModelAndView("perfil");
      mv.addObject("usr", usuario);
      mv.addObject("itr", intinerarios);
      mv.addObject("tur", turisticos);
      return mv;
    }catch(Exception ex){
      ModelAndView erro = new ModelAndView("erro");
      return erro;
    }
  }

@PostMapping(value = "/testesperfil/edit")
public String edit(Usuario usuario){
  Optional<Usuario> usuarioOpt = usuarioRepository.findById(usuario.getId());
  if(usuarioOpt.isPresent()){
    usuarioRepository.save(usuario);
    return "'redirect:/testesperfil/' +  usuario.getId()";
  }
  return "'/testesperfil/' +  usuario.getId()";
}

@PostMapping(value = "/intinerario/edit")
public String edit(Intinerario intinerario){
  Optional<Intinerario> intinerarioOpt = intinerarioRepository.findById(intinerario.getId());
  if(intinerarioOpt.isPresent()){
    intinerarioRepository.save(intinerario);
    return "'redirect:/intinerario/edit";
  }
  return "'/testesperfil/' +  usuario.getId()";
}

}