package dev.marcelomarinho.dio.labproject.designpatterns.creational.builder;

public interface ComputerBuilder {

    void reset();
    void setCpu(CpuEnum cpu);
    void setRam(Integer ramGb);
    void setStorage(StorageEnum storage);

}
