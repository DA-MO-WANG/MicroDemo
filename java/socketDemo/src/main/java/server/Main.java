package server;

public class Main {
    public static void main(String[] args) {
        int x = -8;
        int fourthBitFromRight = (x & (1 << 3)) >>3 ;
        System.out.println(fourthBitFromRight);

    }
}
