package med.voll.api.controller;


import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos") //irá chamar apenas o caminho /medicos que chamará o método cadastrar

public class MedicoController {   //Criando metodo cadastro e postmapping para atender à solicitação POST

    @Autowired
     private MedicoRepository repository;

     @PostMapping //mapeando o metodo post
     @Transactional
        public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) { //metodo cadastrar irá receber um json
        repository.save(new Medico(dados)); // os constructor criados puxarão as infos do json

     }


}
