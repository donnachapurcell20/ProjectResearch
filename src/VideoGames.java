import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class VideoGames extends UnicastRemoteObject implements VideoGamesInterface, Serializable
{
    private int id;
    private String game;
    private String genre;
    private String developer;
    private String publisher;
    private String platform;

    public VideoGames(VideoGamesInterface inter) throws RemoteException
    {
        this.id = inter.getId();
        this.game = inter.getGame();
        this.genre = inter.getGenre();
        this.developer = inter.getDeveloper();
        this.publisher = inter.getPublisher();
        this.platform = inter.getPlatform();

    }

    public VideoGames(int id, String game, String genre, String developer, String publisher, String platform) throws RemoteException {

        this.id = id;
        this.game = game;
        this.genre = genre;
        this.developer = developer;
        this.publisher = publisher;
        this.platform = platform;


    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

}
