package Teste.Aprendiz.TesteSpring.repository;

import Teste.Aprendiz.TesteSpring.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
