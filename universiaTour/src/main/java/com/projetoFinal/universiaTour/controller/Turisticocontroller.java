
package com.projetoFinal.universiaTour.controller;


import com.projetoFinal.universiaTour.model.Destino;
import com.projetoFinal.universiaTour.model.Turistico;

import com.projetoFinal.universiaTour.repository.DestinoRepository;
import com.projetoFinal.universiaTour.repository.TuristicoRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;





@Controller
public class TuristicoController {
    @Autowired
    private TuristicoRepository turisticoRepository;

    @Autowired
    private DestinoRepository destinoRepository;

    @GetMapping(value = "/home/{id}")
    public ModelAndView clienteById(@PathVariable Integer id) {
        Optional<Destino> destinOpt = destinoRepository.findById(id);
        Optional<Turistico> turOpt = turisticoRepository.findById(id);

        if (destinOpt.isPresent()) {
            Destino destino = destinOpt.get();
            Turistico turismo = turOpt.get();


            ModelAndView mv = new ModelAndView("destinos");
            mv.addObject("dest", destino);
            mv.addObject("turisticos", turismo);

            return mv;
        } else {
            ModelAndView erro = new ModelAndView("erro");
            erro.addObject("msg", "Destino não encontrado");
            return erro;
        }
    };


}






