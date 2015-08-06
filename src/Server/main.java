package Server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

import DBConnector.DBConnector;
import Request.RequestMaker;
import RequestParser.JsonParser;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RequestMaker rm = new RequestMaker();
		//JsonParser jp = new JsonParser();
		
		//jp.parseJsonRequest(rm.makeSendMsgRequest());
		
		DBConnector con = new DBConnector();
		
		con.test();
	}

}
