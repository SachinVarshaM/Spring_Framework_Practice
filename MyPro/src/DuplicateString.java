
public class DuplicateString {

	public static void main(String[] args) {
		String str = "AAABCsdkjiwehuisdllmcxlsaklakBC";

		char[] str2 = new char[str.length()];
		str2 = str.toCharArray();
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					str2[j] = '\u0000';
				}

			}
		}
		for (char ch1 : str2) {
			if (ch1 != '\u0000') {
				System.out.print(ch1);
			}
		}

	}

}
