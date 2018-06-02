package com.example.compact.disk;

import org.springframework.stereotype.Component;

@Component
public class DiskPlayer implements CompactDisk{

    public void display(){
        System.out.println("Displaying The Diskplayer");
    }

    public void playing(){
        System.out.println("Playing the Music");
    }
}
