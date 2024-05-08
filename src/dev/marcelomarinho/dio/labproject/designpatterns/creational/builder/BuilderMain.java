package dev.marcelomarinho.dio.labproject.designpatterns.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {

        Director director = new Director();

        PersonalComputerBuilder personalComputerBuilder = new PersonalComputerBuilder();

        // object creation is abstracted by this method
        // specially effective if object is more complex
        director.buildPersonalComputer(personalComputerBuilder);
        Computer personalComputer = personalComputerBuilder.getObject();

        // object creation is abstracted by this method
        // specially effective if object is more complex
        director.buildServer(personalComputerBuilder);
        Computer server = personalComputerBuilder.getObject();

        System.out.println(personalComputer);
        System.out.println(server);
    }

}
