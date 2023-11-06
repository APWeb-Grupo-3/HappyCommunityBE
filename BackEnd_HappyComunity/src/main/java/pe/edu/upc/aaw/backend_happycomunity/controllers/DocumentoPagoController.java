package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.CondominioDTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.DocumentoPagoDTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.UsuarioDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;
import pe.edu.upc.aaw.backend_happycomunity.entities.Usuario;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IDocumentoPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/documentodepagos")
public class DocumentoPagoController {
    @Autowired
    private IDocumentoPagoService dS;
    //HU26: Registrar documento de pago
    @PostMapping
    public void registrar(@RequestBody DocumentoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        DocumentoPago d=m.map(dto,DocumentoPago.class);
        dS.insert(d);
    }
    @GetMapping
    public List<DocumentoPagoDTO>listar(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DocumentoPagoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public DocumentoPagoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        DocumentoPagoDTO dto=m.map(dS.listarId(id),DocumentoPagoDTO.class);
        return dto;
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        dS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody DocumentoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        DocumentoPago d=m.map(dto,DocumentoPago.class);
        dS.insert(d);
    }
}
