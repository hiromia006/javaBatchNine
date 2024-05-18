package class6;

public class EncapsulationMain {
    public static void main(String[] args) {
        EncapsulationRead read = new EncapsulationRead();
        System.out.println("Encapsulation Getter or Read " + read.getName());

        EncapsulationWrite write = new EncapsulationWrite();
        write.setName("Moonim");

        EncapsulationWriteAndRead writeAndRead = new EncapsulationWriteAndRead();
        writeAndRead.setName("Sagar");
        System.out.println("Encapsulation Read & write " + writeAndRead.getName());

    }
}
