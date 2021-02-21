package com.company;

public class AMDFactory implements AbstractFactory{
    @Override
    public GPU createGPU() {
        return new AMDIntegrationGPU();
    }

    @Override
    public CPU createCPU() {
        return new AMD();
    }
}
