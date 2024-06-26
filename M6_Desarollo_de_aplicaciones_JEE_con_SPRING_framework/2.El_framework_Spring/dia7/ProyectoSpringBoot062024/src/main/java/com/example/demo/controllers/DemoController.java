package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    // Método para saludar
    @RequestMapping(value = "/saludar", method = RequestMethod.GET)
    public ResponseEntity<String> saludar(@RequestParam String nombre) {
        String saludo = "Hola, " + nombre + "!";
        return ResponseEntity.ok(saludo);
    }

    @GetMapping("/saludar/invitado")
    public ResponseEntity<String> saludarInvitado() {
        String saludo = "Hola, Invitado!";
        return ResponseEntity.ok(saludo);
    }

    // Método para despedirse
    @RequestMapping(value = "/despedirse", method = RequestMethod.GET)
    public ResponseEntity<String> despedirse(@RequestParam String nombre) {
        String despedida = "Adiós, " + nombre + "!";
        return ResponseEntity.ok(despedida);
    }

    @RequestMapping(value = "/despedirse/invitado", method = RequestMethod.GET)
    public ResponseEntity<String> despedirseInvitado() {
        String despedida = "Adiós, Invitado!";
        return ResponseEntity.ok(despedida);
    }

    // Método para obtener la fecha actual
    @RequestMapping(value = "/fecha", method = RequestMethod.GET)
    public ResponseEntity<LocalDate> obtenerFecha() {
        LocalDate fechaActual = LocalDate.now();
        return ResponseEntity.ok(fechaActual);
    }

    @RequestMapping(value = "/fecha/detalle", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> obtenerFechaDetalle() {
        LocalDate fechaActual = LocalDate.now();
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("fecha", fechaActual);
        respuesta.put("descripcion", "La fecha actual del sistema");
        return ResponseEntity.ok(respuesta);
    }

    // Método para eco
    @RequestMapping(value = "/eco", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> eco(@RequestBody Map<String, Object> cuerpoSolicitud) {
        Map<String, Object> respuesta = new HashMap<>(cuerpoSolicitud);
        respuesta.put("eco", true);
        return ResponseEntity.ok(respuesta);
    }

    @RequestMapping(value = "/eco/mensaje", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> ecoConMensaje(@RequestBody Map<String, Object> cuerpoSolicitud) {
        Map<String, Object> respuesta = new HashMap<>(cuerpoSolicitud);
        respuesta.put("eco", true);
        respuesta.put("mensaje", "Esto es una respuesta de eco");
        return ResponseEntity.ok(respuesta);
    }

    // Método para actualizar
    @RequestMapping(value = "/actualizar/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Map<String, Object>> actualizar(@PathVariable String id, @RequestBody Map<String, Object> cuerpoSolicitud) {
        Map<String, Object> respuesta = new HashMap<>(cuerpoSolicitud);
        respuesta.put("idActualizado", id);
        return ResponseEntity.ok(respuesta);
    }

    @RequestMapping(value = "/actualizar/{id}/detalle", method = RequestMethod.PUT)
    public ResponseEntity<Map<String, Object>> actualizarDetalle(@PathVariable String id, @RequestBody Map<String, Object> cuerpoSolicitud) {
        Map<String, Object> respuesta = new HashMap<>(cuerpoSolicitud);
        respuesta.put("idActualizado", id);
        respuesta.put("descripcion", "Detalles de la actualización");
        return ResponseEntity.ok(respuesta);
    }

    // Método para eliminar
    @DeleteMapping("/eliminar/{id}/{id2}")
    public ResponseEntity<Void> eliminar(@PathVariable String id,@PathVariable String id2) {
    	System.out.println(id);
    	System.out.println(id2);
        // Simulación de eliminación
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/eliminar/{id}/confirmacion", method = RequestMethod.DELETE)
    public ResponseEntity<Map<String, String>> eliminarConConfirmacion(@PathVariable String id) {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("idEliminado", id);
        respuesta.put("mensaje", "El elemento ha sido eliminado");
        return ResponseEntity.ok(respuesta);
    }
}
