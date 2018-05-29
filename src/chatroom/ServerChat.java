package chatroom;

import java.rmi.server.UnicastRemoteObject;
import model.RoomList;

/**
 *
 * @author Eduardo
 */
public class ServerChat extends UnicastRemoteObject implements IServerChat {
    private RoomList listaSalas;

    public ServerChat() {
        listaSalas = new RoomList();
    }

    @Override
    public RoomList getRooms() {
        return listaSalas;
    }

    @Override
    public void createRoom(String roomName) {
        RoomChat room = new RoomChat(roomName);
        listaSalas.addSala(room);
    }
    
    public void imprimirListaSalas(){
        for(int i = 0; i < listaSalas.getRoomList().size(); i++){
            System.out.println(listaSalas.getRoomList().get(i).getRoomName());
        }
    }
    
}
