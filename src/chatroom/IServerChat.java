/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroom;

import model.RoomList;

/**
 *
 * @author Eduardo
 */
public interface IServerChat {
    public RoomList getRooms();
    public void createRoom(String roomName);
}
