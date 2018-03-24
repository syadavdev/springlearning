package com.example.compact;

import org.springframework.stereotype.Component;

@Component
public class DiskPlayer implements CompactDisk{
    public void display(){
        System.out.println("display diskplayer");
    }
}
