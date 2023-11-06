package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;
import pe.edu.upc.aaw.backend_happycomunity.entities.Mensaje;

import java.util.List;

public interface IMensajeService {

    public void insert(Mensaje mensaje);
    public List<Mensaje> list();
    public void delete(int idMensaje);
    public Mensaje listarId(int idMensaje);

}
