import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws Exception {  // 파일 불러오기 떄문에  throws Exception 필요
        Properties properties = new Properties();  // String 타입으로 고정되어있어서 <> 입력 안해도 됨
        String path = PropertiesEx.class.getResource("database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");  // 경로 안에 한글 있으면 깨지지 않도록 utf-8로 하도록 설정
//        System.out.println("파일 경로 : " + path);
//        파일의 내용을 읽어옴
        properties.load(new FileReader(path));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
