package cl.desafiolatam.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.proyecto.models.Useres;

@Repository
public interface UserRepository extends JpaRepository<Useres, Long> {
	Useres findByEmail(String email);
	Useres findByName(String name);
	Useres findByNameAndEmail(String name, String email);
	int countByName(String name);

}
