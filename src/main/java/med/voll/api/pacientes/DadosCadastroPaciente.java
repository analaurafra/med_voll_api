package med.voll.api.pacientes;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String telefone, String cpf, String email, DadosEndereco endereco) {

}
