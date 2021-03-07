package es.codigoswift.videosguitarra.servicio;

import es.codigoswift.videosguitarra.beans.Tono;
import es.codigoswift.videosguitarra.mappers.TonoMapper;
import es.codigoswift.videosguitarra.modelo.TonoEntity;
import es.codigoswift.videosguitarra.repositorio.TonoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TonoServicioImpl implements TonoServicio {

    @Autowired
    TonoRepositorio tonoRepositorio;

    @Override
    public List<Tono> tonosOrdenAscendente() {
        List<TonoEntity> tonoEntityList = tonoRepositorio.findAllByOrderByNombreAsc();
        List<Tono> tonoList = TonoMapper.INSTANCE.toListTono(tonoEntityList);
        return tonoList;
    }
}
