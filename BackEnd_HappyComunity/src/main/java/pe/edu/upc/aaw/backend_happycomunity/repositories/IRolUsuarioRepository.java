package pe.edu.upc.aaw.backend_happycomunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend_happycomunity.entities.RolUsuario;

@Repository
public interface IRolUsuarioRepository extends JpaRepository<RolUsuario,Integer> {

}
