package chatroom;

/**
 *
 * @author Eduardo
 */
public class UserChat implements IUserChat{
    private String usrName;
    
    public UserChat(String usrName) {
        this.usrName = usrName;
    }
    
    @Override
    public void deliverMsg(String senderName, String msg){
        
    }
}
