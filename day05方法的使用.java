import java.util.Scanner;

public class day05方法的使用 {
    /**
     * 方法：功能
     * public static 返回值 函数名(形式参数列表) {
     * 方法体;
     * }
     * 方法名：小驼峰
     * public static：因为当前所有的方法写完之后会在main方法中调用。因为main方法是public static的
     * 返回值：因地制宜
     * 形式参数列表：形参-->实参的一份临时拷贝
     * 方法体：具体的方法实现
     */
    //两个数最大值
    public static int maxNum(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    //三个数最大值
    public static int maxThreeNum(int num1, int num2, int num3) {
        return maxNum(maxNum(num1, num2), num3);
    }

    //阶乘求和
    public static int fac(int num) {
        int ret = 1;
        for (int i = 1; i <= num; i++) {
            ret *= i;
        }
        return ret;
    }

    public static int factor(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
//            int ret = 1;//还错？？？
//            for (int j = 1; j <= i; j++) {
//                ret *= j;
//            }
            sum += fac(i);
        }
        return sum;
    }

    //不能像C指针一样但可以通过引用达到类似的效果
    public static void swap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    /**
     * 留坑：重载和重写区别？
     * 类的重载
     * 1.方法名相同
     * 2.返回值可以不同
     * 3.参数列表不同[参数 个数 或 类型不同]
     * 4.在同一个类中
     *
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double a, double b, double c) {
        return a + b + c;
    }

    /**
     * 函数的调用：栈上开辟内存。给这个函数开辟栈帧
     *
     * @param num
     * @return
     */
    //递归求阶乘：5 5*4*3*2*1
    public static int fac_d(int num) {
        if (num == 1) {
            return 1;
        }
        return num * fac_d(num - 1);
    }

    //递归——打印数字的每一位：123 1 2 3
    public static void func1(int num) {
        if (num > 9) {
            func1(num / 10);
        }
        System.out.println(num % 10);
    }

    //递归求和：5+4+3+2+1
    public static int func2(int num) {
        int sum = 0;
        if (num == 1) {
            return 1;
        }
        return num + func2(num - 1);

    }

    //递归求1279：1+2+7+9
    public static int func3(int num) {
        /*int sum = 0;
        if (num > 9) {
            sum += num % 10;
            func3(num / 10);
        }
        System.out.println(sum);*/

        if (num < 10) {
            return num;
        }
        return num % 10 + func3(num / 10);
    }

    //斐波那契数列递归实现很耗资源
    public static int func4(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return func4(num - 1) + func4(num - 2);
    }

    //迭代实现斐波那契数列
    public static void func5(int num) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;//f3=1是为了避免num的输入问题
        for (int i = 3; i <= num; i++) {
            f3 = f1 + f2;
            f1=f2;
            f2=f3;
        }
        System.out.println(f3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        System.out.println(maxThreeNum(n1, n2, n3));*/

        /*int n1 = scanner.nextInt();
        System.out.println(factor(n1));*/

        /*int[] arr = {10, 20};
        swap(arr);
        System.out.println("a=" + arr[0] + " b=" + arr[1]);*/

//        func1(123);

//        System.out.println(func2(5));

//        System.out.println(func3(1279));

        System.out.println(func4(10));

        func5(46);
    }
}
