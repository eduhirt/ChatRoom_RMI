package model;

import chatroom.UserChat;
import java.util.ArrayList;

/**
 *
 * @author Mattheus
 */
public class UserList {
    private ArrayList<UserChat> usuarios;
    
    public UserList(){
        usuarios = new ArrayList();
    }
    
    public void addUsuario(UserChat usuario){
        usuarios.add(usuario);
    }
}
