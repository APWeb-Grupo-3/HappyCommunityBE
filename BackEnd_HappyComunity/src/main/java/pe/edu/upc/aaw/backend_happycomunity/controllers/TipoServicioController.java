package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.CondominioDTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.TipoDocPagoDTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.TipoServicioDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.TipoServicio;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ITipoServicioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TipoServicio")
public class TipoServicioController {



    @Autowired
    private ITipoServicioService tsS;
    @PostMapping
    public void registrar(@RequestBody TipoServicioDTO dto){
        ModelMapper m=new ModelMapper();
        TipoServicio t=m.map(dto,TipoServicio.class);
        tsS.insert(t);
    }
    @GetMapping
    public List<TipoServicioDTO> listar(){
        return tsS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoServicioDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public TipoServicioDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        TipoServicioDTO dto=m.map(tsS.listarId(id),TipoServicioDTO.class);
        return dto;
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        tsS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody TipoServicioDTO dto){
        ModelMapper m=new ModelMapper();
        TipoServicio t=m.map(dto,TipoServicio.class);
        tsS.insert(t);
    }















}
