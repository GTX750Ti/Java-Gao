public class day09类和对象02及其复杂度 {
    /**
     * 1.时间复杂度：冒泡排序，二分查找，递归，斐波那契[程序循环次数]
     * 2.空间复杂度：冒泡排序，斐波那契，递归[变量生成个数]
     */





    /**
     * 定义类
     * 成员变量：普通的成员变量（不加static修饰） 对象.变量名  静态的成员变量/类变量（加static）类名.静态变量
     * 成员方法：对象.方法
     * 注意：1.静态的数据 只有一份，且存在方法区   2.非静态的数据成员属于对象在堆上
     * <p>
     * 封装：private
     * 类的实现者和调用者：私有的数据成员在类外，此时就不能访问 需要set和get方法
     * <p>
     * 关键字：this 代表的是当前对象的引用
     */
    public static void main1(String[] args) {
        Person09 person09 = new Person09("张三", 20);
        System.out.println(Person09.count);
        System.out.println("==============");
        Person09 person010 = new Person09("张三", 20);

        //匿名对象：只能使用一次
        new Person09().eat();
    }
}

class Person09 {
    private String name;
    private int age;

    static {
//        this.name = "张飞";//非静态禁止访问静态
        count = 99;
        System.out.println("静态代码块");
    }

    //    private static int count;
    public static int count=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 1.没有提供构造方法时候，编译器会自动提供一个不带有参数的构造方法
     * 2.当你提供了一个构造方法，编译器不会自动生成一个构造方法
     * <p>
     * 一个对象的产生需要：1.分配内存，2.调用合适的构造方法[意味着构造方法不止一种]
     * this关键字代表当前对象：是错误的说法；
     */
    public Person09() {
        this("曹操", 18);
        System.out.println("Person09<init>");
    }

    public Person09(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + age + "岁");
    }

    /**
     * this()       调用自己的构造方法：只能在构造方法里写，且在第一行，只能使用一次
     * this.data    调用对象本身的属性
     * this.func    调用对象本身的方法
     */
    public void eat() {
        System.out.println(this.getName());
        System.out.println(this.age);
    }

    /**
     * 代码块
     * 实例代码块/构造代码块：
     * 静态代码块：只会被执行一次且最早被执行
     * static{count = 99}与public static int count = 0;谁是count的最终值与定义顺序有关
     * 本地代码块：制作了解，不会用
     * 新建对象的时候先打印静态，再打印实例最后是构造
     *
     * 静态的方法 和 静态的成员 不依赖于对象，可以通过类名访问
     * 若静态方法里面，访问了实例成员变量，那么这个实例成员变量时依赖于对象
     */
    {
//        this.name = "张飞";
        System.out.println("实例代码块...");
    }

    public static void func() {
        count = 123;
//        this.name = "曹操";
    }
}
