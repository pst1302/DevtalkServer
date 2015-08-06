package RequestParser;

import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import Request.RelationshipRequest;
import Request.Request;
import Request.SendMessageRequest;

public class JsonParser {
	
	JSONObject requestObj;
	
	/*
	 *  JSON �������� ���޵� ��û���� �Ľ��ؼ� �� Request���� ������ ���� ����
	 */
	public void parseJsonRequest(String request) {
		
		try {
			
			JSONParser parser = new JSONParser();
			
			requestObj = (JSONObject)parser.parse(request);
			
			if(Integer.parseInt(requestObj.get("requestType").toString()) == Request.SEND_MESSAGE) {
				System.out.println("send ��û ����");
				
				SendMessageRequest sendMessageReq = new SendMessageRequest(
						Integer.parseInt(requestObj.get("userId").toString())	// user ID
						,Integer.parseInt(requestObj.get("roomId").toString())	// room ID
						,requestObj.get("msg").toString());						// �޼���
				
				/*
				 *  �ش���� Ŭ���̾�Ʈ�鿡�� �����ϴ� ���� ����
				 *  
				 *  DB�� �����ϴ� ���� ���� 
				 */
			}
			else if(Integer.parseInt(requestObj.get("requestType").toString()) == Request.ADD_FRIEND 
					|| Integer.parseInt(requestObj.get("requestType").toString()) == Request.BLOCK_REQUEST ) {
				System.out.println("Relationship Request.");
				
				RelationshipRequest relationshipReq = new RelationshipRequest(
						Integer.parseInt(requestObj.get("from").toString())				// ģ��/���� ��û�� ������ user ID
						,Integer.parseInt(requestObj.get("to").toString())				// ��� user Id
						,Integer.parseInt(requestObj.get("addOrBlock").toString())); 	// ģ�� �߰� or ���� ��û ����
				
				
			}
			else {
				System.out.println("�� �� ���� �޼���");
			}
		} catch(org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		
	}
}
