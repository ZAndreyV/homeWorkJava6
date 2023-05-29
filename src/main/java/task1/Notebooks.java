package task1;

import java.util.Objects;

public class Notebooks {
    double diagonal;
    int ram;
    int volumeHDD;
    String operatingSystem;
    String colour;
    String cpu;
    String videoCard;
    String name;
    double price;

    public Notebooks(int ram, int volumeHDD, String operatingSystem, String colour, String cpu, String videoCard, String name, double price, double diagonal) {
        this.ram = ram;
        this.volumeHDD = volumeHDD;
        this.operatingSystem = operatingSystem;
        this.colour = colour;
        this.cpu = cpu;
        this.videoCard = videoCard;
        this.name = name;
        this.price = price;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return String.format("Название: %s, Диагональ: %f, Процессор: %s, Оперативная память: %s Гб, " +
                        "Накопители данных: %s Гб, Операционная система: %s, Модель видеокарты: %s, Цвет: %s, " +
                        "Цена: %f", name, diagonal, cpu, ram, volumeHDD, operatingSystem, videoCard, colour, price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, volumeHDD, operatingSystem, colour, cpu, videoCard, name, diagonal);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Notebooks)) {
            return false;
        }
        Notebooks temp = (Notebooks) obj;
        return (temp.ram == this.ram && temp.volumeHDD == this.volumeHDD && temp.operatingSystem == this.operatingSystem
        && temp.colour == this.colour && temp.cpu == this.cpu && temp.videoCard == this.videoCard && temp.name == this.name && temp.diagonal == this.diagonal);
    }

    public int getRam() {
        return ram;
    }

    public int getVolumeHDD() {
        return volumeHDD;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColour() {
        return colour;
    }
}
