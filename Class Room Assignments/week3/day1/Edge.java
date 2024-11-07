package week3.day1;

public class Edge extends Chrome{
	
	public void takeSnap() {
		System.out.println("Snap taken");
	}
	public void clearCookies() {
		System.out.println("Cookies cleared");
	}

	public static void main(String[] args) {
		Edge obj = new Edge();
		obj.takeSnap();
		obj.clearCookies();
		obj.openURL();
		obj.closeBrowser();
		obj.navigateBack();
		obj.openIncognito();
		obj.clearCache();
		

	}

}
