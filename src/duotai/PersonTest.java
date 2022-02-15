package duotai;

/**
 * @Description 有了对象的多态性后，在编译期，只能调用父类中声明的方法，但在运行期实际执行的是子类重写父类的方法
 * 多态的前提：
 * 1.要有类的继承
 * 2.有方法的重写
 * 对象的多态性只适用于方法，不适用于属性
 * @ClassName PersonTest
 * @Author 钟宇豪
 * @Date 2022/2/11 21:10
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Man();
        person.eat();

        //instanceof
        //判断对象是否是类的实例
        if (person instanceof Woman) {
            Woman woman = (Woman) person;
            woman.shopping();
        }
    }
}
