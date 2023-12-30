package com.projetoFinal.universiaTour.controller;

import java.net.URLEncoder;
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

import jakarta.transaction.Transactional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
      ModelAndView mv = new ModelAndView("testesperfil");
      mv.addObject("usr", usuario);
      mv.addObject("itr", intinerarios);
      mv.addObject("tur", turisticos);
      return mv;
    }catch(Exception ex){
      ModelAndView erro = new ModelAndView("erro");
      return erro;
    }
  }
//

@GetMapping(value = "/testesperfil/{id}/edit")
  public ModelAndView update(@PathVariable Integer id){
          Optional<Usuario> usuarioOpt = usuarioRepository.findById(id);
      if(usuarioOpt.isPresent()) {
        ModelAndView mv = new ModelAndView("testesperfil-edit");
        Usuario usuario = usuarioOpt.get();
        mv.addObject("usr", usuario);
        return mv;
      }
      ModelAndView erro = new ModelAndView("erro");
            erro.addObject("msg", "Cliente não encontrado");
            return erro;
  }


@PostMapping(value = "/testesperfil/{id}")
public ModelAndView edit(@PathVariable Integer id, Usuario usuario){
  ModelAndView modelAndView = new ModelAndView();
  try{
    usuarioRepository.findById(id).orElseThrow(() -> new Exception() );
    usuarioRepository.save(usuario);
    String pf = "" + usuario.getId();
modelAndView.setViewName("'redirect:''" + pf);
    
  }catch(Exception exc){
    modelAndView.setViewName("erro");
    modelAndView.addObject("message", exc.getMessage());
  }
  return modelAndView;
}

//@PostMapping(value = "/intinerario/edit")
public String edit(Intinerario intinerario){
  Optional<Intinerario> intinerarioOpt = intinerarioRepository.findById(intinerario.getId());
  if(intinerarioOpt.isPresent()){
    intinerarioRepository.save(intinerario);
    return "'redirect:/intinerario/edit";
  }
  return "'/testesperfil/' +  usuario.getId()";
}
teste jwt
  public String edit(Usuario usuario) {
    try {
      Optional<Usuario> usuarioOpt = usuarioRepository.findById(usuario.getId());
      if(usuarioOpt.isPresent()) {
        usuarioRepository.save(usuario);
      }
    } catch(Exception ex) {
      return "erro";
    }
    String url = "/testesperfil/" + usuario.getId();
    return "redirect:" + url;
  }
@Transactional
@PostMapping(value = "/testesperfil/{id}/delete")
  public String delete(@RequestParam Integer id) {
    try {
      usuarioRepository.deleteById(id);
      return "redirect:/home";
    } catch(Exception ex) {
      return "erro";
    }
  }
  teste git 

//
}