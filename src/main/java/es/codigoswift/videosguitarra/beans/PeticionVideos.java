package es.codigoswift.videosguitarra.beans;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PeticionVideos {
    private Map<String, Video> data;
    private String action;
}
