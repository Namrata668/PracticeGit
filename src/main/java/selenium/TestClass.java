package selenium;
//test cpmment

public class TestClass {
	public static void main(String[] args) {
		String a = "Namrata";
		System.out.println(a.charAt(2));
		System.out.println(a.concat("Singh"));
		System.out.println(a.contains("g"));
		System.out.println(a.formatted());
		System.out.println(String.format("The value of %s ", a));
		System.out.println(a.replace("N", "s"));
		String[] arr = a.split("a",5);
		for(String ar : arr) {
			//System.out.println(ar);
		}
	}
	
}
