package med.voll.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.medico.DadosCadastroMedico;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping
public class PacienteController {

    @PostMapping()
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        System.out.println("recebidos: "+dados);        
    }
    
}
