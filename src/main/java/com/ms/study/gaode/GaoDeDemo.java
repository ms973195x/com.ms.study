package com.ms.study.gaode;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @version 1.0.0
 * @auther: Created by zyl on 2019/5/29
 * @description: 位置计算Demo
 */
public class GaoDeDemo {
    public static void main(String[] args){
        // 开始地点 and 结束地点
        String start = "聚光科技";
        String end = "湘云雅苑";

        // 获取2个地点的具体金经纬度
        String startLonLat = getLonLat(start);
        String endLonLat = getLonLat(end);
        System.out.println(startLonLat);
        System.out.println(endLonLat);

        // 计算2个经纬度的距离
        Long dis = getDistance(startLonLat,endLonLat);
        System.out.println(dis);
    }

    /**
     * 根据地址获取经纬度
     * @param address
     * @return 地址(在高德地图上可以搜索到)
     */
    private static String getLonLat(String address){
        //返回输入地址address的经纬度信息, 格式是 经度,纬度
        String queryUrl = "http://restapi.amap.com/v3/geocode/geo?key=f8e42f6c5a53912993d0518ca8276d0e&address="+address;
        String queryResult = getResponse(queryUrl);  //高德接品返回的是JSON格式的字符串

        JSONObject jo = new JSONObject().fromObject(queryResult);
        JSONArray ja = jo.getJSONArray("geocodes");
        return new JSONObject().fromObject(ja.getString(0)).get("location").toString();
    }


    /**
     * 计算两个经纬度的距离
     * @param startLonLat 开始经纬度
     * @param endLonLat 结束经纬度
     * @return
     */
    private static Long getDistance(String startLonLat, String endLonLat){
        //返回起始地startAddr与目的地endAddr之间的距离，单位：米
        Long result = new Long(0);
        String queryUrl = "http://restapi.amap.com/v3/distance?key=f8e42f6c5a53912993d0518ca8276d0e&origins="+startLonLat+"&destination="+endLonLat;
        String queryResult = getResponse(queryUrl);
        JSONObject jo = new JSONObject().fromObject(queryResult);
        JSONArray ja = jo.getJSONArray("results");

        result = Long.parseLong(new JSONObject().fromObject(ja.getString(0)).get("distance").toString());
        return result;
    }

    /**
     * 发送URL请求
     * @param serverUrl url路径
     * @return
     */
    private static String getResponse(String serverUrl){
        //用JAVA发起http请求，并返回json格式的结果
        StringBuffer result = new StringBuffer();
        try {
            URL url = new URL(serverUrl);
            URLConnection conn = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line;
            while((line = in.readLine()) != null){
                result.append(line);
            }
            in.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

}
