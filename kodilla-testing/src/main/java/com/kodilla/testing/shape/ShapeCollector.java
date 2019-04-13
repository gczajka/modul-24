package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> theList = new ArrayList<Shape>();

    public ArrayList getTheList() {
        return theList;
    }

    public void addFigure(Shape shape){
        theList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(theList.contains(shape)){
            theList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape figure = null;
        if(n >= 0 && n < theList.size()){
            figure = theList.get(n);
        }
        return figure;
    }

}
