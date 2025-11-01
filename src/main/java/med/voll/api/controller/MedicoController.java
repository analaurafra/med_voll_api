package med.voll.api.controller;


import med.voll.api.medicos.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos") //irá chamar apenas o caminho /medicos que chamará o método cadastrar

public class MedicoController {

    //Criando metodo cadastro e postmapping para atender à solicitação POST

    @PostMapping //mapeando o metodo post
    public void cadastrar(@RequestBody DadosCadastroMedico dados) { //metodo cadastrar irá receber um json
        System.out.println(dados);


    }


}
