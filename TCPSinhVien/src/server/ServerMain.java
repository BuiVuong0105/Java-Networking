/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class ServerMain {


    public void open() {
        try {
            ServerSocket serverSocket = new ServerSocket(6969);
            while (true) {
                System.out.println("--------Dang cho CLient Ket Noi----------");
                Socket socket = serverSocket.accept();
                System.out.println("---------------Co Client Ket Noi !-----------");
                new ServerThread(socket).start();
            }
        } catch (Exception ex) {
            Logger.getLogger(ServerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        ServerMain serverMain = new ServerMain();
        serverMain.open();
    }
}
