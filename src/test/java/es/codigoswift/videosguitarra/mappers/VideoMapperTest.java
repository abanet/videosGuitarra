package es.codigoswift.videosguitarra.mappers;

import es.codigoswift.videosguitarra.beans.Categoria;
import es.codigoswift.videosguitarra.beans.Modo;
import es.codigoswift.videosguitarra.beans.Tono;
import es.codigoswift.videosguitarra.beans.Video;
import es.codigoswift.videosguitarra.modelo.CategoriaEntity;
import es.codigoswift.videosguitarra.modelo.ModoEntity;
import es.codigoswift.videosguitarra.modelo.TonoEntity;
import es.codigoswift.videosguitarra.modelo.VideosEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class VideoMapperTest {

    @Test
    void toVideo() {
        //given
        CategoriaEntity categoriaEntity = new CategoriaEntity();
        categoriaEntity.setId(1);
        categoriaEntity.setNombre("backingTracks");
        categoriaEntity.setVideos(null);
        ModoEntity modoEntity = new ModoEntity();
        modoEntity.setId(1);
        modoEntity.setNombre("Mayor");
        modoEntity.setVideos(null);
        TonoEntity tonoEntity = new TonoEntity();
        tonoEntity.setId(1);
        tonoEntity.setNombre("E");
        tonoEntity.setVideos(null);
        VideosEntity videosEntity = new VideosEntity();
        videosEntity.setId(1);
        videosEntity.setDescripcion("video prueba");
        videosEntity.setCodigoYoutube("codigo");
        videosEntity.setBpm("90");
        videosEntity.setCategoria(categoriaEntity);
        videosEntity.setModo(modoEntity);
        videosEntity.setTono(tonoEntity);

        Categoria categoria = new Categoria();
        Modo modo = new Modo();
        Tono tono = new Tono();
        categoria.setId(categoriaEntity.getId());
        categoria.setNombre(categoriaEntity.getNombre());
        categoria.setVideos(categoriaEntity.getVideos());
        modo.setId(modoEntity.getId());
        modo.setNombre(modoEntity.getNombre());
        modo.setVideos(modoEntity.getVideos());
        tono.setId(tonoEntity.getId());
        tono.setNombre(tonoEntity.getNombre());
        tono.setVideos(tonoEntity.getVideos());
        //when
        Video videoDTO = VideoMapper.INSTANCE.toVideo(videosEntity);

        //then
        assertThat( videoDTO ).isNotNull();
        assertThat( videoDTO.getDescripcion() ).isEqualTo( "video prueba" );
        assertThat( videoDTO.getCodigoYoutube() ).isEqualTo( "codigo" );
        assertThat( videoDTO.getBpm() ).isEqualTo( "90" );
        assertThat( videoDTO.getCategoria() ).isEqualTo( categoria );
        assertThat( videoDTO.getModo() ).isEqualTo( modo );
        assertThat( videoDTO.getTono() ).isEqualTo( tono );


    }
}