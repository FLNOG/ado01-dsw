package br.com.carstore.model;

public class Carro {
    private String name;
    private String color;

    public Carro(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "car: {" +
                "name='" + '"' + name + '"' + '\'' +
                ", color='" + '"' + color + '"' + '\'' +
                '}';
    }
}