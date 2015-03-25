package com.example.migueldominguez.mapdemo;

/**
 * Created by Miguel Dominguez on 3/24/2015.
 */
public class Coordinates {
    private double x;
    private double y;

    Coordinates()
    {
        x = 0;
        y = 0;
    }

    Coordinates(double _x, double _y)
    {
        x = _x;
        y = _y;
    }

    public void setCoordinates(double _x, double _y)
    {
        x = _x;
        y = _y;
    }

    public double X()
    {
        return x;
    }

    public double Y()
    {
        return y;
    }
}
