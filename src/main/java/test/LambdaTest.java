package test;

/**
* @author chenlongfei
*/
public class LambdaTest {
	
	public static void print(String name, Print print){
		print.print(name);
	}
	
	public static void main(String [] args) {
		String name = "Chen Longfei";
		String prefix = "hello, ";
		
		print(name, (t) -> System.out.println(t));
		
		//与上一行不同的是，Lambda表达式的函数体中引用了外部变量‘prefix’
		print(name, (t) -> System.out.println(prefix + t)); 
		
	}
	
}

@FunctionalInterface
interface Print{
	void print(String name);
}

/**
 * 

用法: javap <options> <classes>
其中, 可能的选项包括:
  -help  --help  -?        输出此用法消息
  -version                 版本信息
  -v  -verbose             输出附加信息
  -l                       输出行号和本地变量表
  -public                  仅显示公共类和成员
  -protected               显示受保护的/公共类和成员
  -package                 显示程序包/受保护的/公共类
                           和成员 (默认)
  -p  -private             显示所有类和成员
  -c                       对代码进行反汇编
  -s                       输出内部类型签名
  -sysinfo                 显示正在处理的类的
                           系统信息 (路径, 大小, 日期, MD5 散列)
  -constants               显示最终常量
  -classpath <path>        指定查找用户类文件的位置
  -cp <path>               指定查找用户类文件的位置
  -bootclasspath <path>    覆盖引导类文件的位置




interface test.Print {
  public abstract void print(java.lang.String);
}


 
Compiled from "LambdaTest.java"
public class test.LambdaTest {
  public test.LambdaTest();
  public static void print(java.lang.String, test.Print);
  public static void main(java.lang.String[]);
  private static void lambda$main$1(java.lang.String);
  private static void lambda$main$0(java.lang.String, java.lang.String);
}
public class test.LambdaTest
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:  						  // 常量池
   #1 = Methodref          #15.#30        // java/lang/Object."<init>":()V
   #2 = InterfaceMethodref #31.#32        // test/Print.print:(Ljava/lang/String;)V
   #3 = String             #33            // Chen Longfei
   #4 = String             #34            // hello,
   #5 = InvokeDynamic      #0:#39         // #0:print:(Ljava/lang/String;)Ltest/Print;
   #6 = Methodref          #14.#40        // test/LambdaTest.print:(Ljava/lang/String;Ltest/Print;)V
   #7 = InvokeDynamic      #1:#42         // #1:print:()Ltest/Print;
   #8 = Fieldref           #43.#44        // java/lang/System.out:Ljava/io/PrintStream;
   #9 = Methodref          #45.#46        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #10 = Class              #47            // java/lang/StringBuilder
  #11 = Methodref          #10.#30        // java/lang/StringBuilder."<init>":()V
  #12 = Methodref          #10.#48        // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #13 = Methodref          #10.#49        // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #14 = Class              #50            // test/LambdaTest
  #15 = Class              #51            // java/lang/Object
  #16 = Utf8               <init>
  #17 = Utf8               ()V
  #18 = Utf8               Code
  #19 = Utf8               LineNumberTable
  #20 = Utf8               print
  #21 = Utf8               (Ljava/lang/String;Ltest/Print;)V
  #22 = Utf8               main
  #23 = Utf8               ([Ljava/lang/String;)V
  #24 = Utf8               lambda$main$1
  #25 = Utf8               (Ljava/lang/String;)V
  #26 = Utf8               lambda$main$0
  #27 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #28 = Utf8               SourceFile
  #29 = Utf8               LambdaTest.java
  #30 = NameAndType        #16:#17        // "<init>":()V
  #31 = Class              #52            // test/Print
  #32 = NameAndType        #20:#25        // print:(Ljava/lang/String;)V
  #33 = Utf8               Chen Longfei
  #34 = Utf8               hello,
  #35 = Utf8               BootstrapMethods
  #36 = MethodHandle       #6:#53         // invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/inv
oke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/M
ethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #37 = MethodType         #25            //  (Ljava/lang/String;)V
  #38 = MethodHandle       #6:#54         // invokestatic test/LambdaTest.lambda$main$0:(Ljava/lang/String;Ljava/lang/St
ring;)V
  #39 = NameAndType        #20:#55        // print:(Ljava/lang/String;)Ltest/Print;
  #40 = NameAndType        #20:#21        // print:(Ljava/lang/String;Ltest/Print;)V
  #41 = MethodHandle       #6:#56         // invokestatic test/LambdaTest.lambda$main$1:(Ljava/lang/String;)V
  #42 = NameAndType        #20:#57        // print:()Ltest/Print;
  #43 = Class              #58            // java/lang/System
  #44 = NameAndType        #59:#60        // out:Ljava/io/PrintStream;
  #45 = Class              #61            // java/io/PrintStream
  #46 = NameAndType        #62:#25        // println:(Ljava/lang/String;)V
  #47 = Utf8               java/lang/StringBuilder
  #48 = NameAndType        #63:#64        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #49 = NameAndType        #65:#66        // toString:()Ljava/lang/String;
  #50 = Utf8               test/LambdaTest
  #51 = Utf8               java/lang/Object
  #52 = Utf8               test/Print
  #53 = Methodref          #67.#68        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHan
dles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;L
java/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #54 = Methodref          #14.#69        // test/LambdaTest.lambda$main$0:(Ljava/lang/String;Ljava/lang/String;)V
  #55 = Utf8               (Ljava/lang/String;)Ltest/Print;
  #56 = Methodref          #14.#70        // test/LambdaTest.lambda$main$1:(Ljava/lang/String;)V
  #57 = Utf8               ()Ltest/Print;
  #58 = Utf8               java/lang/System
  #59 = Utf8               out
  #60 = Utf8               Ljava/io/PrintStream;
  #61 = Utf8               java/io/PrintStream
  #62 = Utf8               println
  #63 = Utf8               append
  #64 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #65 = Utf8               toString
  #66 = Utf8               ()Ljava/lang/String;
  #67 = Class              #71            // java/lang/invoke/LambdaMetafactory
  #68 = NameAndType        #72:#76        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava
/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/
lang/invoke/CallSite;
  #69 = NameAndType        #26:#27        // lambda$main$0:(Ljava/lang/String;Ljava/lang/String;)V
  #70 = NameAndType        #24:#25        // lambda$main$1:(Ljava/lang/String;)V
  #71 = Utf8               java/lang/invoke/LambdaMetafactory
  #72 = Utf8               metafactory
  #73 = Class              #78            // java/lang/invoke/MethodHandles$Lookup
  #74 = Utf8               Lookup
  #75 = Utf8               InnerClasses
  #76 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/
lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #77 = Class              #79            // java/lang/invoke/MethodHandles
  #78 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #79 = Utf8               java/lang/invoke/MethodHandles
{
  public test.LambdaTest();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 6: 0

  public static void print(java.lang.String, test.Print);
    descriptor: (Ljava/lang/String;Ltest/Print;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: aload_0
         2: invokeinterface #2,  2            // InterfaceMethod test/Print.print:(Ljava/lang/String;)V
         7: return
      LineNumberTable:
        line 9: 0
        line 10: 7

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         0: ldc           #3                  // String Chen Longfei
         2: astore_1
         3: ldc           #4                  // String hello,
         5: astore_2
         6: aload_1
         7: aload_2
         8: invokedynamic #5,  0              // InvokeDynamic #0:print:(Ljava/lang/String;)Ltest/Print;
        13: invokestatic  #6                  // Method print:(Ljava/lang/String;Ltest/Print;)V
        16: aload_1
        17: invokedynamic #7,  0              // InvokeDynamic #1:print:()Ltest/Print;
        22: invokestatic  #6                  // Method print:(Ljava/lang/String;Ltest/Print;)V
        25: return
      LineNumberTable:
        line 13: 0
        line 14: 3
        line 16: 6
        line 18: 16
        line 19: 25

  private static void lambda$main$1(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #8                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: aload_0
         4: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         7: return
      LineNumberTable:
        line 18: 0

  private static void lambda$main$0(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=2, args_size=2
         0: getstatic     #8                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: new           #10                 // class java/lang/StringBuilder
         6: dup
         7: invokespecial #11                 // Method java/lang/StringBuilder."<init>":()V
        10: aload_0
        11: invokevirtual #12                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        14: aload_1
        15: invokevirtual #12                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        18: invokevirtual #13                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        21: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        24: return
      LineNumberTable:
        line 16: 0
}
SourceFile: "LambdaTest.java"
InnerClasses:
     public static final #74= #73 of #77; //Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
BootstrapMethods:
  0: #36 invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(
  Ljava/lang/invoke/MethodHandles$Lookup;
  Ljava/lang/String;
  Ljava/lang/invoke/MethodType;
  Ljava/lang/invoke/MethodType;
  Ljava/lang/invoke/MethodHandle;
  Ljava/lang/invoke/MethodType;)
  Ljava/lang/invoke/CallSite;
    Method arguments:
      #37 (Ljava/lang/String;)V
      #38 invokestatic test/LambdaTest.lambda$main$0:(Ljava/lang/String;Ljava/lang/String;)V
      #37 (Ljava/lang/String;)V
  
  1: #36 invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(
  Ljava/lang/invoke/MethodHandles$Lookup;
  Ljava/lang/String;
  Ljava/lang/invoke/MethodType;
  Ljava/lang/invoke/MethodType;
  Ljava/lang/invoke/MethodHandle;
  Ljava/lang/invoke/MethodType;)
  Ljava/lang/invoke/CallSite;
    Method arguments:
      #37 (Ljava/lang/String;)V
      #41 invokestatic test/LambdaTest.lambda$main$1:(Ljava/lang/String;)V
      #37 (Ljava/lang/String;)V


*******************

final class test.LambdaTest$$Lambda$1 implements test.Print {
  private final java.lang.String arg$1;
  private test.LambdaTest$$Lambda$1(java.lang.String);
  private static test.Print get$Lambda(java.lang.String);
  public void print(java.lang.String);
}
final class test.LambdaTest$$Lambda$1 implements test.Print
  minor version: 0
  major version: 52
  flags: ACC_FINAL, ACC_SUPER, ACC_SYNTHETIC
Constant pool:
   #1 = Utf8               test/LambdaTest$$Lambda$1
   #2 = Class              #1             // test/LambdaTest$$Lambda$1
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               test/Print
   #6 = Class              #5             // test/Print
   #7 = Utf8               arg$1
   #8 = Utf8               Ljava/lang/String;
   #9 = Utf8               <init>
  #10 = Utf8               (Ljava/lang/String;)V
  #11 = Utf8               ()V
  #12 = NameAndType        #9:#11         // "<init>":()V
  #13 = Methodref          #4.#12         // java/lang/Object."<init>":()V
  #14 = NameAndType        #7:#8          // arg$1:Ljava/lang/String;
  #15 = Fieldref           #2.#14         // test/LambdaTest$$Lambda$1.arg$1:Ljava/lang/String;
  #16 = Utf8               get$Lambda
  #17 = Utf8               (Ljava/lang/String;)Ltest/Print;
  #18 = NameAndType        #9:#10         // "<init>":(Ljava/lang/String;)V
  #19 = Methodref          #2.#18         // test/LambdaTest$$Lambda$1."<init>":(Ljava/lang/String;)V
  #20 = Utf8               print
  #21 = Utf8               Ljava/lang/invoke/LambdaForm$Hidden;
  #22 = Utf8               test/LambdaTest
  #23 = Class              #22            // test/LambdaTest
  #24 = Utf8               lambda$0
  #25 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #26 = NameAndType        #24:#25        // lambda$0:(Ljava/lang/String;Ljava/lang/String;)V
  #27 = Methodref          #23.#26        // test/LambdaTest.lambda$0:(Ljava/lang/String;Ljava/lang/String;)V
  #28 = Utf8               Code
  #29 = Utf8               RuntimeVisibleAnnotations
{
  private final java.lang.String arg$1;
    descriptor: Ljava/lang/String;
    flags: ACC_PRIVATE, ACC_FINAL

  private test.LambdaTest$$Lambda$1(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: ACC_PRIVATE
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #13                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #15                 // Field arg$1:Ljava/lang/String;
         9: return

  private static test.Print get$Lambda(java.lang.String);
    descriptor: (Ljava/lang/String;)Ltest/Print;
    flags: ACC_PRIVATE, ACC_STATIC
    Code:
      stack=3, locals=1, args_size=1
         0: new           #2                  // class test/LambdaTest$$Lambda$1
         3: dup
         4: aload_0
         5: invokespecial #19                 // Method "<init>":(Ljava/lang/String;)V
         8: areturn

  public void print(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #15                 // Field arg$1:Ljava/lang/String;
         4: aload_1
         5: invokestatic  #27                 // Method test/LambdaTest.lambda$0:(Ljava/lang/String;Ljava/lang/String;)V

         8: return
    RuntimeVisibleAnnotations:
      0: #21()
}



***************



final class test.LambdaTest$$Lambda$2 implements test.Print {
  private test.LambdaTest$$Lambda$2();
  public void print(java.lang.String);
}
final class test.LambdaTest$$Lambda$2 implements test.Print
  minor version: 0
  major version: 52
  flags: ACC_FINAL, ACC_SUPER, ACC_SYNTHETIC
Constant pool:
   #1 = Utf8               test/LambdaTest$$Lambda$2
   #2 = Class              #1             // test/LambdaTest$$Lambda$2
   #3 = Utf8               java/lang/Object
   #4 = Class              #3             // java/lang/Object
   #5 = Utf8               test/Print
   #6 = Class              #5             // test/Print
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = NameAndType        #7:#8          // "<init>":()V
  #10 = Methodref          #4.#9          // java/lang/Object."<init>":()V
  #11 = Utf8               print
  #12 = Utf8               (Ljava/lang/String;)V
  #13 = Utf8               Ljava/lang/invoke/LambdaForm$Hidden;
  #14 = Utf8               test/LambdaTest
  #15 = Class              #14            // test/LambdaTest
  #16 = Utf8               lambda$1
  #17 = NameAndType        #16:#12        // lambda$1:(Ljava/lang/String;)V
  #18 = Methodref          #15.#17        // test/LambdaTest.lambda$1:(Ljava/lang/String;)V
  #19 = Utf8               Code
  #20 = Utf8               RuntimeVisibleAnnotations
{
  private test.LambdaTest$$Lambda$2();
    descriptor: ()V
    flags: ACC_PRIVATE
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: return

  public void print(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: invokestatic  #18                 // Method test/LambdaTest.lambda$1:(Ljava/lang/String;)V
         4: return
    RuntimeVisibleAnnotations:
      0: #13()
}


 * 
 */
