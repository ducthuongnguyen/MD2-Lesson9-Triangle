import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void classify222() {
        String result = TriangleClassifier.classify(2,2,2);
        assertEquals(TriangleClassifier.TYPE_EQUILATERAL,result);
    }

    @org.junit.jupiter.api.Test
    void classify223() {
        String result = TriangleClassifier.classify(2,2,3);
        assertEquals(TriangleClassifier.TYPE_ISOSCELES,result);
    }

    @org.junit.jupiter.api.Test
    void classify232() {
        String result = TriangleClassifier.classify(2,3,2);
        assertEquals(TriangleClassifier.TYPE_ISOSCELES,result);
    }

    @org.junit.jupiter.api.Test
    void classify322() {
        String result = TriangleClassifier.classify(3,2,2);
        assertEquals(TriangleClassifier.TYPE_ISOSCELES,result);
    }


    @org.junit.jupiter.api.Test
    void classify345() {
        String result = TriangleClassifier.classify(3,4,5);
        assertEquals(TriangleClassifier.TYPE_NORMAL,result);
    }

    @org.junit.jupiter.api.Test
    void classify493() {
        String result = TriangleClassifier.classify(4,9,3);
        assertEquals(TriangleClassifier.TYPE_INVALID,result);
    }

    @org.junit.jupiter.api.Test
    void classify113() {
        String result = TriangleClassifier.classify(1,1,3);
        assertEquals(TriangleClassifier.TYPE_INVALID,result);
    }
}