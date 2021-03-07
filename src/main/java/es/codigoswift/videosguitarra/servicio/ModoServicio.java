package es.codigoswift.videosguitarra.servicio;

import es.codigoswift.videosguitarra.beans.Modo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ModoServicio {
    public List<Modo> modosOrdenAscendente();
}
