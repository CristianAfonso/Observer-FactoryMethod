package observertry;

import java.util.HashMap;
import java.util.Iterator;

public class YoutubeChannel implements Subject{
    
    private String channelName;
    private HashMap<String, Observer> observers = new HashMap<>();
    private HashMap<String, Video>    videos    = new HashMap<>();
    
    public YoutubeChannel(String channelName){
        this.channelName= channelName;
    }
    @Override
    public void registerObserver(Observer o) {
        observers.put(o.getName(), o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o.getName());
    }

    @Override
    public void notifyObserver() {
        for (Iterator<String> it = observers.keySet().iterator(); it.hasNext();) {
            observers.get(it.next()).update(channelName);
        }
    }
    
    public void registerVideo(Video v){
        videos.put(v.getTitle(), v);
        this.notifyObserver();
    }
    
    public void removeVideo(Video v){
        videos.remove(v.getTitle());
    }
    
}
