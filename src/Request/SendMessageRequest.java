package Request;

public class SendMessageRequest extends Request{

	private int userId;
	private String msg;
	private int roomId;
	
	/*
	 *  �޼��� ������ ��û ���� ��ü
	 *  from : user id
	 *  to : room id
	 *  message : �޼��� ���� 
	 */
	public SendMessageRequest(int from,int to,String message) {
		
		requestType = Request.ADD_FRIEND;
		
		userId = from;
		msg = message;
		roomId = to;
	}

	/*
	 *  �޼����� DB�� �ִ� �κ�
	 */
	@Override
	public void dataBaseRequest() {
		// TODO Auto-generated method stub
		
	}
}
