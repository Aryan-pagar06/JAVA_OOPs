package com.example.utils;
import com.example.geometry.Circle;
public class Calculator 
{
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        double cirarea = Math.PI * Math.pow(c1.radius, 2);
        System.out.println(cirarea);

    }
}