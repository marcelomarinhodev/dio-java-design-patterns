package dev.marcelomarinho.dio.labproject.designpatterns.creational.builder;

public class Computer {

    private CpuEnum cpu;
    private Integer ramGb;
    private StorageEnum storage;

    public CpuEnum getCpu() {
        return cpu;
    }

    public void setCpu(CpuEnum cpu) {
        this.cpu = cpu;
    }

    public Integer getRamGb() {
        return ramGb;
    }

    public void setRamGb(Integer ramGb) {
        this.ramGb = ramGb;
    }

    public StorageEnum getStorage() {
        return storage;
    }

    public void setStorage(StorageEnum storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "cpu=" + cpu +
                ", ramGb=" + ramGb +
                ", storage=" + storage +
                '}';
    }
}
