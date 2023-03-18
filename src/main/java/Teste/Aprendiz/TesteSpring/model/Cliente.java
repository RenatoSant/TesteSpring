package Teste.Aprendiz.TesteSpring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Cliente {
    @Id
    private String id;
    private String nome;
    private String email;
    private String telefone;

}
