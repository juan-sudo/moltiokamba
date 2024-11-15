package com.example.proyectoInei.controllers;

import com.example.proyectoInei.entities.Usuario;
import com.example.proyectoInei.services.UsuarioServicenuevo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UsuarioServicenuevo usuarioService;

    @GetMapping("/hola")
    public ResponseEntity<String> saludoAdmin(){
        return ResponseEntity.ok("Hola Usuario");
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Usuario>> todos(){
        return ResponseEntity.ok(usuarioService.getUsuarios());
    }
}
