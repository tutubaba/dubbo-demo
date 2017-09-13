
/**
 * Created by tuyuelai on 2017/5/5.
 */
public class Application {
    private static final int DEFAULT_PORT = 8083;


    public static void main(String[] args) {
        // 启动 jettyserver
        try{
            new JettyServer().startJetty(getPortFromArgs(args));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static int getPortFromArgs(String[] args) {
        if (args.length > 0) {
            try {
                return Integer.valueOf(args[0]);
            } catch (NumberFormatException ignore) {
            }
        }
        return DEFAULT_PORT;
    }
}