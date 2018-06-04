package com.example.compactdisk.cdPlayer;

import com.example.compactdisk.config.DiskPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DiskPlayerConfig.class)
public class CdPlayerTest {

    @InjectMocks
    private CdPlayer cdPlayer;

    @Test
    public void shouldNotNull(){
        assertNotNull(cdPlayer);
    }

}
