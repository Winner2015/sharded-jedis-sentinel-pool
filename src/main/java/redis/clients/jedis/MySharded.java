package redis.clients.jedis;

import java.util.List;

import redis.clients.util.Sharded;

/**
* @author chenlongfei
*/
public class MySharded extends Sharded<String, MyShardedInfo>{

	public MySharded(List<MyShardedInfo> shards) {
		super(shards);
	}

}

