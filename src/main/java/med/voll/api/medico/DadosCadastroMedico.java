package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank    //O nome é obrigatório e não pode ser nulo e nem vazio
        String nome,

        @NotBlank
        @Email      // verifique se o e-mail contem todos os campos obrigatórios do e-email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //o crm precisa ter obrigatoriamente o dígitos (inspeção regular)
        String crm,

        @NotNull  // A especialidade é um Enum e não pode ser nula.
        Especialidade especialidade,

        @NotNull
        @Valid
        DadosEndereco endereco) { // Dados endereço é um outro dto, sendo necessário validá-lo através do @Valid

}

