package es.codigoswift.videosguitarra.beans;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class RespuestaCreateVideo {
    private String data;
    private String error;
}
