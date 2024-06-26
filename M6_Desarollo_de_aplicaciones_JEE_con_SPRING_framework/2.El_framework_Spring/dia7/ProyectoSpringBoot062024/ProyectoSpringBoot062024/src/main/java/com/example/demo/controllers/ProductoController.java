package com.example.demo.controllers;


import com.example.demo.models.Producto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private List<Producto> productList = new ArrayList<>();

    // Constructor para inicializar algunos productos
    public ProductoController() {
        productList.add(new Producto(1L, "Producto 1", 10.0));
        productList.add(new Producto(2L, "Producto 2", 20.0));
        productList.add(new Producto(3L, "Producto 3", 30.0));
    }

    // Obtener todos los productos
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Producto>> getAllProducts() {
        return ResponseEntity.ok(productList);
    }

    // Obtener un producto por su ID
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Producto> getProductById(@PathVariable Long id) {
        Optional<Producto> product = productList.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
        if (product.isPresent()) {
            return ResponseEntity.ok(product.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Buscar productos por nombre
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ResponseEntity<List<Producto>> searchProductsByName(@RequestParam String nombre) {
        List<Producto> filteredProducts = productList.stream()
                .filter(product -> product.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
        return ResponseEntity.ok(filteredProducts);
    }

    // Añadir un nuevo producto
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Producto> addProduct(@RequestBody Producto product) {
        productList.add(product);
        return ResponseEntity.ok(product);
    }

    // Actualizar un producto existente
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Producto> updateProduct(@PathVariable Long id, @RequestBody Producto updatedProduct) {
        Optional<Producto> existingProductOpt = productList.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();

        if (existingProductOpt.isPresent()) {
            Producto existingProduct = existingProductOpt.get();
            existingProduct.setNombre(updatedProduct.getNombre());
            existingProduct.setPrecio(updatedProduct.getPrecio());
            return ResponseEntity.ok(existingProduct);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar un producto
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        boolean removed = productList.removeIf(product -> product.getId().equals(id));
        if (removed) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
