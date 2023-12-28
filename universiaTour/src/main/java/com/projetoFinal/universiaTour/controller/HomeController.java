
package com.projetoFinal.universiaTour.controller;

<<<<<<< HEAD
import com.projetoFinal.universiaTour.model.Destino;
import com.projetoFinal.universiaTour.repository.DestinoRepository;
=======
import com.soulcode.projetoFinal.model.Destino;
import com.soulcode.projetoFinal.repository.DestinoRepository;
>>>>>>> c84d74af2848a42f41d3a677bb4c7f8934b031d5
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private DestinoRepository destinoRepository;

    @GetMapping(value = "/")
    public ModelAndView Destino() {
        List<Destino> destin =  destinoRepository.findAll();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("des", destin);
        return mv;
    }

}
