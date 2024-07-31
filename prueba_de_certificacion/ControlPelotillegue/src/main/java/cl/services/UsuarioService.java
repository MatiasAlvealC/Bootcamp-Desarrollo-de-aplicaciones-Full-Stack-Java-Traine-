package cl.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import cl.models.Rol;
import cl.models.Usuario;
import cl.repositories.RolRepository;
import cl.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private RolRepository rolRepository;
  
    // encriptar la contraseña
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    
    public UsuarioService(UsuarioRepository usuarioRepository, RolRepository
    	    rolRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
    	    this.usuarioRepository = usuarioRepository;
    	    this.rolRepository = rolRepository;
    	    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
   }
    public void saveWithUsuarioRol(Usuario usuario, String rolNombre) {
        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));

        // Buscar el rol por nombre
        Rol rol = rolRepository.findByNombre(rolNombre);

        // Si el rol no existe, crear uno nuevo
        if (rol == null) {
            rol = new Rol();
            rol.setNombre(rolNombre);
            rol = rolRepository.save(rol); // Guardar el nuevo rol en la base de datos y obtenerlo con ID asignado
        }

        // Asignar el rol al usuario
        usuario.setRoles(Collections.singletonList(rol)); // Utilizar Collections.singletonList para asegurar que se asigna solo un rol
        usuarioRepository.save(usuario);
    }


    public Usuario findByUserEmail(String usercorreo) {
    	return usuarioRepository.findByEmail(usercorreo);
    }
    public Usuario findByDni(String dni) {
        return usuarioRepository.findByDni(dni);
    }

}
