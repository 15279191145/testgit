package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Mac;

public class RegTest {
	public void test() {
		//is contain of substring
		/*String str="this uyis text";
		String patt=".*uyis.*";
		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(str);
		System.out.println(m.matches());
		*/
	
		//test maches's group
		/*String patt="w((or)(ld))!";
		String str="helo world!";
		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println("group(0):"+m.group(0));
			System.out.println("group(1):"+m.group(1));
			System.out.println("group(2):"+m.group(2));
			System.out.println("group(3):"+m.group(3));
			System.out.println("groupCount:"+m.groupCount());			
		}*/
		
		// how to find digital String 
		/*String patt="(\\D*)(\\d{2,})(.*)";
		String str="This order was placed for Q3000T! O1K?";
		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(str);
		System.out.println(m.matches());*/
		
		//matches one character of String
		String patt="pl(a|b|c)in";
		String str="";
		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(str);
		System.out.println(m.matches());
		
	}
	
	public static void main(String[] args) {
		RegTest regTest=new RegTest();
		//regTest.test();
		String ss="a"+"b";
		String s1="a";
		String s2="b";
		String s3=s1+s2;
		System.out.println(ss.hashCode());
		System.out.println(s3.hashCode());
		
		/*Object o=new String("hello");
		Object a=new String("hello");
		System.out.println(o.hashCode());
		System.out.println(a.hashCode());*/
	}

}
