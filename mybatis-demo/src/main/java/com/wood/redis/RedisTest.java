package com.wood.redis;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest {
	
	public static void main(String[] args) {
		Object obj = new Object();
		ReferenceQueue softQueue = new ReferenceQueue();
		SoftReference sR = new SoftReference(obj, softQueue);
		obj = null;
		System.gc();
		System.gc();
		System.gc();System.gc();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sR.get());
	}

	//@Test
	public void pubsubTest() {
		Jedis je = null;
		try {
			je = new Jedis("127.0.0.1", 6379, 0);
//			je.auth("123456");
			TestPubSub ps = new TestPubSub();
			ps.proceed(je.getClient(), "news.share", "news.blog");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (je != null) {
				je.close();
			}
		}
	}
}
