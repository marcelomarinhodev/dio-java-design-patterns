package dev.marcelomarinho.dio.labproject.designpatterns.creational.builder;

public class PersonalComputerBuilder implements ComputerBuilder {

    private Computer computer;

    @Override
    public void reset() {
        computer = new Computer();
    }

    @Override
    public void setCpu(CpuEnum cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void setRam(Integer ramGb) {
        computer.setRamGb(ramGb);
    }

    @Override
    public void setStorage(StorageEnum storage) {
        computer.setStorage(storage);
    }

    public Computer getObject() {
        Computer instance = computer;
        this.reset();
        return instance;
    }
}
