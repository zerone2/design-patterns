public class AgeCheck {
	
	private int age = 20;
	
	public int getAge() { return age; }
	
	public boolean isAgeValid(int ageToCheck){
		
		if(ageToCheck > getAge()) {
			System.out.println("enough age to play game!");
			return true;
		} else {
			System.out.println("too young to play game!");
			return false;
		}
	}
}
