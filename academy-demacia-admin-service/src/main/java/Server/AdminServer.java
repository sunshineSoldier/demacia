package Server;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tuscany.sca.node.SCANode;
import org.apache.tuscany.sca.node.SCANodeFactory;

/**
 * ����������
 *
 * @author 
 */
public class AdminServer {
    private static Log log = LogFactory.getLog(AdminServer.class);
    private static SCANode node;

    /**
     * start account server.
     *
     * @throws java.io.IOException IOException
     */
    public void start() throws Exception {

       
            log.info("===> academy-demacia-admin-service Start Begin");
      
    
        node = SCANodeFactory.newInstance().createSCANode("META-INF/server.composite");
        node.start();
		
       
            log.info("===>academy-demacia-admin-service success");
      
    }

    /**
     * exit system
     */
    public void exit() {
        System.exit(0);
    }

    public void run() throws InterruptedException {
        while (true) {
            Thread.sleep(Long.MAX_VALUE);
        }
    }

    /**
     * ������������.
     * @param args
     * @throws Exception Exception
     */
    public static void main(String[] args) throws Exception {
        AdminServer adminServer = new AdminServer();
        adminServer.start();
        try {
            adminServer.run();
            
        } catch (InterruptedException e) {
            log.error("academy-demacia-admin-service adminServer run error ", e);
        }
    }
}

