package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
public class ContestClient {

    public void go() {

        try (Socket socket = new Socket("united-portal.com", 9998);
             BufferedReader reader = new BufferedReader(
                     new InputStreamReader(socket.getInputStream()));) {

            String question = reader.readLine();
            System.out.println("The Question is: " + question);


        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Socket socket2 = new Socket("united-portal.com", 9999);
             PrintWriter writer = new PrintWriter(socket2.getOutputStream()) ) {
            writer.print("Here is your answer");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ContestClient().go();
    }

}