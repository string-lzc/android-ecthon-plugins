package lzc.com.java;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by lzc on 2018/2/8.
 */

public class DecimalHelper {
    private static DecimalFormat df;
    private static java.math.BigDecimal bd;

    /**
     * double四舍五入保留位数
     * @param decimal 原double类型数或表达式
     * @param digit 要保留的位数（0-5之间）
     * @return
     */
    public static double doubleReserve(double decimal, int digit) {
        switch (digit){
            case 0:
                df = new DecimalFormat("#");
                return Double.parseDouble(df.format(decimal));
            case 1:
                df = new DecimalFormat("#.0");
                return Double.parseDouble(df.format(decimal));
            case 2:
                df = new DecimalFormat("#.00");
                return Double.parseDouble(df.format(decimal));
            case 3:
                df = new DecimalFormat("#.000");
                return Double.parseDouble(df.format(decimal));
            case 4:
                df = new DecimalFormat("#.0000");
                return Double.parseDouble(df.format(decimal));
            case 5:
                df = new DecimalFormat("#.00000");
                return Double.parseDouble(df.format(decimal));
            default:return 0;
        }
    }
    /**
     * float四舍五入保留位数
     * @param decimal 原float类型数或表达式
     * @param digit 要保留的位数（0-5之间）
     * @return
     */
    public static float floatReserve(double decimal, int digit) {
        switch (digit){
            case 0:
                df = new DecimalFormat("#");
                return Float.parseFloat(df.format(decimal));
            case 1:
                df = new DecimalFormat("#.0");
                return Float.parseFloat(df.format(decimal));
            case 2:
                df = new DecimalFormat("#.00");
                return Float.parseFloat(df.format(decimal));
            case 3:
                df = new DecimalFormat("#.000");
                return Float.parseFloat(df.format(decimal));
            case 4:
                df = new DecimalFormat("#.0000");
                return Float.parseFloat(df.format(decimal));
            case 5:
                df = new DecimalFormat("#.00000");
                return Float.parseFloat(df.format(decimal));
            default:return 0;
        }
    }

    /**
     * double 取小数点后位数
     * @param decimal 原数据或表达式
     * @param digit 取位数
     * @return
     */
    public static double doubleKeep(double decimal, int digit){
        bd = new BigDecimal(decimal);
        return Double.parseDouble(bd.setScale(digit,BigDecimal.ROUND_FLOOR).toString());
    }

    /**
     * float 取小数点后位数
     * @param decimal 原数据或表达式
     * @param digit 取位数
     * @return
     */
    public static float floatKeep(double decimal, int digit){
        bd = new BigDecimal(decimal);
        return Float.parseFloat(bd.setScale(digit,BigDecimal.ROUND_FLOOR).toString());
    }
}
