package com.Mateus.assistencia_tecnica_api.service;
/*
import com.Mateus.assistencia_tecnica_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    public AutenticacaoService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return usuarioRepository.findByEmail(email)
                .map(U -> User.builder()
                        .username(U.getEmail())
                        .password(U.getSenha())
                        .roles(U.getRole()).build())
                .orElseThrow(()-> new UsernameNotFoundException("Usuario não encontrado " + email));
    }
}*/
