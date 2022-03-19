package week1.day1;

public class Mobile {
	
	String mblModel = "OnePlus RT";
	float mblWeight = 180.5f;
	boolean isFullCharged = true;
	int mobileCost = 35000;
	
	
	
	public void makeCall() {
		System.out.println("Make Call");
	}
	
	public void sendMsg() {
		System.out.println("Send message");
	}

	public static void main(String[] args) {
		Mobile mbl = new Mobile();
		mbl.makeCall();
		mbl.sendMsg();
		System.out.println(mbl.mblModel);
		System.out.println(mbl.isFullCharged);
		System.out.println(mbl.mobileCost);
		System.out.println(mbl.mblWeight);
	}
	
}
