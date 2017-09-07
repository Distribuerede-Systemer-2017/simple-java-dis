import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static int PORT = 31337;

    public static void main(String args[]) {

        try {

            ServerSocket serverSocket = new ServerSocket(PORT);

            while (true) {

                System.out.println("Waiting for client ...");

                Socket connectionSocket = serverSocket.accept();

                BufferedReader inFromClient =
                        new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

                DataOutputStream outToClient =
                        new DataOutputStream(connectionSocket.getOutputStream());

                String clientSentence = inFromClient.readLine();
                System.out.println("Received: " + clientSentence);

                //Capitalize string received from server and return to client as response
                //String serverResponse = ....

                outToClient.writeBytes(serverResponse);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
