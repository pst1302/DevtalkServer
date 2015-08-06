package Request;

import org.json.simple.JSONObject;

public class RequestMaker 
{
	public String makeSendMsgRequest() {
		SendMessageRequest smr = new SendMessageRequest(1,1,"hi");
		
		JSONObject jsonSmr = new JSONObject();
		
		jsonSmr.put("requestType",Request.ADD_FRIEND);
		jsonSmr.put("userId", 1);
		jsonSmr.put("roomId", 1);
		jsonSmr.put("msg", "hi");
		
		return jsonSmr.toJSONString();
	}
}
