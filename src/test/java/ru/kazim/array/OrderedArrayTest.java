package ru.kazim.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderedArrayTest {
    @Test
    void main() {
        int maxSize = 100;
        OrderedArray orderedArray = new OrderedArray(maxSize);

        orderedArray.insert(77);
        orderedArray.insert(99);
        orderedArray.insert(44);
        orderedArray.insert(55);
        orderedArray.insert(22);
        orderedArray.insert(88);
        orderedArray.insert(11);
        orderedArray.insert(00);
        orderedArray.insert(66);
        orderedArray.insert(33);
        orderedArray.display();

        long[] tempArray = new long[]{10, 20, 30};
        orderedArray.merge(tempArray);
        orderedArray.display();
    }

}