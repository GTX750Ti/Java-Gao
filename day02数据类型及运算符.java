public class day02数据类型及运算符 {
//    public static void main(String[] args) {
//        /*
//        2. long长整型--8字节【-2 ^ 63 ~2 ^ 63 - 1】
//        包装类：long->Long
//        */
//        long a = 10L;//有一种说法：a是长整型；10是整形，10加上L就是长整型。大写为了好区分小写
//        System.out.println("a的值是：" + a);
//        System.out.println("最大值：" + Long.MAX_VALUE);//+拼接后整体就是字符出
//        System.out.println("最小值：" + Long.MIN_VALUE);
//
//        int a2 = 10;
//        int b2 = 20;
//        System.out.println(a + b2);
//        //注意：任何类型的数据    和   字符串进行拼接     结果就是字符串
//        System.out.println("hhh" + a + b2);
//
//
//
//
//
//        /*
//        String[] args：运行时命令行参数
//        D:\Progam\jetBrains\IDEA\高博\src>javac day02数据类型及运算符.java -encoding utf-8
//
//        D:\Progam\jetBrains\IDEA\高博\src>java day02数据类型及运算符
//        kaixin
//
//        D:\Progam\jetBrains\IDEA\高博\src>java day02数据类型及运算符 cxf is cool
//        cxf
//        is
//        cool
//        kaixin
//        */
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//        System.out.println("kaixin");
//    }


//    public static void main(String[] args) {
//        /*3
//        3.double双精度--浮点型--8字节
//        包装类：double->Double后期使用很方便
//         */
//        double d = 12.5;
//        System.out.println(d);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);
//        int a=1;
//        int b=2;
//        System.out.println(a / b);//a和b都是整形
//
//        double num = 1.1;//一般情况，项目遇到小数建议使用double
//        System.out.println(num * num);//小数没有精确值，有精度的【没有深入研究内存意义；C有意义】，浮点数float精确表示小数点后6位，小数和整数在内存中存储时，存储方式是不一样的
//    }


//    public static void main(String[] args) {
//        /*
//        4.float单精度--浮点型--4字节
//        包装类：float->Float
//        在Java中国，不允许把double类型的值直接给float编译报错：体现了Java安全性
//        Java是一个强类型语言。C语言是一个弱类型语言
//         */
//        float f = 12.3;//12.3默认是double8字节，给float4字节会编译报错[C是警告]
//        float f2 = 12.3F;
//        System.out.println(f);
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Float.MIN_VALUE);
//    }


//    public static void main(String[] args) {
//        /*
//        5.char--字符数据类型--2字节[0~2^16-1]，没有负数
//        包装类：char->Character
//        Unicode-->包含了ASCII等很多，比如中文，变得更大
//         */
//        char ch = 'a';
//        System.out.println(ch);
//
//        char ch2 = '陈';//1个汉字=2字节
//        System.out.println(ch2);
//
//        char ch3 = 65;
//        System.out.println(ch3);
//    }


//    public static void main(String[] args) {
//        /*
//        6.byte--1字节[-2^7~2^7-1]
//        包装类：boolean->Boolean
//        每一种数据类型，再给其赋值的时候一定不能超过他的范围
//         */
//        byte b = 12;
//        byte c = 21;
////        byte f = b+c;//b和c会先提升整形->int转换byte丢失精度
//        byte f2 = (byte)(b+c);;//小于4个字节的数据类型 运算的时候会发生类型提升
//        System.out.println(b + " " + c);
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Byte.MIN_VALUE);
//
////        byte d=Byte.MAX_VALUE+1;
////        System.out.println(d);
//        System.out.println(Byte.MAX_VALUE + 1);//128：默认是以int型打印，所以不是-128
//
////        byte e=128;//127超过范围后编译报错
//        int i1 = 2147483647 + 1;//2147483647+1发生整型提升
////        int i2 = 2147483648;//超过范围后编译报错
//    }


//    public static void main(String[] args) {
//        /*
//        7.short--短整型--2字节[-2^15~2^15-1]
//          包装类：short->Short
//         */
//        short sh=12;
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
//    }


//    public static void main(String[] args) {
//        /*
//        8.boolean--布尔类型
//        包装类：boolean->Boolean
//        1.Java中boolean没有明确大小；boolean只有两个取值 true 和 false
//        2.Java中没有所谓的0为假，非0为真；用true和false代替
//         */
//        boolean flg=false;
//        System.out.println(flg);
//    }



    /*
    1.Java当中8种基本数据类型分别是：
    字节数和：4         8   8      4     2         2    1   没有规定
    数据类型：int     long double float char      short byte boolean
    包装类：  Integer Long Double Float Character Short Byte Boolean

    2.Java中引用数据类型：
    类，String，数组，抽象类，接口，枚举...
     */
//    public static void main(String[] args) {
//        /*
//        9.String字符串
//         */
//        String str = "\"Hello\"";//"Hello"
//        System.out.println(str);
//    }

//    public static void main(String[] args) {
//        /*
//        常量：
//        1.字面常量：10 "abc" 1.1 'a'
//        2.final修饰的变量
//         */
//        int maxNum = 10;
//        final int MAXNUM = 10;
//        maxNum = 9;
////        MAXNUM = 9;//常量只能被初始化一次：使用的时候记得初始化，使用过程中不能被修改[const]
//        final int MINNUM;
//        MINNUM = 0;
//    }

    public static void main(String[] args) {
        /*
        隐式转换：把一个小类型 给 大类型
        显示转换：把一个大类型 给 小类型
         */
        int a = 10;
        long b = a;

        long a2 = 10L;
        int b2 = (int)a2;

        int b3 = 10;
//        boolean c3 = (boolean)b3;//两个不相关联的int boolean

        int num = 10;
        String str1 = num + "";
        String str2 = String.valueOf(num);

        String str3 = "100";
        int num3 = Integer.parseInt(str3);
        /*
        D:\Progam\jetBrains\IDEA\高博\src>javac day02数据类型及运算符.java -encoding utf-8

        D:\Progam\jetBrains\IDEA\高博\src>java day02数据类型及运算符
        Exception in thread "main" java.lang.NumberFormatException: For input string: "100a"
        at java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at day02数据类型及运算符.main(day02数据类型及运算符.java:192)
         */
        String str4 = "100a";
        int num4 = Integer.parseInt(str4);
    }
}
