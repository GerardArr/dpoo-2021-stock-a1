import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import model.ConfigJsonReader;

public class Main {

    public static void main(MysqlxDatatypes.Scalar.String[] args) {

        int port;
        String ip, dataname, username, password;

        ConfigJsonReader cjr = new ConfigJsonReader();
        port = cjr.readDataPort();
        ip = cjr.readDataIP();
        dataname = cjr.readDataName();
        username = cjr.readDataUsername();
        password = cjr.readDataPassword();

        System.out.println(port+" "+ip+" "+dataname+" "+username+" "+password);



    }
}
