package server;

public class Main {
    public static void main(String[] args) {
        int x = 8;
        int fourthBitFromRight = (x & 0b1000) / 0b1000;
        System.out.println(fourthBitFromRight);
    }
}
