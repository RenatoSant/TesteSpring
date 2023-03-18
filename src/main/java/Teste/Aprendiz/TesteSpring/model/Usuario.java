package Teste.Aprendiz.TesteSpring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Usuario {
    @Id
    private Integer id;
    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 10)
    private String login;
    @Column(nullable = false, length = 10)
    private String senha;
}
