public class WC{
	public int countChars(String text){
		return text.length();
	}
	public static void main(String[] args) {
		String text = "My name is Sayalli\n I am form Pune\n I am working as intern in TW.";
		int charCount = 0,wordCount = 0,lineCount = 0;
		WC wc = new WC(	);
		System.out.println("Characters = " + wc.countChars(text));
		System.out.println("Words = " + text.split(" ").length);
		System.out.println("Lines = " + text.split("\n").length);
	}
}