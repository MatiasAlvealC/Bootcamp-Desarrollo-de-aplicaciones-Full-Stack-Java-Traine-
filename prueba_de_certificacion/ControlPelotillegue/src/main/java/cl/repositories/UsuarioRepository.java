package cl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import cl.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {

	Usuario findByEmail(@Param("email") String email); 
    Usuario findByDni(String dni);
}