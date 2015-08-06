package Request;

public class SendMessageRequest extends Request{

	private int userId;
	private String msg;
	private int roomId;
	
	/*
	 *  메세지 보내기 요청 관련 객체
	 *  from : user id
	 *  to : room id
	 *  message : 메세지 본문 
	 */
	public SendMessageRequest(int from,int to,String message) {
		
		requestType = Request.ADD_FRIEND;
		
		userId = from;
		msg = message;
		roomId = to;
	}

	/*
	 *  메세지를 DB에 넣는 부분
	 */
	@Override
	public void dataBaseRequest() {
		// TODO Auto-generated method stub
		
	}
}
