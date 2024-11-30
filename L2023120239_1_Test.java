import org.junit.Assert;
import org.junit.Test;

public class L2023120239_1_Test {
    @Test
    public  void Solution1Test(){
        System.out.println("test");
        Solution1 s1 = new Solution1();
        /*计算结果为不循环小数*/
        Assert.assertEquals("0.5", s1.fractionToDecimal(1, 2));
        /*计算结果为整数*/
        Assert.assertEquals("2", s1.fractionToDecimal(2, 1));
        /*计算结果为循环小数*/
        Assert.assertEquals("0.(012)", s1.fractionToDecimal(4, 333));
        /*计算结果的小数部分包含循环和不循环部分*/
        Assert.assertEquals("0.3(6)", s1.fractionToDecimal(11, 30));
        /*计算结果为0*/
        Assert.assertEquals("0", s1.fractionToDecimal(0, 30));
        /*分母为0的情况*/
        Assert.assertEquals("", s1.fractionToDecimal(1, 0));
    }
}
