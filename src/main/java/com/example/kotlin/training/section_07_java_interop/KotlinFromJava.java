package com.example.kotlin.training.section_07_java_interop;

import com.example.kotlin.training.section_04_extensions_function.Task04Kt;
import com.example.kotlin.training.section_05_class.DoubledList;

import java.util.ArrayList;
import java.util.List;

public class KotlinFromJava {

    public void extensionsFunctions() {
        boolean isTenEven = Task04Kt.isEven(10);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        List<Integer> evenNumbers = Task04Kt.evenNumbers(integers);
    }

    public void kotlinClass() {
        Point point1 = new Point();
        Point point2 = new Point(1);
        Point point3 = new Point(1, 1);
    }

    public void kotlinList() {
        List<Integer> doubledList = new DoubledList<>();
        doubledList.add(10);
    }
}
