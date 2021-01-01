import java.util.Arrays;
/**
 * public：访问修饰限定符
 * private：私有的
 * protected：首保护的
 * 什么都不写：默认权限-->包访问权限
 */
class Person{
    //字段-->成员变量：定义在方法的外边；内的里边。
    //实例成员变量：在对象里。没有初始化则默认为对用的0值。引用类型为null，简单数值类型为0
    //char -> '\u0000' boolean -> false
    public String name;//null
    public int age;//0
    public static int size = 10;//静态成员变量不初始化也是默认的0值。不通过实例化的对象进行访问 类名 . 静态成员变量 [无论new多少次，结果都只有一份]
    public char ch;//\u0000空格
    public boolean bo;//false
    //方法-->行为：实例成员方法
    public void eat() {
        int a = 10;//局部变量
        System.out.println("eat()!");
    }
    public void sleep() {
        System.out.println("sleep()!");
    }
    public static void func1(){
        System.out.println("static func1!");
    }
    public void show() {
        System.out.println("我是：" + name + ", 今年" + age + "岁");
    }
}
class Test{
    public int a;
    public static int count;
    public static void func1() {
//        a=99;//在静态方法内部无法访问非晶态方法成员
        count = 99;
    }
}

/**
 * 封装：用private修饰属性或方法
 * this：当前对象的 引用[要习惯使用this]
 * 没有特殊要求，属性设置为private
 * 快数设置是optipn+insert[alt+insert·]
 */
class Student{
    public String name;
    public int age;
    private int id;
    public void func1(){
        System.out.println(id);//private修饰的属性在类的内部可以访问
    }
    //提供一个公开的接口
    public int getId(){
        return id;
    }

//    public void setId(int ID){
//        id = ID;
//    }

    /*public void setId(int id){
        id = id;
        自己给自己赋值，局部变量优先解决方案是this
    }*/
    public void setId(int id){
        this.id = id;
    }

    public void show(){
        System.out.println("我是"+this.name+"今年"+this.age+"岁，ID是"+this.id);
    }
}
public class day08类和对象 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "cxf";
        stu.age = 22;
//        stu.id=1;//用的private封装，无法在类的外部访问
        stu.setId(1);
        int ID = stu.getId();
        System.out.println(ID);
        stu.show();
    }

    public static void func() {}
    public void func2(){}
    public static void main2(String[] args) {
        func();
//        func2();//静态访问非静态方法

        day08类和对象 day08 = new day08类和对象();
        day08.func2();

        Test test = new Test();
        test.a++;
        Test.count++;
        System.out.println(test.a);
        System.out.println(Test.count);
        System.out.println("-------------");
        Test test1 = new Test();
        test1.a++;
        Test.count++;
        System.out.println(test.a);
        System.out.println(Test.count);
    }
    public static void main1(String[] args) {
        //实例化一个对象，通过关键字new
        Person person = new Person();//栈上一个person指向堆上的Person()
        //访问对象当中的实例成员变量
        //操作符：点号 对象的引用 . 成员变量
        person.show();
        person.name = "cxf";
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.ch);
        System.out.println(person.bo);
        System.out.println(person.size);//警告：最好不用这种方法访问。静态成员变量不属于对象person，属于Person类和实例成员变量
        System.out.println(Person.size);
        //访问成员方法
        person.eat();
        person.func1();//警告：虽然可以访问成功
        Person.func1();
        /**
         * 不规则的二维数组
         * C：可以省略行，有了列就可以推导行
         * Java：行必须指定，列不可以推到行
         * arr栈上指向堆中仅有的两个元素，堆中元素所指向的数据不知则为null，因此无法推出列
         */
        int[][] arr4=new int[2][];

        //不初始化默认值是0
        arr4[0] = new int[3];
        arr4[1] = new int[2];
        System.out.println(Arrays.deepToString(arr4));

        arr4[0] = new int[]{1,2,3};
        arr4[1] = new int[]{4,5};
        System.out.println(Arrays.deepToString(arr4));


        /**
         * 二维数组打印方式
         */
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(arr));//打印行的地址
        System.out.println(Arrays.deepToString(arr));//深度打印

        for (int[] val1 : arr) {
            for (int val2 : val1) {
                System.out.print(val2+" ");
            }
            System.out.println();
        }
        /**
         * 二维数组的定义方式
         */
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};//两行三列。int[3][2] arr={1,2,3,4,5,6};会报错。类型中不可以申明行列，与C不同
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5, 6}};//new int[][]中还是不可以填行列
        int[][] arr3 = new int[2][3];//不初始化可以选择行列
    }
}
