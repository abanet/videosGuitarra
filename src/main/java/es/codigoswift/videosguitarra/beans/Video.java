package es.codigoswift.videosguitarra.beans;

import es.codigoswift.videosguitarra.modelo.CategoriaEntity;
import es.codigoswift.videosguitarra.modelo.ModoEntity;
import es.codigoswift.videosguitarra.modelo.TonoEntity;
import lombok.*;

@Getter @Setter
@ToString @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode
public class Video {
    private Integer id;
    private String descripcion;
    private String codigoYoutube;
    private String bpm;
    private CategoriaEntity categoria;
    private TonoEntity tono;
    private ModoEntity modo;
}
