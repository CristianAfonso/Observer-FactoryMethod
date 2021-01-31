package observertry;

public class Seguidor extends ObserverFactory implements Observer{
    private String userName;
    Seguidor(String userName){
        this.userName=userName;
    }

    @Override
    public void update(String chName) {
            System.out.println("¡" + userName+ "! " + chName + " ha subido un nuevo video." );
    }
    @Override
    public String getName(){
        return this.userName;
    }

    @Override
    public void setComentario(Video v, String comentario) {
        System.out.println(userName + ": Si quieres colocar un comentario en el video [" +v.getTitle()+"] debes subscribirte ¡Por sólo 1€ al mes!");
    }
}
