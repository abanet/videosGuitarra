package es.codigoswift.videosguitarra.beans;

import es.codigoswift.videosguitarra.modelo.VideosEntity;
import lombok.*;

import java.util.Collection;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Modo {
    private Integer id;
    private String nombre;
    private Collection<VideosEntity> videos;
}
