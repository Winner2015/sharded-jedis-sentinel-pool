package redis.clients.jedis;

import redis.clients.util.ShardInfo;

/**
* @author chenlongfei
*/
public class MyShardedInfo extends ShardInfo<String>{
	
	static int counter = 0;
	
	public MyShardedInfo() {
		super(2);
	}

	@Override
	protected String createResource() {
		counter++;
		return "String-" + counter;
	}

	@Override
	public String getName() {
		return null;
	}

}

