package med.voll.api.controller;

import org.springframework.web.bind.annotation.RestController;

import med.voll.api.medico.DadosCadastroMedico;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("medicos")

public class MedicoController {

    @PostMapping()
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        //TODO: process POST request
        System.out.println(dados);
        //return dados;
    }
    
    public void cadasasdasdtart() {
        //dsf
    } 
    
}
