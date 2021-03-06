package aurora.timer.client;

import java.io.File;
import java.util.prefs.Preferences;

/**
 * Created by hao on 17-1-25.
 */
public class ServerURL {
    //服务器的地址加端口
//    public static final String HOST = "192.168.1.17:8090";
    //服务器外网地址
//    public static final String HOST = "210.38.206.110:8090";
    public static String HOST;
    static {
        Preferences preferences = Preferences.userRoot().node(ServerURL.PRE_PATH);
        ServerURL.HOST = preferences.get("host", "192.168.1.218:8080");
//        HOST = "192.168.1.218:8080";
    }
//    public static final String HOST = "127.0.0.1:8080";
    //跳转的登陆页面，在页面完成注册
    public static String REGISTER_URL = "http://" + HOST + "/timer/pages/register.html";
    //登陆验证的url
    public static String LOGIN_URL = "http://" + HOST + "/timer/login";
    //注册表地址
    public static final String PRE_PATH = "com.aurora.timer";
    //计时地址
    public static String TIMER = "http://" + HOST + "/timer/timer";

    public static final String ABOUT = "———— All Hai Lelouch! ————";
    //获取本周时间的地址
    public static String THIS_WEEK_TIME = "http://" + HOST + "/timer/lastXWeek";
    //获取UserDataById
    public static String FIND_BY_ID = "http://" + HOST + "/timer/findById";
    //获取插件的文件夹
    public static final String PLUGIN_HOME = "res" + File.pathSeparator + "plugins";
    //背景图片的文件夹
    public static final String BG_PATH = "res" + File.separator + "bg.png";
    //检查新版本
    public static String CHECK_VERSION_URL = "http://" + HOST + "/timer/soft/ver.json";
//    public static final String CHECK_VERSION_URL = "http://" + HOST + "/timer/version";
    //获得软件本体的路径
    public static String SOFT_URL = "http://" + HOST + "/timer/soft"; // + TimerX.X.jar
}
