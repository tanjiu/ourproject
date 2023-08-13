package com.i1314i.ourproject.utils.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间转换
 * @author 平行时空
 * @created 2018-12-06 19:47
 **/
public class TimeTranUtil {
    public static String ZtimeTo(Date time){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return formatter.format(time);
    }

    /**
     * 将 yyyy-MM-dd HH:mm:ss 时间 转换为  2018-11-02T16:29:54
     * @param time
     * @return
     * @throws ParseException
     */
    public static String ZtimeTo(String time) throws ParseException {

         SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         Date startTime=sdf.parse(time);

         return ZtimeTo(startTime);

    }


    public static String TotimeSimple(Date time) throws ParseException {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(time);
    }

    public static String TotimeSimpleZ(Date time) throws ParseException {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        return sdf.format(time);
    }



    public static Date TotimeDate(String time) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(time);

    }

    public static Date TotimeDateZ(String time) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        return sdf.parse(time);

    }

//    HH:mm:ss


    public static void main(String[] args) {
        System.out.println(ZtimeTo(new Date()));
    }
}
