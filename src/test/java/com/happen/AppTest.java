package com.happen;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static App app;

    @Before
    public void init(){
        app = new App();
    }

    @Test
    public void addTest()
    {
        Assert.assertEquals(3, app.add(1, 2));

        Assert.assertEquals(0, app.adds());
        Assert.assertEquals(10, app.adds(1,2,3,4));
        Assert.assertEquals(15, app.adds(1,2,3,4,5));
    }
}
