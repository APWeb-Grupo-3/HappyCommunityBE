package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;
import pe.edu.upc.aaw.backend_happycomunity.entities.Usuario;

import java.util.List;

public interface IDocumentoPagoService {
    public void insert(DocumentoPago documentoPago);
    public List<DocumentoPago>list();
    public void delete(int idDocumentoPago);
    public DocumentoPago listarId(int idDocumentoPago);

}
