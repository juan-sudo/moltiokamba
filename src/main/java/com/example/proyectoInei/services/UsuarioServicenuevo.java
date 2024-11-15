package com.example.proyectoInei.services;


import com.example.proyectoInei.entities.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioServicenuevo {
    UserDetailsService userDetailService();
    List<Usuario> getUsuarios();
}
