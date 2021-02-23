package es.codigoswift.videosguitarra.beans;


import lombok.*;

@Getter @Setter
@ToString @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode
public class Video {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String codigoYoutube;
    private String bpm;
    private Categoria categoria;
    private Tono tono;
    private Modo modo;
}
