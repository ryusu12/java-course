package chapter02.ch2_6;

interface Device {
    // 기기를 켜는 기능
    void turnOn();

    // 기기를 끄는 기능
    void turnOff();
}

class Tv implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV 킴");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 끔");
    }

    void turnChannel() {
        System.out.println("TV 채널 변경");
    }
}


class AirConditioner implements Device {
    @Override
    public void turnOn() {
        System.out.println("에어컨 킴");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨 끔");
    }

    void setCold() {
        System.out.println("에어컨 온도 조절");
    }
}

class Computer implements Device {
    @Override
    public void turnOn() {
        System.out.println("컴퓨터 킴");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터 끔");
    }

    void exeProgram() {
        System.out.println("컴퓨터 프로그램 실행");
    }
}


public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        AirConditioner airConditioner = new AirConditioner();
        Computer computer = new Computer();

        tv.turnOn();
        tv.turnChannel();
        tv.turnOff();
        System.out.println();

        airConditioner.turnOn();
        airConditioner.setCold();
        airConditioner.turnOff();
        System.out.println();

        computer.turnOn();
        computer.exeProgram();
        computer.turnOff();
    }
}