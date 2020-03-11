package cl.desafiolatam.pruebafinal.data;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.pruebafinal.data.schemas.YouTubeChannelSchema;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public class YouTubeChannelLocalData {

    public static Observable<List<YouTubeChannelSchema>> getYouTubeData() {
        return Observable.create(new ObservableOnSubscribe<List<YouTubeChannelSchema>>() {
            @Override
            public void subscribe(ObservableEmitter<List<YouTubeChannelSchema>> emitter) throws Exception {
                try {

                    List<YouTubeChannelSchema> youTubeChannelSchemaList = new ArrayList<>();

                    youTubeChannelSchemaList.add(new YouTubeChannelSchema(
                            "Mitos Full Stack Parte 2",
                            1,
                            "¿Debo saber algo de programación antes de entrar a Full Stack? Descubre esto y más.",
                            "https://www.youtube.com/watch?v=QKxXFu7QgHk",
                            "https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373_1280.jpg",
                            "Publicado el 17 jul. 2019"));

                    youTubeChannelSchemaList.add(new YouTubeChannelSchema(
                            "Mitos del Desarrollador Full Stack - Parte 1",
                            2,
                            "¿Debes saber de todo para sacar adelante un proyecto desde cero? ¿La carrera de Full Stack es sólo programación? Acompáñanos a descubrir si estos mitos son ciertos o no.",
                            "https://www.youtube.com/watch?v=qYeI5wGMqw0",
                            "https://cdn.pixabay.com/photo/2015/01/09/11/11/office-594132_1280.jpg",
                            "Publicado el 10 jul. 2019"));

                    youTubeChannelSchemaList.add(new YouTubeChannelSchema(
                            "PODCAST TXS RADIO Automatización en Chile Andrés Gallardo",
                            1,
                            "Hablaremos sobre la Automatización en Chile con Andrés Gallardo",
                            "https://www.youtube.com/watch?v=yZOleRzAisI",
                            "https://cdn.pixabay.com/photo/2015/05/28/14/53/ux-788002_1280.jpg",
                            "Publicado el 29 may. 2019"));

                    youTubeChannelSchemaList.add(new YouTubeChannelSchema(
                            "PODCAST TXS RADIO Data Science Andrés Gallardo",
                            1,
                            "El campo del Data Science ofrece innumerables oportunidades de crecimiento profesional a quienes está interesados en esta rama de la estadística, la matemática y las ciencias de la computación. Un interesante tema que Andrés Gallardo nos comenta a continuación.",
                            "https://www.youtube.com/watch?v=yzSlGhGRBhs",
                            "https://cdn.pixabay.com/photo/2015/06/24/15/45/code-820275_1280.jpg",
                            "Publicado el 29 may. 2019"));

                    youTubeChannelSchemaList.add(new YouTubeChannelSchema(
                            "PODCAST TXS RADIO Déficit Profesionales Andrés Gallardo",
                            2,
                            "¿Cuánta demanda real existe de profesionales TI? Andrés Gallardo, Director de Desarrollo de Desafío Latam nos cuenta de cuánto es el déficit de profesionales de las tecnologías de la información.",
                            "https://www.youtube.com/watch?v=6CNvhTCXIxw",
                            "https://cdn.pixabay.com/photo/2016/11/23/14/45/coding-1853305_1280.jpg",
                            "Publicado el 29 may. 2019"));

                    emitter.onNext(youTubeChannelSchemaList);
                    emitter.onComplete();
                } catch (Exception e) {
                    emitter.onError(e);
                }
            }
        });
    }
}
