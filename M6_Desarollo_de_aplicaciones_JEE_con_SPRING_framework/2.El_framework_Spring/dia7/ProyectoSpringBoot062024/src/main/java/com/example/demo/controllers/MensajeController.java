package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Mensaje;
import com.example.demo.services.MensajeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    @GetMapping
    public List<Mensaje> obtenerMensajes() {
        return mensajeService.obtenerMensajes();
    }

    @GetMapping("/{id}")
    public Optional<Mensaje> obtenerMensajePorId(@PathVariable Long id) {
        return mensajeService.obtenerMensajePorId(id);
    }

    @PostMapping
    public Mensaje crearMensaje(@RequestBody Mensaje mensaje) {
        return mensajeService.crearMensaje(mensaje);
    }

    @DeleteMapping("/{id}")
    public void eliminarMensaje(@PathVariable Long id) {
        mensajeService.eliminarMensaje(id);
    }

    @PutMapping("/{id}")
    public Mensaje actualizarMensaje(@PathVariable Long id, @RequestBody Mensaje nuevoMensaje) {
        return mensajeService.actualizarMensaje(id, nuevoMensaje);
    }

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola Mundo";
    }
}