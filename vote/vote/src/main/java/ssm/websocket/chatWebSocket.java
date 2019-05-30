package ssm.websocket;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.ArrayList;
import java.util.List;

@ServerEndpoint("/echo")
public class chatWebSocket {
    private static List<Session> sessions = new ArrayList<>();

    private Session session;
    @OnOpen
    public  void  open(Session session){
        System.out.println("-------------sessionId:"+session.getId());
    }
}
