package com.altametrics.altametricschedule;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Altametrics Inc. Created On 05/09/25 6:23 pm
 */

public class ERSUtilTest extends TestCase {

    private ERSUtil ersUtil;

@Before
    public void setUp() throws Exception {
        super.setUp();
        ersUtil = new ERSUtil();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        ersUtil = null;
    }

    @Test
    public void testReverseStr() {
    StringBuffer result = ersUtil.reverseStr("vivek");
    assertEquals("keviv", result.toString());
   /* StringBuffer result2 = ersUtil.reverseStr("ankit");
    assertEquals("keviv", result2.toString());*/
    }
}