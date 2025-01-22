// package com.junitlearning.junitlearning;

// import org.junit.After;
// import org.junit.AfterClass;
// import org.junit.Before;
// import org.junit.BeforeClass;
// import org.junit.Test;
// import static org.junit.Assert.assertEquals;

// public class JUnit4AnnotationsExample {

//     @BeforeClass
//     public static void setUpBeforeClass() {
//         System.out.println("This runs once before any test in this class.");
//     }

//     @Before
//     public void setUp() {
//         System.out.println("This runs before each test.");
//     }

//     @Test
//     public void testAddition() {
//         int result = 1 + 1;
//         assertEquals(2, result);
//     }

//     @Test
//     public void testSubtraction() {
//         int result = 5 - 3;
//         assertEquals(2, result);
//     }

//     @After
//     public void tearDown() {
//         System.out.println("This runs after each test.");
//     }

//     @AfterClass
//     public static void tearDownAfterClass() {
//         System.out.println("This runs once after all tests in this class.");
//     }
// }
