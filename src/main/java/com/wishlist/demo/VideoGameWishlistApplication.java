package com.wishlist.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.wishlist.demo.VideoGame")
public class VideoGameWishlistApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoGameWishlistApplication.class, args);
	}

}
