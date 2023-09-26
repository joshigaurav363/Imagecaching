package com.imageCaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
class TestImageCachingApplication {

	public static void main(String[] args) {
		SpringApplication.from(ImageCachingApplication::main).with(TestImageCachingApplication.class).run(args);
	}

}
