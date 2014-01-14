public class WC{

	public int countChars(String text){
		return text.length();
	}

	public int countWords(String text){
		return text.split(" ").length;
	}

	public int countLines(String text){
		return text.split("\n").length;
	}

	public static void main(String[] args) {
		String text = "My name is Sayalli\n I am form Pune\n I am working as intern in TW.";
		int charCount = 0,wordCount = 0,lineCount = 0;
		WC wc = new WC(	);
		System.out.println( wc.countLines(text)+"\t"+wc.countWords(text)+"\t"+wc.countChars(text) + "    abc.txt");
	}

}