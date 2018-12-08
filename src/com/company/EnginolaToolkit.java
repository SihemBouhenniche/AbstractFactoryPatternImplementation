package com.company;

public class EnginolaToolkit extends AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new EnginolaCpu();
    }

    @Override
    public Mmu creaMmu() {
        return new EnginolaMmu();
    }
}
