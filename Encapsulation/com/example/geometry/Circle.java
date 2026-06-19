package com.example.geometry;

public class Circle
{
    public int radius;
    public Circle (int radius) {
        this.radius = radius;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.radius;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circle other = (Circle) obj;
        return this.radius == other.radius;
    }
    
}

