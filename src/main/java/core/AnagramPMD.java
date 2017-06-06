package core;


public class AnagramPMD {
	
	public boolean abc(Object o) {return this == o;}
	int x;
	public void foo2() {x = x;}
	
	public static boolean validate(String s, String t) {
        if (s.replaceAll("\\s", "").length() != t.replaceAll("\\s", "").length()) {

        return false;}
        

         int value = 0;
         for (int i = 0; i < s.replaceAll("\\s", "").length(); i++) {

                value += (s.replaceAll("\\s", "").toLowerCase().charAt(i));
                value -= (t.replaceAll("\\s", "").toLowerCase().charAt(i));

         }

         return value == 0;
  }

	
	public void foo()  {
		
		for (int i = 0; i < 10; i++) {
			
			for (int k = 0; k < 20; i++) {
				
				System.out.println("Hello");
			}
		}
	}
	
	void bar() {
		for (;true;);
	}
	
	public static void main(String[] args) {

	    System.out.println("Debit Card and Bad Credit is anagram? - " + AnagramPMD.validate("Debit Card", "Bad Credit"));
	    System.out.println("Охренеть and Не хрена себе is anagram? - " + AnagramPMD.validate("Охренеть", "Не хрена себе"));
	       }
	
	private String checkStrValue = null;
		public AnagramPMD() {
			this.checkStrValue = "SomeValue";		
		}
	
	private void executeSomeConditions() {
		if ("SomeValue".equals(this.checkStrValue)) {}
		else if ("SomeValue".equals(this.checkStrValue)) {}	
	}
	
	private static void incorrectAssignmentInIfCondition() {
		boolean value = false;
		if (value = true) {}
		else {}		
}  
}
