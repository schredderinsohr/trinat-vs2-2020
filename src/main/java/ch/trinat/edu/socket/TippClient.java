package Sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import java.io.InputStreamReader;

public class TippClient {
    public static void main(String[] args) {
    System.out.println("Client Start");
    new TippClient().los();

}

    public void los() {
        try(Socket s = new Socket("localhost", 4242)) {
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);
            String advice = reader.readLine();
            System.out.println("Advice" + advice);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

