package Teste.Aprendiz.TesteSpring.controler;

import Teste.Aprendiz.TesteSpring.dto.ClienteResponse;
import Teste.Aprendiz.TesteSpring.resources.ClienteResources;
import Teste.Aprendiz.TesteSpring.dto.ClienteRequest;
import Teste.Aprendiz.TesteSpring.model.Cliente;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    private ClienteResources clienteResources;
    @PostMapping
    public String cadastroCliente(@RequestBody ClienteRequest clienteRequest){
        Cliente cliente = new Cliente();
        cliente.setNome(clienteRequest.getNome());
        cliente.setEmail(clienteRequest.getEmail());
        cliente.setTelefone(clienteRequest.getTelefone());
        cliente = clienteResources.criarId(cliente);
        return cliente.getId();
    }


    public List<ClienteResponse>readAll(){
        return clienteResources.obterTodos().stream().map(cliente -> {
            ClienteResponse clienteResponse = new ClienteResponse();
            BeanUtils.copyProperties(cliente, clienteResponse);
            return clienteResponse;
        }).collect(Collectors.toList());
    }

}
