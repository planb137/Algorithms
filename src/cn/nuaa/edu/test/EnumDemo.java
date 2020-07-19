package cn.nuaa.edu.test;

/**
 * @author planb
 * @date 2020/7/19 20:20
 * 备注：enum demo
 */
enum WEEK{
    MONDAY,TUESDAT,WEDNESDAY,THURSDAY,
    FIRDAY,SATURDAY,SUNDAY
}
public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(WEEK.FIRDAY);
        System.out.println(WEEK.SUNDAY.hashCode());
        WEEK[] values = WEEK.values();
        for (WEEK week : WEEK.values()) {
            System.out.println(week);
        }
        System.out.println("--=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    }
}
