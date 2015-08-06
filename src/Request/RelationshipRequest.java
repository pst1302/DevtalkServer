package Request;

public class RelationshipRequest extends Request{
	
	private int fromUserId;
	private int toUserId;
	
	/*
	 *  Constructor 
	 *  from : 보내는 userid
	 *  to : 받는 userid 
	 *  addOrBlock : request종류        Request.ADD_FRIEND / Request.BLOCK_REQUEST
	 */
	public RelationshipRequest(int from,int to,int addOrBlock) {
		
		requestType = addOrBlock;
		
		fromUserId = from;
		toUserId = to;
	}
	
	/*
	 *  DB에 친구추가 요청 or 차단요청 처리
	 */
	@Override
	public void dataBaseRequest() {
		
		// 요청별로 처리함수 호출
		if(requestType == Request.ADD_FRIEND) {
			addFriendDatabase(); 		// 친구추가 요청 데이타베이스에 처리
		}
		else if(requestType == Request.BLOCK_REQUEST) {
			blockRequestDatabase();
		}
	}
	
	/*
	 *  친구추가 요청 DB 처리 부분
	 */
	private void addFriendDatabase() {
		
	}
	
	/*
	 *  차단 요청 DB처리 부분
	 */
	private void blockRequestDatabase() {
		
	}
}
