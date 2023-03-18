package Teste.Aprendiz.TesteSpring.repository;

import Teste.Aprendiz.TesteSpring.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, String> {
}
