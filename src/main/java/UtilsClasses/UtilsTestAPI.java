package UtilsClasses;

import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class UtilsTestAPI<T> {

	 private Cache<String, T> cache;

	    //Constructor to build Cache Store
	    public UtilsTestAPI(int expiryDuration, TimeUnit timeUnit) {
	        cache = CacheBuilder.newBuilder()
	                .expireAfterWrite(expiryDuration, timeUnit)
	                .concurrencyLevel(Runtime.getRuntime().availableProcessors())
	                .build();
	        System.out.println(cache+ "ßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßßß");
	    }
	   
}
