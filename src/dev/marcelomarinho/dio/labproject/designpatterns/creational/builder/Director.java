package dev.marcelomarinho.dio.labproject.designpatterns.creational.builder;

public class Director {

    public void buildPersonalComputer(PersonalComputerBuilder builder) {
        builder.reset();
        builder.setCpu(CpuEnum.AMD_RYZEN_7_5700);
        builder.setRam(32);
        builder.setStorage(StorageEnum.SSD_1TB_KINGSTON);
    }

    public void buildServer(PersonalComputerBuilder builder) {
        builder.reset();
        builder.setCpu(CpuEnum.AMD_THREADRIPPER_PRO_5975);
        builder.setRam(128);
        builder.setStorage(StorageEnum.SSD_8TB_CORSAIR);
    }

}
