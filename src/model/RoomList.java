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

    public ArrayList<RoomChat> getRoomList() {
        return salas;
    }

    public void setRoomList(ArrayList<RoomChat> list) {
        this.salas = list;
    }
    
    public void addSala(RoomChat sala){
        salas.add(sala);
    }
}
