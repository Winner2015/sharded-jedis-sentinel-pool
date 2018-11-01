package test;

public class Test2 {

}


public static void main(java.lang.String[]);
descriptor: ([Ljava/lang/String;)V
flags: ACC_PUBLIC, ACC_STATIC
Code:
  stack=2, locals=3, args_size=1
  	 // 将字符串常量"Chen Longfei"从常量池压栈到操作数栈
  	 0: ldc           #3                  // String Chen Longfei
  	 
     // 将栈顶引用型数值存入第二个本地变，即 String name = "Chen Longfei"
     2: astore_1
     
     // 将字符串常量"hello,"从常量池压栈到操作数栈
     3: ldc           #4                  // String hello,
     
     // 将栈顶引用型数值存入第三个本地变量， 即  String prefix = "hello, "
     5: astore_2
     
     //将第二个引用类型本地变量推送至栈顶，即  name
     6: aload_1
     
     //将第三个引用类型本地变量推送至栈顶，即 prefix
     7: aload_2
     
     //通过invokedynamic指令创建Print接口的实例，即 (t) -> System.out.println(prefix + t)
     8: invokedynamic #5,  0              // InvokeDynamic #0:print:(Ljava/lang/String;)Ltest/Print;
    
     //调用静态方法print
     13: invokestatic  #6                  // Method print:(Ljava/lang/String;Ltest/Print;)V
    
     //将第二个引用类型本地变量推送至栈顶，即  name
     16: aload_1
     
     //通过invokedynamic指令创建Print接口的实例，即 (t) -> System.out.println(t)
    17: invokedynamic #7,  0              // InvokeDynamic #1:print:()Ltest/Print;
    
     //调用静态方法print
    22: invokestatic  #6                  // Method print:(Ljava/lang/String;Ltest/Print;)V
    25: return
    ……
    		
    	
    //匿名内部类
    InnerClasses:
        public static final #74= #73 of #77; //Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
   BootstrapMethods:
	 //调用静态工厂LambdaMetafactory.metafactory创建匿名内部类1。实现了 (t) -> System.out.println(prefix + t)
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
       //该类会调用静态方法LambdaTest.lambda$main$0
         #38 invokestatic test/LambdaTest.lambda$main$0:(Ljava/lang/String;Ljava/lang/String;)V
         #37 (Ljava/lang/String;)V
     
     //调用静态工厂LambdaMetafactory.metafactory创建匿名内部类2，实现了 (t) -> System.out.println(t)
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
         //该类会调用静态方法LambdaTest.lambda$main$1
         #41 invokestatic test/LambdaTest.lambda$main$1:(Ljava/lang/String;)V
         #37 (Ljava/lang/String;)V