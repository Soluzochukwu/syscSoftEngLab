package com.sysc4806.app;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by CraigBook on 2018-02-08.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressBookControllerTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();
    }

    @Autowired
    private AddressBookController controller;

    @Test
    public void checkContext() throws Exception {
        assert(controller != null );
    }
}