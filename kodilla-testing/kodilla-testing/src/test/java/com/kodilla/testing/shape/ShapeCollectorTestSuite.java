package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        System.out.println("Test Case: end.");
    }
    @Nested
    @DisplayName ("Tests Add/Remove")

    class TestAddRemove {
        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            Shape shape = new Square(2);
            //Then
            Assertions.assertEquals(0, shapeCollector.getShapeCollection().size());
        }
        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(2);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            assertTrue(result);
            Assertions.assertNotEquals(1,shapeCollector.getShapeCollection().size());
        }
    }
    @Nested
    @DisplayName ("Test Get/Show")

    class GetShow {
        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(4);
            shapeCollector.addFigure(shape);
            //When
            Shape shapeResult = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape,shapeResult);
        }
        @Test
        public void testShowFigures(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(4);
            shapeCollector.addFigure(shape);
            List<Shape> shapeList = new ArrayList<>();
            shapeList.add(shape);
            //When
            List<Shape> shapeResultList = shapeCollector.getShapeCollection();
            //Then
            Assertions.assertEquals(shapeList.toString(),shapeResultList.toString());
        }
    }
}
