package com.velocity.demo.controller.velocity_toolbox;

import org.apache.commons.beanutils.ConvertUtils;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * @description: velocity模板工具箱——时间操作函数工具类
 * @author: jiangxy
 * @create: 2019-02-12 20:28
 */
public class DateTimeTool {


    /**
     * 根据活动结束时间与现在时间计算活动剩余天数
     * @param endTime
     * @return
     */
    public   String remainingTime(String endTime){
        String[] dateSplit = endTime.split("\\s");
        Integer[] year_month_day = (Integer[])ConvertUtils.convert(dateSplit[0].split("-"), Integer.class);
        Integer[] hour_minute_sec = (Integer[])ConvertUtils.convert(dateSplit[1].split(":"), Integer.class);

        DateTime endDay = new DateTime(year_month_day[0], year_month_day[1], year_month_day[2], hour_minute_sec[0], hour_minute_sec[1], hour_minute_sec[2]);
        //System.out.println(endDay);

        DateTime now = new DateTime();

        //计算区间毫秒数
        int days = new Period(now.getMillis(), endDay.getMillis(), PeriodType.days()).getDays();
        int hours = new Period(now.getMillis(), endDay.getMillis(), PeriodType.hours()).getHours();
        int minutes = new Period(now.getMillis(), endDay.getMillis(), PeriodType.minutes()).getMinutes();
        int seconds = new Period(now.getMillis(), endDay.getMillis(), PeriodType.seconds()).getSeconds();


        if(days > 0)hours %= 24;
        if(days > 0 || hours > 0)minutes %= 60;
        if(days > 0 || hours > 0 || minutes > 0)seconds %= 60;

        return seconds >= 0 ? "还剩"+days+"天"+hours+"小时"+minutes+"分"+seconds+"秒" : "活动已结束";
    }


//    public static void main(String[] args) {
//        String s = remainingTime("2019-02-12 21:38:59");
//        System.out.println(s);
//    }
}
