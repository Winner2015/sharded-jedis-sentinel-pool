package redis.clients.jedis;

import java.util.ArrayList;
import java.util.List;

/**
* @author chenlongfei
*/
public class MyShardedTest {
	
	public static void main(String[] args) {
		List<MyShardedInfo> shards = new ArrayList<>();
		
		MyShardedInfo info1 = new MyShardedInfo();
		MyShardedInfo info2 = new MyShardedInfo();
		
		shards.add(info1);
		shards.add(info2);
		
		MySharded pool = new MySharded(shards);
		
		pool.getShard("name1");
		
	}
	
	
	
}

