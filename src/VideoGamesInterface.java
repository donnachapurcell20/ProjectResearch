import java.rmi.Remote;
import java.rmi.RemoteException;

public interface VideoGamesInterface extends Remote
{
    public int getId() throws RemoteException;

    public String getGame() throws RemoteException;

    public String getGenre() throws RemoteException;

    public String getDeveloper() throws RemoteException;

    public String getPublisher() throws RemoteException;

    public String getPlatform() throws RemoteException;
}
