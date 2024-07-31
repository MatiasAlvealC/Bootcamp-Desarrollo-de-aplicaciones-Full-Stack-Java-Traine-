package cl.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cl.models.Rol;
import cl.models.Usuario;
import cl.repositories.UsuarioRepository;

@Service
public class UserDetailsServiceImpl  implements UserDetailsService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (usuario == null) {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }
        return new org.springframework.security.core.userdetails.User(usuario.getEmail(), usuario.getPassword(), new ArrayList<>());
    }
    // lista de roles de un usuario
    private List<GrantedAuthority> getAuthorities(Usuario usuario) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (Rol rol : usuario.getRoles()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(rol.getNombre());
            authorities.add(grantedAuthority);
        }
        return authorities;
    }
}