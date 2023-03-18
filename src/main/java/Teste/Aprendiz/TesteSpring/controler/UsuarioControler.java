package Teste.Aprendiz.TesteSpring.controler;

import Teste.Aprendiz.TesteSpring.model.Usuario;
import Teste.Aprendiz.TesteSpring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioControler {

    private static List<Usuario>listaUsuario = new ArrayList<>();
    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "api/usuario/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id){
            return repository.findById(id)
                    .map(record -> ResponseEntity.ok().body(record))
                    .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "api/usuario/salvar")
    public Usuario salvar(@RequestBody Usuario usuario){

        return repository.save(usuario);
    }


}
