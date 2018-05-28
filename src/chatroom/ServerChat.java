package chatroom;

import java.rmi.server.UnicastRemoteObject;
import model.RoomList;

/**
 *
 * @author Eduardo
 */
public class ServerChat extends UnicastRemoteObject implements IServerChat {
    private RoomList listaSalas;

    @Override
    public RoomList getRooms() {
        return listaSalas;
    }

    @Override
    public void createRoom(String roomName) {
        RoomChat room = new RoomChat(roomName);
        listaSalas.addSala(room);
    } 
    
}
