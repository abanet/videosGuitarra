package es.codigoswift.videosguitarra.modelo;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "modo", schema = "videosguitarra")
public class ModoEntity {
    private Integer id;
    private String nombre;
    private Collection<VideosEntity> videos;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModoEntity that = (ModoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "modo")
    public Collection<VideosEntity> getVideos() {
        return videos;
    }

    public void setVideos(Collection<VideosEntity> videos) {
        this.videos = videos;
    }
}
