package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AbstractFactory abstractFactory = AbstractFactory.getFactory(Architecture.EMBER);
        Cpu cpu = abstractFactory.createCpu();
        Mmu mmu = abstractFactory.creaMmu();
        System.out.println(cpu);
        System.out.println(mmu);
        abstractFactory = AbstractFactory.getFactory(Architecture.ENGINOLA);
        cpu = abstractFactory.createCpu();
        mmu = abstractFactory.creaMmu();
        System.out.println(cpu);
        System.out.println(mmu);
    }
}
