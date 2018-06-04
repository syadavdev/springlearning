package com.example.compactdisk.config;

import com.example.compactdisk.DiskPlayer;
import com.example.compactdisk.cdPlayer.CdPlayer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(value = "com.example.compact.disk")
@ComponentScan(basePackageClasses = {CdPlayer.class,DiskPlayer.class})
@Configuration
public class DiskPlayerConfig {

}
