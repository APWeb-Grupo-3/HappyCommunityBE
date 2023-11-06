package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.DetalleDTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.TipoServicioDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.Detalle;
import pe.edu.upc.aaw.backend_happycomunity.entities.TipoServicio;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IDetalleService;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ITipoServicioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Detalle")
public class DetalleController {


    @Autowired
    private IDetalleService detR;

    @PostMapping
    public void registrar(@RequestBody DetalleDTO dto) {
        ModelMapper m = new ModelMapper();
        Detalle t = m.map(dto, Detalle.class);
        detR.insert(t);
    }

    @GetMapping
    public List<DetalleDTO> listar() {
        return detR.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DetalleDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        detR.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody DetalleDTO dto) {
        ModelMapper m = new ModelMapper();
        Detalle t = m.map(dto, Detalle.class);
        detR.insert(t);
    }

}