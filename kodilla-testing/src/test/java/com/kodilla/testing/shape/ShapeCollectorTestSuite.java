package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

import java.util.*;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Executing test #" + testCounter);
    }

    @Test
    void testAddShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle", 5);

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assertions.assertEquals(circle, shapeCollector.shapes.get(0));
    }

    @Test
    void testRemoveShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("square", 4);
        shapeCollector.addFigure(square);

        //When
        boolean result = shapeCollector.removeFigure(square);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.shapes.size());
    }

    @Test
    void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("triangle", 8);
        shapeCollector.addFigure(triangle);

        //When
        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure(0);

        //Then
        Assertions.assertEquals(triangle, retrievedShape);
    }

    @Test
    void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("square", 4);
        Circle circle = new Circle("circle", 5);
        Triangle triangle = new Triangle("triangle", 8);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        //When
        List<Shape> addedShapes;
        addedShapes = shapeCollector.showFigures();

        //Then
        Assertions.assertEquals(addedShapes, shapeCollector.showFigures());
    }
}