package com.threegroup.android3grouppersonality.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {
    /**
     * 获取网络位图
     * @param httpUrL
     * @return
     * @throws Exception
     */
    public static Bitmap HttpGetBitmap(String httpUrL) throws Exception{
        Bitmap bitmap=null;
        //构建url
        URL url=new URL(httpUrL);
        //从url中打开并获取到连接对象connection
        HttpURLConnection httpConnection=(HttpURLConnection) url.openConnection();
        //配置连接对象参数
        httpConnection.setRequestMethod("GET");//获取方式
        httpConnection.setConnectTimeout(5*1000);//连接超时
        httpConnection.setReadTimeout(5*1000);//读取超时
        httpConnection.setDoInput(true);//默认为true不设置也行
        //建立连接
        httpConnection.connect();//向服务器发送链接请求，获取服务器时为自动连接，不写也行
        //与服务器进行数据通信

        //判断服务器的响应码是否为200，如果为200，泽服务器有数据响应给客户端
        if(httpConnection.getResponseCode()==HttpURLConnection.HTTP_OK){
            //获取服务器到达客户端数据的输入流对象
            InputStream in=httpConnection.getInputStream();
            //将输入流解码为位图对象
            bitmap= BitmapFactory.decodeStream(in);
        }
        httpConnection.disconnect();
        return bitmap;
    }

    /***
     * 获取网络串
     * @param httpUrL
     * @return
     * @throws Exception
     */
    public static String HttpString(String httpUrL,String method) throws Exception{
        String resp="";
        //构建url
        URL url=new URL(httpUrL);
        //从url中打开并获取到连接对象connection
        HttpURLConnection httpConnection=(HttpURLConnection) url.openConnection();
        //配置连接对象参数
        httpConnection.setRequestMethod(method);//获取方式
        httpConnection.setConnectTimeout(5*1000);//连接超时
        httpConnection.setReadTimeout(5*1000);//读取超时
        httpConnection.setDoInput(true);//默认为true不设置也行
        //建立连接
        httpConnection.connect();//向服务器发送链接请求，获取服务器时为自动连接，不写也行
        //与服务器进行数据通信

        //判断服务器的响应码是否为200，如果为200，泽服务器有数据响应给客户端
        if(httpConnection.getResponseCode()==HttpURLConnection.HTTP_OK){
            //获取服务器到达客户端数据的输入流对象
            InputStream in=httpConnection.getInputStream();

            //从输入流中读取服务器响应的字符串
            InputStreamReader inputStreamReader=new InputStreamReader(in,"UTF-8");
            BufferedReader reader=new BufferedReader(inputStreamReader);//缓冲读取器
            String line="";
            while((line=reader.readLine())!=null){
                resp+=line;
            }
        }
        httpConnection.disconnect();
        return resp;
    }
}
