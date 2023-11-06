package pe.edu.upc.aaw.backend_happycomunity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend_happycomunity.entities.Condominio;
import pe.edu.upc.aaw.backend_happycomunity.entities.Detalle;
import pe.edu.upc.aaw.backend_happycomunity.repositories.IDetalleRepository;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IDetalleService;

import java.util.List;

@Service

public class DetalleServiceInterface implements IDetalleService {


    @Autowired
    private IDetalleRepository detR;

    @Override
    public void insert(Detalle detalle) {
        detR.save(detalle);
    }

    @Override
    public List<Detalle> list() {
        return detR.findAll();
    }

    @Override
    public void delete(int idDetalle) {
        detR.deleteById(idDetalle);

    }

    @Override
    public Detalle listarId(int idDetalle) {
        return detR.findById(idDetalle).orElse( new Detalle());
    }

}
