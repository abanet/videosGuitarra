package es.codigoswift.videosguitarra.beans;

import lombok.*;

import java.util.Collection;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Tono {
    private Integer id;
    private String nombre;
    private Collection<Video> videos;
}
