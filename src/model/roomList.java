package model;

import chatroom.RoomChat;
import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
public class RoomList {
    private ArrayList<RoomChat> salas;
    
    public RoomList(){
        salas = new ArrayList();
    }

    public ArrayList getRoomlist() {
        return salas;
    }

    public void setRoomlist(ArrayList roomlist) {
        this.salas = salas;
    }
    
    public void addSala(RoomChat sala){
        salas.add(sala);
    }
}
