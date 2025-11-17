package med.voll.api.medico;

import jakarta.persistence.*; // por enquanto mantive disponível para todos
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;


@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor //gerar o construtor default sem argumentos
@AllArgsConstructor //construtor que recebe todos os campos
@EqualsAndHashCode(of ="id") //irá gerar em cima do id e não em cima de todos os atributos.
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded  // utilizei embeddable attributes da jpa o qual irá considerar que os campos fazem parte da mesma tabela de médicos
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco()); //será necessário criar um construtor p/ endereço
    }
}
