package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.TipoDocPago;
import pe.edu.upc.aaw.backend_happycomunity.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    public List<Usuario>list();
    public void delete(int idUsuario);
    public Usuario listarId(int idUsuario);

}
