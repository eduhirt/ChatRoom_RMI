/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroom;

/**
 *
 * @author Eduardo
 */
public interface IRoomChat {
    public void sendMsg(String usrName, String msg);
    public void joinRoom(String usrName);
    public void leaveRoom(String usrName);
    public void closeRoom();
    public String getRoomName();
}
