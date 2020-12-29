import java.util.Scanner;
import java.util.Random;
//import java.util.*;//代表导入全部
public class day04程序逻辑控制2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 3;
		while (count !=0) {
			System.out.println("请输入密码：");
			String str = scan.nextLine();
			//if (str=="123") {
			if (str.equals("123")) {
				System.out.println("密码正确");
				break;
			}else {
				--count;
				System.out.println("密码错误，还有" + count +"次机会");
			}
		}
	}

	public static void main11(String[] args) {
		for (int i=0; i<=999999999; ++i) {
			int count=0;
			int tmp=i;
			while (tmp!=0) {
				tmp/=10;
				++count;
			}
			tmp = i;
			int sum=0;
			while (tmp!=0) {
				sum+=Math.pow(tmp%10, count);
				tmp/=10;
			}
			if (sum==i) {
				System.out.println(i);
			}
		}
	}

	public static void main10(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		double sum=0;
		int flag=1;
		for (double i=1.0; i<=num; ++i) {
			sum += 1.0/i*flag;
			flag *=-1;
		}
		System.out.println(sum);
	}

	public static void main9(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int a1=a;
		int b1=b;
		if (a<b) {
			a^=b;
			b^=a;
			a^=b;
		}
		while (a%b != 0) {
			int tmp = a%b;
			a = b;
			b = tmp;
		}
		System.out.println(a1*b1/b);
		scan.close();
	}

	public static void main8(String[] args) {
		for (int i=0; i<=100; ++i) {
			int j=2;
			for (; j<=(int)Math.sqrt(i); ++j) {
				if (i%j==0) {
					break;
				}
			}
			if (j>(int)Math.sqrt(i)) {
				System.out.println(i);
			}
		}

		/*
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//for (int i=2; i<=num/2; ++i) {
		for (int i=2; i<=(int)Math.sqrt(num); ++i) {
			if (num%i==0) {
				System.out.println("不是素数");
				break;
			}
		}
		*/
	}

	/**
	猜数字
	随机数模块
	*/
	public static void main7(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();//如果给订了一个时间戳，则只会产生一次随机数[c需要添加时间戳]
		int randNum = rand.nextInt(100)+100;//[0~199]
		while (true) {
			System.out.print("请输入：");
			int num = scan.nextInt();
			if (num < randNum) {
				System.out.println("猜小了");
			}else if (num > randNum) {
				System.out.println("猜大了");
			}else {
				System.out.println("猜对了");
				break;
			}
		}
	}

	public static void main6(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			int num = scan.nextInt();
			System.out.println(num);
		}
		scan.close();
	}

	public static void main5(String[] arge) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();//方法记得关闭与文件操作一样，关闭资源
	}

	public static void main4(String[] args) {
		int num=0;
		do {
		System.out.println("哈哈·");
		}while(num!=0);
	}

	public static void main3(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum=0;
		for (int i=1; i<=num; ++i) {
			int ret=1;
			for (int j=1; j<= i; ++j) {
				ret*=j;
			}
			sum+=ret;
		}
		System.out.println(sum);
	}

	public static void main2(String[] args) {
		/*
		int i=1;
		for (;;) {
			if ( i<=10) {
				System.out.println(i);
			}
			++i;
		}
		*/

		for (byte i=1; i<=129; ++i) {
			System.out.println(i);
		}
	}

	public static void main1(String[] args) {
		//找到第一个既能被3也能被5整除的数字
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while(num<=200) {
			if(num%15==0) {
				System.out.println(num);
				//break;//跳出整个循环；
				continue;//跳转到条件判断，变量调整不执行
				/*
				break只能在循环和switch中使用；continue只能在循环中使用
				*/
			}
			++num;
		}
	}
} 