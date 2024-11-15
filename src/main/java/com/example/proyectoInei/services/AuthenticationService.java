package com.example.proyectoInei.services;



import com.example.proyectoInei.aggregates.request.SignInRequest;
import com.example.proyectoInei.aggregates.request.SignUpRequest;
import com.example.proyectoInei.aggregates.response.AuthenticationResponse;
import com.example.proyectoInei.entities.Usuario;

import java.util.List;

public interface AuthenticationService {
    Usuario signUpUser(SignUpRequest signUpRequest);
    Usuario signUpAdmin(SignUpRequest signUpRequest);
    List<Usuario> todos();
    AuthenticationResponse signin(SignInRequest signInRequest);
    boolean validateToken(String token);


}

