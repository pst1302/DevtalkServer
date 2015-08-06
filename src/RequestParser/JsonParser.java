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
	 *  JSON 형식으로 전달된 요청들을 파싱해서 각 Request별로 지정된 로직 수행
	 */
	public void parseJsonRequest(String request) {
		
		try {
			
			JSONParser parser = new JSONParser();
			
			requestObj = (JSONObject)parser.parse(request);
			
			if(Integer.parseInt(requestObj.get("requestType").toString()) == Request.SEND_MESSAGE) {
				System.out.println("send 요청 받음");
				
				SendMessageRequest sendMessageReq = new SendMessageRequest(
						Integer.parseInt(requestObj.get("userId").toString())	// user ID
						,Integer.parseInt(requestObj.get("roomId").toString())	// room ID
						,requestObj.get("msg").toString());						// 메세지
				
				/*
				 *  해당방의 클라이언트들에게 전달하는 로직 구현
				 *  
				 *  DB에 저장하는 로직 구현 
				 */
			}
			else if(Integer.parseInt(requestObj.get("requestType").toString()) == Request.ADD_FRIEND 
					|| Integer.parseInt(requestObj.get("requestType").toString()) == Request.BLOCK_REQUEST ) {
				System.out.println("Relationship Request.");
				
				RelationshipRequest relationshipReq = new RelationshipRequest(
						Integer.parseInt(requestObj.get("from").toString())				// 친구/차단 요청을 보내는 user ID
						,Integer.parseInt(requestObj.get("to").toString())				// 대상 user Id
						,Integer.parseInt(requestObj.get("addOrBlock").toString())); 	// 친구 추가 or 차단 요청 구분
				
				
			}
			else {
				System.out.println("알 수 없는 메세지");
			}
		} catch(org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		
	}
}
