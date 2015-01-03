import com.myservice.MyService;
import com.myservice.MyServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by kanishka on 1/4/15.
 */
public class DemoSoapServer {
    public static void main(String[] args) {
        String serviceAddress = "http://localhost:9099/mysoap";
        MyService implementor = new MyServiceImpl();
        Endpoint ep = Endpoint.publish(serviceAddress, implementor);
        System.out.println("Service started..");
        System.out.println("WSDL : " + serviceAddress+ "?wsdl");
    }
}
