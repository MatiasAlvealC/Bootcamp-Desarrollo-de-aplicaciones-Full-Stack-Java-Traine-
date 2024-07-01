package cl.desafiolatam.proyecto.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.proyecto.models.LibroPedido;

@Repository
public interface LibroPedidoRepository extends JpaRepository<LibroPedido, Long>{

	List<LibroPedido> findByNombreOrAutor(@Param("nombre") String nombre,@Param("autor") String autor);

}
