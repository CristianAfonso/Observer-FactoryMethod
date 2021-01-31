package observertry;

public abstract class ObserverFactory implements Observer {
    
    public static Observer observerFactory(String userName, boolean suscriptor){
        if(suscriptor){
            return new Subscriptor(userName);
        }else{
            return new Seguidor(userName);
        }
    }
}
