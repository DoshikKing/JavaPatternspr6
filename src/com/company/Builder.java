package com.company;

public interface Builder {
    public void buildWalls(String count);
    public void buildRoof(boolean state);
    public void buildWindows(boolean state);
    public void buildDoor(boolean state);
    public void getResult();
}
