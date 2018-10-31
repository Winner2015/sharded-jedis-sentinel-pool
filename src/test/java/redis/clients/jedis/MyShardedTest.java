package redis.clients.jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
* @author chenlongfei
*/
public class MyShardedTest {
	
	public static void main(String[] args) {
//		List<MyShardedInfo> shards = new ArrayList<>();
//		
//		MyShardedInfo info1 = new MyShardedInfo();
//		MyShardedInfo info2 = new MyShardedInfo();
//		
//		shards.add(info1);
//		shards.add(info2);
//		
//		MySharded pool = new MySharded(shards);
//		
//		pool.getShard("name1");
		
		
		

	Map<Boolean, List<Integer>> collectParti = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
            .collect(Collectors.partitioningBy(it -> it % 2 == 0));
	System.out.println("collectParti : " + collectParti);
	
	
	Map<Integer, List<Integer>> collectParti2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
            .collect(Collectors.groupingBy(t -> t % 3));
	System.out.println("collectParti2 : " + collectParti2);
	
	
	}
	
	
	
}

