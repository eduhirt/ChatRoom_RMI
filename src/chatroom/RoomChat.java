package chatroom;

import java.rmi.AccessException;
import java.rmi.RemoteException;
import model.Mensagem;
import model.User;
import model.UserList;

/**
 *
 * @author Eduardo
 */
public class RoomChat implements IRoomChat{
    private String roomName;
    private IRoomChat stub;
    private int codigo;
    private String hostaddress;
    private String nome;
    private UserList listaUsuarios;
    
    public RoomChat(String roomName) {
        this.roomName = roomName;
        this.listaUsuarios = new UserList();
    }
    
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    
    @Override
    public void sendMsg(String usrName, String msg){
        // Monta a mensagem
            Mensagem m = new Mensagem();

            User eu = new User();
            eu.setId(this.codigo);
            eu.setIp(this.hostaddress);
            eu.setName(this.nome);

            m.setFrom(eu);
            //m.setMessage(this.txtMensagem.getText());

            // Envia a mensagem
            stub.sendMsg(eu.getName(), "mensagem");

            //this.appendMessage(this.nome + " (" + this.hostaddress + "): " + m.getMessage());

            // Limpa a caixa de texto
            //this.txtMensagem.setText("");

            // seta o foco
            //this.txtMensagem.requestFocus();

        //} catch (AccessException e) {
            //this.appendMessage("Erro no acesso: " + e.getMessage());
            //disconnect();
        //} catch (RemoteException e) {
            //this.appendMessage("Erro Remoto: " + e.getMessage());
            //disconnect();
        //}
    }
    
    @Override
    public void joinRoom(String usrName){
        
    }
    
    @Override
    public void leaveRoom(String usrName){
        
    }
    
    @Override
    public void closeRoom(){
        
    }
}
