package pe.edu.upc.aaw.backend_happycomunity.entities;

import javax.persistence.*;

@Entity
@Table(name= "Detalle")
public class Detalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalle;

    @Column(name="subtotalDetalle", nullable = false)
    private String subtotalDetalle;

    @ManyToOne
    @JoinColumn(name ="idDocumentoPago")
    private DocumentoPago documentoPago;

    @ManyToOne
    @JoinColumn(name ="idServicio")
    private Servicio servicio;


    public Detalle() {
    }


    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getSubtotalDetalle() {
        return subtotalDetalle;
    }

    public void setSubtotalDetalle(String subtotalDetalle) {
        this.subtotalDetalle = subtotalDetalle;
    }

    public DocumentoPago getDocumentoPago() {
        return documentoPago;
    }

    public void setDocumentoPago(DocumentoPago documentoPago) {
        this.documentoPago = documentoPago;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}


