package es.codigoswift.videosguitarra.modelo;

import javax.persistence.*;

@Entity
@Table(name = "videos", schema = "videosguitarra")
public class VideosEntity {
    private Integer id;
    private String descripcion;
    private String codigoYoutube;
    private String bpm;
    private CategoriaEntity categoria;
    private TonoEntity tono;
    private ModoEntity modo;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "codigoYoutube")
    public String getCodigoYoutube() {
        return codigoYoutube;
    }

    public void setCodigoYoutube(String codigoYoutube) {
        this.codigoYoutube = codigoYoutube;
    }

    @Basic
    @Column(name = "bpm")
    public String getBpm() {
        return bpm;
    }

    public void setBpm(String bpm) {
        this.bpm = bpm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideosEntity that = (VideosEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (codigoYoutube != null ? !codigoYoutube.equals(that.codigoYoutube) : that.codigoYoutube != null)
            return false;
        if (bpm != null ? !bpm.equals(that.bpm) : that.bpm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (codigoYoutube != null ? codigoYoutube.hashCode() : 0);
        result = 31 * result + (bpm != null ? bpm.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id", nullable = false)
    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    @ManyToOne
    @JoinColumn(name = "tono_id", referencedColumnName = "id", nullable = false)
    public TonoEntity getTono() {
        return tono;
    }

    public void setTono(TonoEntity tonoByTonoId) {
        this.tono = tonoByTonoId;
    }

    @ManyToOne
    @JoinColumn(name = "modo_id", referencedColumnName = "id", nullable = false)
    public ModoEntity getModo() {
        return modo;
    }

    public void setModo(ModoEntity modo) {
        this.modo = modo;
    }
}
