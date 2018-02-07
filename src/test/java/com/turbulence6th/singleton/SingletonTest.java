package com.turbulence6th.singleton;

import java.lang.reflect.Field;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

import com.turbulence6th.singleton.LazySingleton;
import com.turbulence6th.singleton.LazyThreadSafeSingleton;
import com.turbulence6th.singleton.Singleton;

public class SingletonTest {

	@Test
	public void isSingleton() {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		Assert.assertNotEquals(null, singleton1);
		Assert.assertEquals(singleton1, singleton2);
	}

	@Test
	public void isLazySingleton() throws Exception {
		Field field = LazySingleton.class.getDeclaredField("instance");
		field.setAccessible(true);
		LazySingleton singleton1 = (LazySingleton) field.get(null);
		LazySingleton singleton2 = LazySingleton.getInstance();
		LazySingleton singleton3 = LazySingleton.getInstance();

		Assert.assertEquals(null, singleton1);
		Assert.assertNotEquals(null, singleton2);
		Assert.assertEquals(singleton2, singleton3);
	}

	@Test
	public void isLazyThreadSafeSingleton() throws Exception {
		Field field = LazyThreadSafeSingleton.class.getDeclaredField("instance");
		field.setAccessible(true);
		LazyThreadSafeSingleton singleton1 = (LazyThreadSafeSingleton) field.get(null);
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		Set<LazyThreadSafeSingleton> set = IntStream.range(0, 10)
				.mapToObj(a -> service.submit(LazyThreadSafeSingleton::getInstance)).collect(Collectors.toList())
				.stream().map(a -> {
					try {
						return a.get();
					} catch (InterruptedException | ExecutionException e) {
						e.printStackTrace();
					}
					
					return null;
				}).collect(Collectors.toSet());

		Assert.assertEquals(null, singleton1);
		Assert.assertEquals(1, set.size());
	}

}

