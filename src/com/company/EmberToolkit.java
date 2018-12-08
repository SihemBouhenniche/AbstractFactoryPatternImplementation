package com.company;

public class EmberToolkit extends AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new EmberCpu();
    }

    @Override
    public Mmu creaMmu() {
        return new EmberMmu();
    }
}
