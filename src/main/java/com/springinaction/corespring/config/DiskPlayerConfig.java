package com.springinaction.corespring.config;

import com.springinaction.corespring.DiskPlayer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(value = "com.example.compact.disk")
@ComponentScan(basePackageClasses = {DiskPlayer.class})
@Configuration
public class DiskPlayerConfig {

}
