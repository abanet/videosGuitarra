package es.codigoswift.videosguitarra.beans;


import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Getter @Setter
@ToString @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode
@Validated
public class Video {
    private Integer id;
    @NotEmpty
    @NotBlank
    private String nombre;
    private String descripcion;
    @NonNull @NotBlank
    private String codigoYoutube;
    private String bpm;
    private Categoria categoria;
    private Tono tono;
    private Modo modo;
}
