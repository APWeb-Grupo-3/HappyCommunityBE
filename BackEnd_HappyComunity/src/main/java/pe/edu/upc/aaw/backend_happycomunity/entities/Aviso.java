package pe.edu.upc.aaw.backend_happycomunity.entities;

import javax.persistence.*;
@Entity
@Table(name = "Aviso")
public class Aviso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAviso;
    @Column(name = "titulo",length = 50,nullable = false)
    private String titulo;
    @Column(name = "descripcion",length = 200,nullable = false)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "idCondominio")
    private Condominio condominio;

    public Aviso() {
    }

    public Aviso(int idAviso, String titulo, String descripcion, Usuario usuario, Condominio condominio) {
        this.idAviso = idAviso;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.condominio = condominio;
    }

    public int getIdAviso() {
        return idAviso;
    }

    public void setIdAviso(int idAviso) {
        this.idAviso = idAviso;
    }

    public String getTitutlo() {
        return titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titutlo) {
        this.titulo = titutlo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
}
