package com.ecommerce.tests;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@DisplayName("JUnit 5 Standard Test Class Example")
@RunWith(JUnitPlatform.class)
public class StandardTestClass {

    @BeforeClass
    static void initAll() {
        System.out.println("initAll()");
    }

    @Before
    void init() {
        System.out.println("init()");

    }
    

    @Test
    void succeedingTest() {
        System.out.println("succeedingTest()");

    }

    @Test
    void failingTest() {
        System.out.println("failingTest()");

        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    void abortedTest() {
        System.out.println("abortedTest()");

        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    private void assumeTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	@After
    void tearDown() {
        System.out.println("tearDown()");

    }

    @AfterClass
    static void tearDownAll() {
        System.out.println("tearDownAll()");

    }

}
