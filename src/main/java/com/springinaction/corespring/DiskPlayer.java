package com.springinaction.corespring;

import org.springframework.stereotype.Component;

@Component
public class DiskPlayer implements CompactDisk{

    public void display(){
        System.out.println("DiskPlayer display() method");
    }

    public void playing(){
        System.out.println("DiskPlayer playing() method");
    }
}
