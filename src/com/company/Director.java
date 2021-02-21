package com.company;

public class Director {
    public void construct(Builder builder, String walls, boolean door, boolean roof, boolean windows){
        builder.buildDoor(door);
        builder.buildRoof(roof);
        builder.buildWalls(walls);
        builder.buildWindows(windows);
    }
}
