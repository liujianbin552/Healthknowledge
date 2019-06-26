package cn.edu.gdpt.healthknowledge.utils;
import com.show.api.ShowApiRequest;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
public class HttpUtils {
    public static void main(String adfas[]) throws Exception{
        String res=new ShowApiRequest("http://route.showapi.com/90-88","97946","e21666135cf24bfeb0d88b8703167516")
                .addTextPara("showapi_appid","1")
                .addTextPara("id","1")
                .post();
        System.out.println(res);
    }
}



