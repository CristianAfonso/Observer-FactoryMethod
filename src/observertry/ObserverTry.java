package observertry;

import java.util.Iterator;

public class ObserverTry {

    public static void main(String[] args) {
        
        YoutubeChannel nuevoCanal = new YoutubeChannel("xXxIS2xXx");
        Observer observador1 = ObserverFactory.observerFactory("Manolito14", true);
        Observer observador2 = ObserverFactory.observerFactory("RickElPepinillo", false);
        Observer observador3 = ObserverFactory.observerFactory("SoloEnClase", false);
        Observer observador4 = ObserverFactory.observerFactory("GitHubPlayer", true);
        nuevoCanal.registerObserver(observador1);
        nuevoCanal.registerObserver(observador2);
        nuevoCanal.registerObserver(observador3);
        nuevoCanal.registerObserver(observador4);
        Video nuevoVideo = new Video("FactoryMethod y Observer explicado en 1 minuto!", 60);
        nuevoCanal.registerVideo(nuevoVideo);
        observador1.setComentario(nuevoVideo, "Me ha gustado mucho el video pero no entiendo que es una interfaz");
        observador2.setComentario(nuevoVideo, "Me he perdido cuando dices lo de el punto y coma (;) ");
        observador3.setComentario(nuevoVideo, "Creo que debes comprarte otro micro");
        observador4.setComentario(nuevoVideo, "Hemos aprendido mucho contigo IS2!");
        System.out.println("Los comentarios del video son: ");
        for(Iterator<String> it = nuevoVideo.getComentarios().iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
    
}
