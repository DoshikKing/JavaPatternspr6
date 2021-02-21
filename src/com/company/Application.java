package com.company;

public class Application {
    private CPU cpu;
    private GPU gpu;

    public Application(AbstractFactory factory){
        cpu = factory.createCPU();
        gpu = factory.createGPU();
    }
    public void create(){
        cpu.create();
        gpu.create();
    }
}
