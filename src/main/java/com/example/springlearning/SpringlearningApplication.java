package com.example.springlearning;

import com.example.compactdisk.CompactDisk;
import com.example.compactdisk.DiskPlayer;
import com.example.compactdisk.config.DiskPlayerConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringlearningApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SpringlearningApplication.class, args);
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DiskPlayerConfig.class);

		CompactDisk cd = ctx.getBean(CompactDisk.class);
		DiskPlayer dp = (DiskPlayer) cd;

		cd.display();
		dp.playing();
	}
	
}
