package com.backontrack.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int counter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of all tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("This is the end of all tests.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        counter ++;
        System.out.println("Preparing to execute test #" + counter);
    }

    @Nested
    @DisplayName("Test Shapes")
    class TestShapes {
        @Test
        void testGetShapeName() {
            //Given
            Shape circle = new Circle(4.0);

            //When
            String expectedShapeName = "Circle";
            String resultShapeName = circle.getShapeName();
            System.out.println(resultShapeName);

            //Then
            assertEquals(expectedShapeName, resultShapeName);
        }

        @Test
        void testGetField() {
            //Given
            Shape circle = new Circle(4.0);

            //When
            double expectedField = 50;
            double resultField = circle.getField();
            System.out.println(resultField);

            //Then
            assertEquals(expectedField, resultField, 0.5);
        }
    }

    @Nested
    @DisplayName("Test Shape Collector")
    class TestShapeCollector {
        @Test
        void testAddShape() {
            //Given
            Shape square = new Square(5.0);
            ShapeCollector collector = new ShapeCollector();

            //When
            collector.addShape(square);

            //Then
            assertEquals(1, collector.getShapesQuantity());
        }

        @Test
        void testRemoveShapeNonExisting() {
            //Given
            Shape square = new Square(5.0);
            ShapeCollector collector = new ShapeCollector();

            //When
            boolean result = collector.removeShape(square);

            //Then
            assertFalse(result);
        }

        @Test
        void testRemoveShape() {
            //Given
            Shape square = new Square(5.0);
            ShapeCollector collector = new ShapeCollector();

            //When
            collector.addShape(square);
            boolean result = collector.removeShape(square);

            //Then
            assertTrue(result);
            assertEquals(1, collector.getShapesQuantity());
        }

        @Test
        void testGetShapeNonExisting() {
            //Given
            ShapeCollector collector = new ShapeCollector();

            //When
            Shape retrievedShape = collector.getShape(0);

            //Then
            assertNull(retrievedShape);
        }

        @Test
        void testGetShape() {
            //Given
            Shape square = new Square(5.0);
            ShapeCollector collector = new ShapeCollector();
            collector.addShape(square);

            //When
            Shape retrievedShape = collector.getShape(0);

            //Then
            assertEquals(square, retrievedShape);
        }

        @Test
        void testShowShapes() {
            //Given
            Shape square = new Square(5.0);
            Shape circle = new Circle(4.0);
            Shape triangle = new Triangle(4.0, 3.5);
            ShapeCollector collector = new ShapeCollector();
            collector.addShape(square);
            collector.addShape(circle);
            collector.addShape(triangle);

            //When
            String expectedShapeShow = "Square, Circle, Triangle";
            String shapeShow = collector.showShapes();
            System.out.println(shapeShow);

            //Then
            assertEquals(expectedShapeShow, shapeShow);
        }
    }
}
