package com.company;

public class BuilderOffices implements Builder{
    @Override
    public void buildWalls(String s) {
        System.out.println("Building "+ s +" walls");
    }

    @Override
    public void buildRoof(boolean b) {
        if (b = true)
        {
            System.out.println("Building roof");
        }
        else{
            System.out.println("No roof");
        }
    }

    @Override
    public void buildWindows(boolean b) {
        if (b = true)
        {
            System.out.println("Building windows");
        }
        else{
            System.out.println("No windows");
        }
    }

    @Override
    public void buildDoor(boolean b) {
        if (b = true)
        {
            System.out.println("Building door");
        }
        else{
            System.out.println("No doors");
        }
    }

    @Override
    public void getResult() {
        System.out.println("All is done");
    }
}
