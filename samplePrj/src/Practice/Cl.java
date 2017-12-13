package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Cl {

	public static void main(String[] args) {

		Socket socket = null;
		InputStream in = null;
		BufferedReader br = null;
		OutputStream out = null;
		PrintWriter pw = null;
		try {
			socket = new Socket("70.12.109.67", 9000);
			System.out.println("접속 성공!");

			BufferedReader incoming = new BufferedReader(new InputStreamReader(System.in));

			in = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(in));
			out = socket.getOutputStream();
			pw = new PrintWriter(new OutputStreamWriter(out));

			//ClientThread(socket, br).start();

			String msg = "";
			while ((msg = incoming.readLine()) != null) {
				if (msg.equals("quit"))
					break;

				pw.println(msg);
				pw.flush();
				String echoMessage = br.readLine();
				System.out.println("서버로부터 : " + echoMessage);
			}

		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			try {
				br.close();
				pw.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	class ClientThread extends Thread {
		Socket socket;
		BufferedReader br;

		public ClientThread() {
		}

		public ClientThread(Socket socket, BufferedReader br) {
			super();
			this.socket = socket;
			this.br = br;
		}

		public void run() {
			try {
				String msg = "";
				while ((msg = br.readLine()) != null) {
					System.out.println(msg);
				}
			} catch (IOException e) {
				e.getMessage();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}