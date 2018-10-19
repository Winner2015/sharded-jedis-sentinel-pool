package redis.clients.jedis;
/**
* @author chenlongfei
*/
public class LambdaTest {
	
	public static void printString(String s, Print<String> function) {
		function.print(s);
	}
	
	public static void main(String [] args) {
		printString("Hello world", (t) -> System.out.print(t));
	}
	
}

@FunctionalInterface
interface Print<T>{
	void print(T t);
}

