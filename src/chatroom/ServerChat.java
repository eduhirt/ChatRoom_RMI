/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroom;

import java.rmi.server.UnicastRemoteObject;
import model.roomList;

/**
 *
 * @author Eduardo
 */
public class ServerChat extends UnicastRemoteObject implements IServerChat {

    @Override
    public roomList getRooms() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createRoom(String roomName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
}
