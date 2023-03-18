package Teste.Aprendiz.TesteSpring.resources;


import Teste.Aprendiz.TesteSpring.model.Cliente;
import Teste.Aprendiz.TesteSpring.repository.ClienteRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ClienteResources {

    private ClienteRepository clienteRepository;
    public Cliente criarId(Cliente cliente){
        cliente.setId(UUID.randomUUID().toString());
        return clienteRepository.save(cliente);
    }

    public Cliente obterId(String id){
        return clienteRepository.findById(id).orElse(null);
    }

    public List<Cliente>obterTodos(){
        List<Cliente>lista = new ArrayList<>();
        clienteRepository.findAll().forEach(cliente -> lista.add(cliente));
        return lista;
    }

    public Cliente atualizar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente apagar(String id){
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
        clienteRepository.delete(cliente);
        return cliente;
    }
}
