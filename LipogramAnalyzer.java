import java.util.ArrayList;
public class LipogramAnalyzer {
	String text = new String();
	public LipogramAnalyzer (String s){
		text = s;
	}
	public String mark (char letter){
		String ans = text;
		for (int i = 0; i <= text.length()-1; i++){
			if (ans.charAt(i) == letter){
				ans= ans.substring(0, i) + '#' + ans.substring(i+1);
			}
		}
		return ans;
	}
	public String allWordsWith (char letter){
		String rt = new String();
		ArrayList<String> words = new ArrayList<String>();
		String temp = new String();
		for (int i = 0; i <= text.length()-1; i++){
			if ((text.charAt(i) != ' ') && (i != text.length()-1)){
				temp += text.charAt(i);
			} else if (i == text.length()-1){
				temp += text.charAt(i);
				words.add(temp);
				temp = "";
			}
			else {
				words.add(temp);
				temp = "";
			}
		}
		String prevWord = new String();
		for (String s: words){
			if (s.indexOf(letter) != -1){
				if (! s.equals(prevWord)){
					prevWord = s;
					rt += s;
					rt += "\n";
				}
			}
		}
		return rt;
	}
}
