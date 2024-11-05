package week1.day2;

public class Browser {
	public void launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		Browser obj = new Browser();
		obj.launchBrowser(null);
		obj.loadUrl();
	}

}
