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

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IntinerarioController {
  
  @Autowired
  private IntinerarioRepository intinerarioRepository;

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private TuristicoRepository turisticoRepository;

  @PostMapping(value = "/novointinerario")
  public String create(@RequestParam Integer usuarioId,@RequestParam Integer turisticoId, Intinerario intinerario){
    String url = "erro";
    try{
      Optional<Usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
      Optional<Turistico> turisticoOpt = turisticoRepository.findById(turisticoId);
      if(usuarioOpt.isPresent() && turisticoOpt.isPresent()){
        Usuario usuario = usuarioOpt.get();
        Turistico turistico = turisticoOpt.get();
        intinerario.setUsuario(usuario);
        intinerario.setTuristico(turistico);
        intinerarioRepository.save(intinerario);
        url = "/testesperfil/" + usuario.getId();
        }
      return "redirect:" + url;
      
    }catch (Exception ex){
      return url;
    }
  }

@PostMapping("/intinerario/{id}/delete")
public String delete(@RequestParam Integer usuarioId, @RequestParam Integer id){
  String url ="erro";
  try{
    Optional<Usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
    if(usuarioOpt.isPresent()){
      Usuario usuario = usuarioOpt.get();
      intinerarioRepository.deleteById(id);
    url = "/testesperfil/" + usuario.getId();
    }    
    return "redirect:" + url;
  }catch(Exception ex){
    return url;
  }
}
//
@GetMapping(value = "/intinerario/{intinerarioId}/edit")
  public ModelAndView update(@RequestParam Integer intinerarioId, @RequestParam Integer usuarioId){
          Optional<Intinerario> intinerarioOpt= intinerarioRepository.findById(intinerarioId);
          Optional<Usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
          List<Turistico> turisticos = turisticoRepository.findAll();
      if(intinerarioOpt.isPresent() && usuarioOpt.isPresent()) {
        ModelAndView mv = new ModelAndView("testesintinerario-edit");
        Intinerario intinerario = intinerarioOpt.get();
        Usuario usuario = usuarioOpt.get();
        mv.addObject("itr", intinerario);
        mv.addObject("usr", usuario);
        mv.addObject("tur", turisticos);
        return mv;
      }
      ModelAndView erro = new ModelAndView("erro");
            erro.addObject("msg", "Itinerário não encontrado");
            return erro;
  }

@PostMapping(value = "/intinerario/{id}")
  public String edit(Intinerario intinerario, @RequestParam Integer usuarioId) {
    String url = "erro";
    try {
      Optional<Intinerario> intinerarioOpt = intinerarioRepository.findById(intinerario.getId());
      Optional<Usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
      if(intinerarioOpt.isPresent() && usuarioOpt.isPresent()) {
        intinerario = intinerarioOpt.get();
        intinerarioRepository.save(intinerario);
        Usuario usuario = usuarioOpt.get();
        url = "/testesperfil/" + usuario.getId();
      }
    } catch(Exception ex) {
      return "erro";
    }
    
    
    return "redirect:" + url;
  }


  //
}