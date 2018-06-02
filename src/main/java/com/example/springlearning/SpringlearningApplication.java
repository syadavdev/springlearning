package com.example.springlearning;

import com.example.compact.disk.CompactDisk;
import com.example.compact.disk.DiskPlayer;
import com.example.compact.disk.config.DiskPlayerConfig;
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
