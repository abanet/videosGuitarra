package es.codigoswift.videosguitarra.servicio;

import es.codigoswift.videosguitarra.beans.Modo;
import es.codigoswift.videosguitarra.mappers.ModoMapper;
import es.codigoswift.videosguitarra.modelo.ModoEntity;
import es.codigoswift.videosguitarra.repositorio.ModoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModoServicioImpl implements ModoServicio {
    @Autowired
    ModoRepositorio modoRepositorio;

    @Override
    public List<Modo> modosOrdenAscendente() {

        List<ModoEntity> modoEntityList = modoRepositorio.findAllByOrderByNombreAsc();
        List<Modo> modoList = ModoMapper.INSTANCE.toListModo(modoEntityList);
        return modoList;
    }
}
