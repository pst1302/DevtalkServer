package Request;

public class RelationshipRequest extends Request{
	
	private int fromUserId;
	private int toUserId;
	
	/*
	 *  Constructor 
	 *  from : ������ userid
	 *  to : �޴� userid 
	 *  addOrBlock : request����        Request.ADD_FRIEND / Request.BLOCK_REQUEST
	 */
	public RelationshipRequest(int from,int to,int addOrBlock) {
		
		requestType = addOrBlock;
		
		fromUserId = from;
		toUserId = to;
	}
	
	/*
	 *  DB�� ģ���߰� ��û or ���ܿ�û ó��
	 */
	@Override
	public void dataBaseRequest() {
		
		// ��û���� ó���Լ� ȣ��
		if(requestType == Request.ADD_FRIEND) {
			addFriendDatabase(); 		// ģ���߰� ��û ����Ÿ���̽��� ó��
		}
		else if(requestType == Request.BLOCK_REQUEST) {
			blockRequestDatabase();
		}
	}
	
	/*
	 *  ģ���߰� ��û DB ó�� �κ�
	 */
	private void addFriendDatabase() {
		
	}
	
	/*
	 *  ���� ��û DBó�� �κ�
	 */
	private void blockRequestDatabase() {
		
	}
}
