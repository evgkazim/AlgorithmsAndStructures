package ru.kazim.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HighArrayTest {
    @Test
    void main() {
        int maxSize = 100;
        HighArray highArray = new HighArray(maxSize);

        highArray.insert(77);
        highArray.insert(99);
        highArray.insert(44);
        highArray.insert(55);
        highArray.insert(22);
        highArray.insert(88);
        highArray.insert(11);
        highArray.insert(00);
        highArray.insert(66);
        highArray.insert(33);

        highArray.insert(22);
        highArray.insert(33);
        highArray.insert(33);
        highArray.display();

        highArray.noDups();
        highArray.display();
    }

}