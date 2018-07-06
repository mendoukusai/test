package niuke;

public class NKreplaceSpace {

	public static void main(String[] args) {//×Ö·û´®¿Õ¸ñÌæ»»
		StringBuffer ans=new StringBuffer(" 123 123");
		System.out.println(replaceSpace(ans).toString());
	}
	public static String replaceSpace(StringBuffer str) {
		StringBuffer ans=new StringBuffer();
		int start=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				ans.append(str.substring(start,i)).append("%20");
				start=i+1;
			}
		}
		return ans.append(str.substring(start)).toString();
    }
}
