package observertry;

public class Subscriptor extends ObserverFactory implements Observer{
    private String userName;
    
    Subscriptor(String userName){
        this.userName=userName;
    }

    @Override
    public void update(String chName) {
            System.out.println("¡" + userName+ "! " + chName + " ha subido un nuevo video." );
    }
    public void setComentario(Video v,  String comentario){
        v.setComentario(userName + ": " + comentario);
    }
    
    @Override
    public String getName(){
        return this.userName;
    }
    
}
