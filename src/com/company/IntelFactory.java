package com.company;

public class IntelFactory implements AbstractFactory{

    @Override
    public GPU createGPU() {
        return new IntelIntegrationGPU();
    }

    @Override
    public CPU createCPU() {
        return new Intel();
    }
}
