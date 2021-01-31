package observertry;

public interface Observer {
    public void update(String chName);
    public String getName();
    public void setComentario(Video v, String comentario);
}
