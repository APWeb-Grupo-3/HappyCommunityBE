package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.DocumentoPagoDTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.TipoDocPagoDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;
import pe.edu.upc.aaw.backend_happycomunity.entities.TipoDocPago;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IDocumentoPagoService;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ITipoDocPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipodocumentopago")
public class TipoDocPagoController {
    @Autowired
    private ITipoDocPagoService tS;
    //HU27: Registrar tipo documento de pago
    @PostMapping
    public void registrar(@RequestBody TipoDocPagoDTO dto){
        ModelMapper m=new ModelMapper();
        TipoDocPago t=m.map(dto,TipoDocPago.class);
        tS.insert(t);
    }
    @GetMapping
    public List<TipoDocPagoDTO> listar(){
        return tS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoDocPagoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public TipoDocPagoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        TipoDocPagoDTO dto=m.map(tS.listarId(id),TipoDocPagoDTO.class);
        return dto;
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        tS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody TipoDocPagoDTO dto){
        ModelMapper m=new ModelMapper();
        TipoDocPago t=m.map(dto,TipoDocPago.class);
        tS.insert(t);
    }
}
