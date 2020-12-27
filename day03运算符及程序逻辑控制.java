import java.util.Scanner;

public class day03运算符及程序逻辑控制 {
    /*
    基本四则运算符：+ - * / %
    除数不能为0
    */
    public static void main1(String[] args) {
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println((float) 5 / 2);
        System.out.println((float) (5 / 2));

        System.out.println("\n");

        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);

        System.out.println("\n");

        //%：不仅仅可以对int求模，也能对double来求援
        System.out.println(11.5 % 2.0);
        System.out.println(11.5 % 2);

        System.out.println("\n");

        //符合运算符：+= -= *= /= %=
        //自增/自减++ --
        int i = 10;
        i = i++;
        System.out.println(i);//10：结果偏低层原理才能理解

        //关系运算符：== != <= >= < >逻辑判断结果只是true或flase不与c的1或0相同
		/*
		逻辑运算符：&&两真且真 ||两假或假 !：只能作用到boolean类型的数据上
		表达式1 && 表达式2：一旦表达式1为假，表达式2不会执行
		表达式1 || 表达式2:一旦表达式1为真，表达式2不会执行
		*/
        //System.out.println(!10 < 20);
        boolean flg = true;
        System.out.println(!flg);
        System.out.println(10 > 20 && 10 / 0 == 0);
        System.out.println(10 < 20 || 10 / 0 == 0);


        System.out.println("\n");

		/*
		&：同1则1
		|：有1则1
		^：相异则1
		&和|如果操作数为boolean的时候，也表示逻辑运算，但是和&&以及||相比他们不支持短路求值
		*/
        //System.out.println(10>20&10/0==0);程序报异常
        //System.out.println(10<20|10/0==0);程序报异常

		/*
		位运算
		位运算速度大于* /
		11
		1011>>1:0101[有一相当于是除法11/2^1]
		1011>>2:0010[11/2^2]
		右移：补符号位

		左移：乘法

		>>>无符号右移，只补0
		没有无符号左移
		*/
        System.out.println(11 >> 1);
        System.out.println(11 >> 2);
        System.out.println(11 << 1);
        System.out.println(11 << 2);
        System.out.println(-1 >>> 1);

        //三目运算符
        System.out.println(1 > 2 ? 3 : 4);

        //y运算符优先级。加上括号运算可以减免错误
    }


    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int a=scanner.nextInt();
        //System.out.println(a);

        //读取字符串
        String str = scanner.nextLine();
        String str2 = scanner.next();
        System.out.println(str);
        System.out.println(str2);
		/*
		一般读取字符串不与其它读取混用，因为读取字符串会读取其它数据的回车[解决方法：把nextLine换next]
		nextLine：遇到回车就停止
		next：遇到空格就停止
		*/
    }

	public static void main3(String[] args){
		//顺序结构略
		/*
		分支结构
		if (布尔表达式){}
		else{}
		悬垂else与c一样，只与最近的if结合

		switch(){case 1...}
		*/
		int a=10;
		//if(a) {
		if(a==10) {
			System.out.println(a);
		}

		Scanner scanner =new Scanner(System.in);
		//推出循环：1.ctrl+c中断推出，2.ctrl+d正常退出
		while(scanner.hasNextInt()) {
			int year = scanner.nextInt();
			if( (year%4==0 && year%100!=0) || (year%400==0) ) {
				System.out.println("是闰年！");
			}else{
				System.out.println("不是闰年！");
			}
		}
	}


	public static void main4(String[] args){
		/*
		switch(整数|枚举|字符|字符串)
		不能做switch参数的是：long float double boolean
		break尽量不要省略
		*/
		int a=10;
		switch(a){
			case 1:
				System.out.println("1");
				break;//与c类似，不加的话持续运行匹配成功后边的所有代码
			case 2:
				System.out.println("2");
			default:
				System.out.println("请输入正确数值");
		}
	}

	public static void main(String[] args){
		int num=5;
		int i=1;
		int sum=0;
		while(num>0){
			i*=num;
			sum+=i;
			--num;
		}
		System.out.println(sum);
	}
}