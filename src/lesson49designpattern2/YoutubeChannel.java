package lesson49designpattern2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private List<ObserverYoutube> observerYoutubes  =new ArrayList<>();
    public void subsribe(ObserverYoutube observerYoutube){
        observerYoutubes.add(observerYoutube);
    }
    public void unsubscribe(ObserverYoutube observerYoutube){
        observerYoutubes.remove(observerYoutube);
    }
    public void uploadVideo(String videoTitle){
        System.out.println("New video uploaded: " + videoTitle);
        notifySubscribers(videoTitle);
    }
    private void notifySubscribers(String message){
        for (ObserverYoutube observerYoutube : observerYoutubes) {
            observerYoutube.upgrade(message);
        }
    }
}
