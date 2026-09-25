package DesignPatterns;

class CPU{
    void start(){
        System.out.println("Starting CPU");
    }
}

class RAM{
    void load(){
        System.out.println("Ram loaded");
    }

}

class HardDrive{
    void read(){
        System.out.println("Hard Drive Reading");
    }
}

class ComputerFacade{
    private CPU cpu = new CPU();
    private RAM ram = new RAM();
    private HardDrive hd = new HardDrive();

    public void startComputer(){
        cpu.start();
        ram.load();
        hd.read();
    }
}


public class FacadeDesignPattern {
    public static void main(String[] args) {

        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();

    }
}
