package es.codigoswift.videosguitarra.servicio;

import es.codigoswift.videosguitarra.beans.Tono;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TonoServicio {
    public List<Tono> tonosOrdenAscendente();
}
