package Request;

public abstract class Request {
	protected int requestType;
	
	public static int ADD_FRIEND = 1;
	public static int BLOCK_REQUEST = 2;
	public static int SEND_MESSAGE = 3;
	
	public abstract void dataBaseRequest();
}
