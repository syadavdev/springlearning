package com.example.compactdisk.cdPlayer;

import com.example.compactdisk.CompactDisk;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer implements CompactDisk {

    @Override
    public void display() {
        System.out.println("This is CdPlayer display() method");
    }
}
