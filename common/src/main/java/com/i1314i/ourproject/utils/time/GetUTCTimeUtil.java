package com.i1314i.ourproject.utils.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author 平行时空
 * @created 2018-11-03 0:17
 **/
public class GetUTCTimeUtil {
    // 取得本地时间：
    private Calendar cal = Calendar.getInstance();
    // 取得时间偏移量：
    private int zoneOffset = cal.get(java.util.Calendar.ZONE_OFFSET);
    // 取得夏令时差：
    private int dstOffset = cal.get(java.util.Calendar.DST_OFFSET);

    public static void main(String[] args) {
        GetUTCTimeUtil gc = new GetUTCTimeUtil();
        long mill = gc.getUTCTimeStr();
        gc.setUTCTime(mill);
        System.out.println(getUTCDate());
    }

    public long getUTCTimeStr() {

        System.out.println("local millis = " + cal.getTimeInMillis()); // 等效System.currentTimeMillis() , 统一值，不分时区

        // 从本地时间里扣除这些差量，即可以取得UTC时间：
        cal.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));

        long mills = cal.getTimeInMillis();
        System.out.println("UTC = " + mills);

        return mills;
    }

    public void setUTCTime(long millis) {

        cal.setTimeInMillis(millis);

        SimpleDateFormat foo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = foo.format(cal.getTime());
        System.out.println("GMT time= " + time);

        // 从本地时间里扣除这些差量，即可以取得UTC时间：
        cal.add(java.util.Calendar.MILLISECOND, (zoneOffset + dstOffset));
        time = foo.format(cal.getTime());
        System.out.println("Local time = " + time);

    }

    public void getGMTTime() {
        //mothed 2
        TimeZone gmtTime = TimeZone.getTimeZone("GMT");
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format.setTimeZone(gmtTime);
        System.out.println("GMT Time: " + format.format(date));

        //method 2
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTimeZone(gmtTime);
        //System.out.println(calendar1.getTime());    //时区无效
        //System.out.println(calendar1.getTimeInMillis()); //时区无效
        System.out.println("GMT hour = " + calendar1.get(Calendar.HOUR));
    }

    /**
     *
     *  [获取UTC标准时]
     *  [功能详细描述]
     *  @return
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    private static String getUTCDate() {
        String dateStr = "";
        Date date = null;
        String months = "", days = "", hours = "", sec = "", minutes = "";
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        StringBuffer UTCTimeBuffer = new StringBuffer();
        Calendar cal = Calendar.getInstance();
        int zoneOffset = cal.get(java.util.Calendar.ZONE_OFFSET);
        int dstOffset = cal.get(java.util.Calendar.DST_OFFSET);
        cal.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        if (month < 10) {
            months = "0" + String.valueOf(month);
        }
        else {
            months = String.valueOf(month);
        }
        if (minute < 10) {
            minutes = "0" + String.valueOf(minute);
        }
        else {
            minutes = String.valueOf(minute);
        }
        if (day < 10) {
            days = "0" + String.valueOf(day);
        }
        else {
            days = String.valueOf(day);
        }
        if (hour < 10) {
            hours = "0" + String.valueOf(hour);
        }
        else {
            hours = String.valueOf(hour);
        }
        if (second < 10) {
            sec = "0" + String.valueOf(second);
        }
        else {
            sec = String.valueOf(second);
        }
        UTCTimeBuffer.append(year).append("-").append(months).append("-").append(days);
        UTCTimeBuffer.append("T").append(hours).append(":").append(minutes).append(":").append(sec).append("Z");
        try {
            date = format.parse(UTCTimeBuffer.toString());
            dateStr = format.format(date);
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return dateStr;
    }


}
