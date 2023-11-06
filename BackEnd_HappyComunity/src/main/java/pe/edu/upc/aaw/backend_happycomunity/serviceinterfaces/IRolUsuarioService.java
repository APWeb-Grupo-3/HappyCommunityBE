package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.RolUsuario;
import pe.edu.upc.aaw.backend_happycomunity.entities.TipoServicio;

import java.util.List;

public interface IRolUsuarioService {
    public void insert(RolUsuario rolUsuario);
    public List<RolUsuario> list();
    public void delete(int idRolUsuario);
    public RolUsuario listarId(int idRolUsuario);

}

