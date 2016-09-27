import java.util.*;
public class AddressBook {

	
	private ArrayList<BuddyInfo> buddyInfo;
	
	public void addBuddy(BuddyInfo aBuddyInfo){
		
		if(aBuddyInfo != null){
			buddyInfo.add(aBuddyInfo);
		}
	}
	
	public void removeBuddy(int index){
		if(index >= 0 && index < buddyInfo.size()){
			buddyInfo.remove(index);
		}
	}
	
	public void test(){
		
	}
	
	public static void main(String[] args){
		System.out.println("Address Book");
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}
}

// Test