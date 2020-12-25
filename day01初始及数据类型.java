/*
1.一个java文件中，只能有一个publc类
2.HelloWorld是类名且和文件名相同【HelloWorld要和HelloWorld.java相同】
3.类名一定要采用大驼峰的形式命名
4.在public class中字段+方法=为类体
5.public static里是方法体
6.运行java程序步骤：磁盘上的.java文件--->经过javac编译--->得到.class文件
7.一个类会生成一个字节码文件：为了方便使用，如果需要HelloWorld这个类，那么就加载对应的字节码文件
8.[
jvm<jre<jdk
javac属于jdk命令
Mac 电脑不会出现这样情况出现编码问题需要后缀-encoding utf-8即可
zxy@zxydeMacBook-Pro 高博 % javac HelloWorld.java 
HelloWorld.java:14: 错误: 非法字符: '\u201c'
		System.out.println(“Hello World!”);
		                   ^
HelloWorld.java:14: 错误: 需要';'
		System.out.println(“Hello World!”);
		                    ^
HelloWorld.java:14: 错误: 不是语句
		System.out.println(“Hello World!”);
		                          ^
HelloWorld.java:14: 错误: 需要';'
		System.out.println(“Hello World!”);
		                               ^
HelloWorld.java:14: 错误: 非法字符: '\u201d'
		System.out.println(“Hello World!”);
		                                ^
5 个错误
zxy@zxydeMacBook-Pro 高博 % 
zxy@zxydeMacBook-Pro 高博 % 
zxy@zxydeMacBook-Pro 高博 % javac HelloWorld.java 
zxy@zxydeMacBook-Pro 高博 % ll
zsh: command not found: ll
zxy@zxydeMacBook-Pro 高博 % ls
HelloWorld.class	HelloWorld.java
zxy@zxydeMacBook-Pro 高博 % cat HelloWorld.class 
????4
	
<init>()VCodeLineNumberTablemain([Ljava/lang/String;)V
SourceFileHelloWorld.java


                        Hello World!

elloWorldjava/lang/Objectjava/lang/SystemoutLjava/io/PrintStream;java/io/PrintStreamprintln(Ljava/lang/String;)V!       *??

	

        	%	???

zxy@zxydeMacBook-Pro 高博 % vim HelloWorld.class 
zxy@zxydeMacBook-Pro 高博 % vi HelloWorld.class 
zxy@zxydeMacBook-Pro 高博 % cat HelloWorld.java 
/*
1.一个java文件中，只能有一个publc类
2.HelloWorld是类名且和文件名相同【HelloWorld要和HelloWorld.java相同】
3.类名一定要采用大驼峰的形式命名
4.在public class中字段+方法=为类体
5.public static里是方法体
6.运行java程序步骤：磁盘上的java文件--->经过编译--->
zxy@zxydeMacBook-Pro 高博 % cat HelloWorld.class 
????4
	
<init>()VCodeLineNumberTablemain([Ljava/lang/String;)V
SourceFileHelloWorld.java


                        Hello World!

elloWorldjava/lang/Objectjava/lang/SystemoutLjava/io/PrintStream;java/io/PrintStreamprintln(Ljava/lang/String;)V!       *??

	

        	%	???


Êþº¾^@^@^@4^@^]
^@^F^@^O        ^@^P^@^Q^H^@^R
^@^S^@^T^G^@^U^G^@^V^A^@^F<init>^A^@^C()V^A^@^DCode^A^@^OLineNumberTable^A^@^Dmain^A^@^V([Ljava/lang/String;)V^A^@
SourceFile^A^@^OHelloWorld.java^L^@^G^@^H^G^@^W^L^@^X^@^Y^A^@^LHello World!^G^@^Z^L^@^[^@^\^A^@
HelloWorld^A^@^Pjava/lang/Object^A^@^Pjava/lang/System^A^@^Cout^A^@^ULjava/io/PrintStream;^A^@^Sjava/io/PrintStream^A^@^Gprintln^A^@^U(Ljava/lang/String;)V^@!^@^E^@^F^@^@^@^@^@^B^@^A^@^G^@^H^@^A^@    ^@^@^@^]^@^A^@^A^@^@^@^E*·^@^A±^@^@^@^A^@
^@^@^@^F^@^A^@^@^@^L^@  ^@^K^@^L^@^A^@  ^@^@^@%^@^B^@^A^@^@^@   ²^@^B^R^C¶^@^D±^@^@^@^A^@
^@^@^@
^@^B^@^@^@^N^@^H^@^O^@^A^@^M^@^@^@^B^@^N
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~ 
main为何是static？
String[] args作用是什么？
*/

/*
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}%                                                                              zxy@zxydeMacBook-Pro 高博 % vi HelloWorld.java 
zxy@zxydeMacBook-Pro 高博 % cat HelloWorld.class 
????4
	
<init>()VCodeLineNumberTablemain([Ljava/lang/String;)V
SourceFileHelloWorld.java


                        Hello World!

elloWorldjava/lang/Objectjava/lang/SystemoutLjava/io/PrintStream;java/io/PrintStreamprintln(Ljava/lang/String;)V!       *??

	

        	%	???

zxy@zxydeMacBook-Pro 高博 % vim HelloWorld.class 
zxy@zxydeMacBook-Pro 高博 % java HelloWorld.java 
错误: 找不到或无法加载主类 HelloWorld.java
zxy@zxydeMacBook-Pro 高博 % java HelloWorld.class 
错误: 找不到或无法加载主类 HelloWorld.class
zxy@zxydeMacBook-Pro 高博 % ./HelloWorld.class
zsh: permission denied: ./HelloWorld.class
zxy@zxydeMacBook-Pro 高博 % ls
HelloWorld.class	HelloWorld.java
zxy@zxydeMacBook-Pro 高博 % ls -d
.
zxy@zxydeMacBook-Pro 高博 % ls -ll
total 16
-rw-r--r--@ 1 zxy  staff   426 12 25 09:45 HelloWorld.class
-rw-r--r--@ 1 zxy  staff  2177 12 25 10:07 HelloWorld.java
zxy@zxydeMacBook-Pro 高博 % ll
zsh: command not found: ll
zxy@zxydeMacBook-Pro 高博 % ls -a
.			HelloWorld.class
..			HelloWorld.java
zxy@zxydeMacBook-Pro 高博 % ls -all
total 16
drwxr-xr-x  4 zxy  staff   128 12 25 10:07 .
drwxr-xr-x  4 zxy  staff   128 12 25 08:34 ..
-rw-r--r--@ 1 zxy  staff   426 12 25 09:45 HelloWorld.class
-rw-r--r--@ 1 zxy  staff  2177 12 25 10:07 HelloWorld.java
zxy@zxydeMacBook-Pro 高博 % java HelloWorld 
Hello World!
zxy@zxydeMacBook-Pro 高博 % javac HelloWorld.java
zxy@zxydeMacBook-Pro 高博 % 
  [恢复于2020年12月25日 14:09:20]
Last login: Fri Dec 25 14:09:17 on console
zxy@zxydeMacBook-Pro 高博 % javac HelloWorld.java 
zxy@zxydeMacBook-Pro 高博 % javac HelloWorld.java -encoding gbk
HelloWorld.java:2: 错误: 编码gbk的不可映射字符
1.涓�涓猨ava鏂囦欢涓紝鍙兘鏈変竴涓猵ublc绫�
   ^
HelloWorld.java:2: 错误: 编码gbk的不可映射字符
1.涓�涓猨ava鏂囦欢涓紝鍙兘鏈変竴涓猵ublc绫�
                            ^
HelloWorld.java:3: 错误: 编码gbk的不可映射字符
2.HelloWorld鏄被鍚嶄笖鍜屾枃浠跺悕鐩稿悓銆怘elloWorld瑕佸拰HelloWorld.java鐩稿悓銆�
                                                            ^
HelloWorld.java:4: 错误: 编码gbk的不可映射字符
3.绫诲悕涓�瀹氳閲囩敤澶ч┘宄扮殑褰㈠紡鍛藉悕
      ^
HelloWorld.java:5: 错误: 编码gbk的不可映射字符
4.鍦╬ublic class涓瓧娈�+鏂规硶=涓虹被浣�
                   ^
HelloWorld.java:5: 错误: 编码gbk的不可映射字符
4.鍦╬ublic class涓瓧娈�+鏂规硶=涓虹被浣�
                             ^
HelloWorld.java:6: 错误: 编码gbk的不可映射字符
5.public static閲屾槸鏂规硶浣�
                      ^
HelloWorld.java:7: 错误: 编码gbk的不可映射字符
6.杩愯java绋嬪簭姝ラ锛氱鐩樹笂鐨�.java鏂囦欢--->缁忚繃javac缂栬瘧--->寰楀埌.class鏂囦欢
                      ^
HelloWorld.java:8: 错误: 编码gbk的不可映射字符
7.涓�涓被浼氱敓鎴愪竴涓瓧鑺傜爜鏂囦欢锛氫负浜嗘柟渚夸娇鐢紝濡傛灉闇�瑕丠elloWorld杩欎釜绫伙紝閭ｄ箞灏卞姞杞藉搴旂殑瀛楄妭鐮佹枃浠�
   ^
HelloWorld.java:8: 错误: 编码gbk的不可映射字符
7.涓�涓被浼氱敓鎴愪竴涓瓧鑺傜爜鏂囦欢锛氫负浜嗘柟渚夸娇鐢紝濡傛灉闇�瑕丠elloWorld杩欎釜绫伙紝閭ｄ箞灏卞姞杞藉搴旂殑瀛楄妭鐮佹枃浠�
                                      ^
HelloWorld.java:8: 错误: 编码gbk的不可映射字符
7.涓�涓被浼氱敓鎴愪竴涓瓧鑺傜爜鏂囦欢锛氫负浜嗘柟渚夸娇鐢紝濡傛灉闇�瑕丠elloWorld杩欎釜绫伙紝閭ｄ箞灏卞姞杞藉搴旂殑瀛楄妭鐮佹枃浠�
                                                                           ^
HelloWorld.java:49: 错误: 编码gbk的不可映射字符
main涓轰綍鏄痵tatic锛�
               ^
HelloWorld.java:53: 错误: 编码gbk的不可映射字符
//杩欐槸琛屾敞閲�
         ^
HelloWorld.java:56: 错误: 编码gbk的不可映射字符
杩欐槸鍧楁敞閲�
       ^
HelloWorld.java:61: 错误: 编码gbk的不可映射字符
* 浣滆�咃細xxx
    ^
15 个错误

]











zxy@zxydeMacBook-Pro 高博 % cat HelloWorld.class 
????4
	
<init>()VCodeLineNumberTablemain([Ljava/lang/String;)V
SourceFileHelloWorld.java


                        Hello World!

elloWorldjava/lang/Objectjava/lang/SystemoutLjava/io/PrintStream;java/io/PrintStreamprintln(Ljava/lang/String;)V!       *??

	

        	%	???


zxy@zxydeMacBook-Pro 高博 % vim HelloWorld.class
Êþº¾^@^@^@4^@^]
^@^F^@^O        ^@^P^@^Q^H^@^R
^@^S^@^T^G^@^U^G^@^V^A^@^F<init>^A^@^C()V^A^@^DCode^A^@^OLineNumberTable^A^@^Dmain^A^@^V([Ljava/lang/String;)V^A^@
SourceFile^A^@^OHelloWorld.java^L^@^G^@^H^G^@^W^L^@^X^@^Y^A^@^LHello World!^G^@^Z^L^@^[^@^\^A^@
HelloWorld^A^@^Pjava/lang/Object^A^@^Pjava/lang/System^A^@^Cout^A^@^ULjava/io/PrintStream;^A^@^Sjava/io/PrintStream^A^@^Gprintln^A^@^U(Ljava/lang/String;)V^@!^@^E^@^F^@^@^@^@^@^B^@^A^@^G^@^H^@^A^@    ^@^@^@^]^@^A^@^A^@^@^@^E*·^@^A±^@^@^@^A^@
^@^@^@^F^@^A^@^@^@^L^@  ^@^K^@^L^@^A^@  ^@^@^@%^@^B^@^A^@^@^@   ²^@^B^R^C¶^@^D±^@^@^@^A^@
^@^@^@
^@^B^@^@^@^N^@^H^@^O^@^A^@^M^@^@^@^B^@^N
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~ 


main为何是static？
String[] args作用是什么？
*/

//这是行注释

/*
这是块注释
*/

/**
* 这是文档注释
* 作者：xxx
* 日期：xxx
* 时间：xxx
*/
public class day01初始及数据类型 {
	/*
		public static void main(String[] args) {
		System.out.println("Hello World!");
	}
	*/

	//1.变量和类型
	/*
	1.整形int 4字节；与平台位数类型无关，否则无法实现跨平台	-2^31~-2^31-1[-2147483648~2147483647]
	2.标识符：数字，字母，下划线，$
	*/
	public static void main(String[] args){
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int max=Integer.MAX_VALUE+1;
		int min=Integer.MIN_VALUE-1;
		System.out.println(max);
		System.out.println(min);

		int a=10;
		System.out.println(a);//打印且换行
		System.out.print(a);//打印不换行
		System.out.printf("%d\n", a);//以格式化的形式进行输出内容

		//如果一个局部变量没有初始化，那么就不能使用[安全性，java也没有全局变量这一说]；在类的内部，方法的外部-->成员变量
		/*
		int b;
		System.out.println(b);
		*/

		/*
		int 2a=0;//错误
		int $a=0;//不建议
		int _a=0;//不建议
		*/
	}
}