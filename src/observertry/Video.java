package observertry;

import java.util.ArrayList;

public class Video {
    private String title;
    private int length;
    private ArrayList<String> comentarios = new ArrayList<>();
    public Video(String title, int length){
        this.title=title;
        this.length=length;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public int getLength(){
        return this.length;
    }
    public void setComentario(String comentario){
        comentarios.add(comentario);
    }
    public ArrayList<String> getComentarios(){
        return this.comentarios;
    }
}
