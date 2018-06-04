package com.example.compactdisk;

import com.example.compactdisk.config.DiskPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DiskPlayerConfig.class)
public class DiskPlayerTest {

    @Autowired
    private CompactDisk compactDisk;

    @Test
    public void shouldNotBeNull(){
        assertNotNull(compactDisk);
    }

}
