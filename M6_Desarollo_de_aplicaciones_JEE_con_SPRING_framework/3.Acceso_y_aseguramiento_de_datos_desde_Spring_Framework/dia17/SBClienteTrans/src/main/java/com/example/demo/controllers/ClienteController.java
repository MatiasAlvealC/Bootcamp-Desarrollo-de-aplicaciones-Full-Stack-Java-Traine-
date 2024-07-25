package com.example.demo.controllers;


import com.example.demo.models.Cliente;
import com.example.demo.models.Direccion;
import com.example.demo.models.Factura;
import com.example.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        Cliente cliente = clienteService.getClienteById(id);
        if (cliente == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cliente);
    }
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente createCliente(@RequestBody Cliente cliente) {
             return clienteService.saveCliente(cliente);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente clienteDetails) {
        Cliente cliente = clienteService.getClienteById(id);
        if (cliente == null) {
            return ResponseEntity.notFound().build();
        }
        cliente.setNombre(clienteDetails.getNombre());
        cliente.setDireccion(clienteDetails.getDireccion());
        cliente.setFacturas(clienteDetails.getFacturas());
        Cliente updatedCliente = clienteService.saveCliente(cliente);
        return ResponseEntity.ok(updatedCliente);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        Cliente cliente = clienteService.getClienteById(id);
        if (cliente == null) {
            return ResponseEntity.notFound().build();
        }
        clienteService.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }
}