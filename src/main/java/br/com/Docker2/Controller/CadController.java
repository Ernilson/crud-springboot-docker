package br.com.Docker2.Controller;

import br.com.Docker2.Model.Cadastro;
import br.com.Docker2.Repository.CadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cad")
public class CadController {

    @Autowired
    private CadRepository cadRepository;

    @GetMapping("/All")
    public List<Cadastro> findAll(){

        return cadRepository.findAll();
    }


}
