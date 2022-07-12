package basic.faceToObj;

/**
 * @Description TODO
 * @ClassName ObjArrayUtilText
 * @Author 钟宇豪
 * @Date 2022/1/28 20:32
 * @Version 1.0
 */
public class ObjArrayUtilTest {
    public static void main(String[] args) {

        ObjArrayUtil util=new ObjArrayUtil();
        int[] arr=new int[]{23,5,2,76,56,987,54};
        System.out.println(util.getMax(arr));
    }
}
