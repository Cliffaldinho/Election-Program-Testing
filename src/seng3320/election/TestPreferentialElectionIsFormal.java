//Cliff Ng part
package seng3320.election;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import seng3320.election.FirstPastThePostElection.Vote;
import seng3320.election.PreferentialElection.Vote.Preference;

import java.util.*;

class TestPreferentialElectionIsFormal {

	//Test 1
	@Test
	void testOne() {
		
		//valid candidates
		List<String> listOne;
		listOne = new ArrayList<String>();
		listOne.add("Joe");
		listOne.add("Jane");
		listOne.add("Lucas");
	
		//create PreferentialElection object
		PreferentialElection elecOne;
		elecOne = new PreferentialElection(listOne);
		
		//create FirstPastThePostElection.vote
		FirstPastThePostElection.Vote voteTwo;
		voteTwo = new FirstPastThePostElection.Vote("Joe");
		
		//test the vote
		assertEquals(false,elecOne.isFormal(voteTwo));
	}

	//Test 2
	@Test
	void testTwo() {
		
		//3 valid candidates
		List<String> listOne;
		listOne = new ArrayList<String>();
		listOne.add("Joe");
		listOne.add("Jane");
		listOne.add("Lucas");
		
		//create PreferentialElection object
		PreferentialElection elecOne;
		elecOne = new PreferentialElection(listOne);
		
		//create 2 Preferences
		PreferentialElection.Vote.Preference preferentialOne,preferentialTwo;
		preferentialOne = new PreferentialElection.Vote.Preference("Joe", 1);
		preferentialTwo = new PreferentialElection.Vote.Preference("Jane",2);

		PreferentialElection.Vote.Preference[] prefArray;
		prefArray = new PreferentialElection.Vote.Preference[2];
		
		prefArray[0]=preferentialOne;
		prefArray[1]=preferentialTwo;

		//pass the Preferences into PreferentialElection.vote
		PreferentialElection.Vote voteOne;
		voteOne= new PreferentialElection.Vote(prefArray);
		
		//test the vote
		assertEquals(false,elecOne.isFormal(voteOne));
	}
	
	//Test 3
	@Test
	void testThree() {
		
		//3 valid candidates
		List<String> listOne;
		listOne = new ArrayList<String>();
		listOne.add("Joe");
		listOne.add("Jane");
		listOne.add("Lucas");
		
		//create PreferentialElection object
		PreferentialElection elecOne;
		elecOne = new PreferentialElection(listOne);
		
		//create 4 Preferences
		PreferentialElection.Vote.Preference preferentialOne,preferentialTwo,preferentialThree,preferentialFour;
		preferentialOne = new PreferentialElection.Vote.Preference("Joe", 1);
		preferentialTwo = new PreferentialElection.Vote.Preference("Jane",2);
		preferentialThree = new PreferentialElection.Vote.Preference("Lucas",3);
		preferentialFour= new PreferentialElection.Vote.Preference("Lucas",2);

		PreferentialElection.Vote.Preference[] prefArray;
		prefArray = new PreferentialElection.Vote.Preference[4];
		
		prefArray[0]=preferentialOne;
		prefArray[1]=preferentialTwo;
		prefArray[2]=preferentialThree;
		prefArray[3]=preferentialFour;

		//pass the preferences into the PreferentialElection.Vote
		PreferentialElection.Vote voteOne;
		voteOne= new PreferentialElection.Vote(prefArray);
		
		//test vote
		assertEquals(false,elecOne.isFormal(voteOne));
	}
	
	//Test 4
	@Test
	void testFour() {
		
		//valid candidates
		List<String> listOne;
		listOne = new ArrayList<String>();
		listOne.add("Joe");
		listOne.add("Jane");
		listOne.add("Lucas");
		
		//create PreferentialElection object
		PreferentialElection elecOne;
		elecOne = new PreferentialElection(listOne);
		
		//create Preferences
		PreferentialElection.Vote.Preference preferentialOne,preferentialTwo,preferentialThree;
		
		//pass priority into the Preferences
		preferentialOne = new PreferentialElection.Vote.Preference("Joe", 1);
		preferentialTwo = new PreferentialElection.Vote.Preference("Jane",2);
		preferentialThree = new PreferentialElection.Vote.Preference("Lucas",0);
		
		PreferentialElection.Vote.Preference[] prefArray;
		prefArray = new PreferentialElection.Vote.Preference[3];
		
		prefArray[0]=preferentialOne;
		prefArray[1]=preferentialTwo;
		prefArray[2]=preferentialThree;
		
		//pass Preferences into the PreferentialElection.vote
		PreferentialElection.Vote voteOne;
		voteOne= new PreferentialElection.Vote(prefArray);
		
		//test vote
		assertEquals(false,elecOne.isFormal(voteOne));
	}
	
	//Test 5
	@Test
	void testFive() {
		
		//valid candidates
		List<String> listOne;
		listOne = new ArrayList<String>();
		listOne.add("Joe");
		listOne.add("Jane");
		listOne.add("Lucas");
		
		//create PreferentialElection object
		PreferentialElection elecOne;
		elecOne = new PreferentialElection(listOne);
		
		//Create Preferences
		PreferentialElection.Vote.Preference preferentialOne,preferentialTwo,preferentialThree;
		
		//pass priority into the Preferences
		preferentialOne = new PreferentialElection.Vote.Preference("Joe", 1);
		preferentialTwo = new PreferentialElection.Vote.Preference("Jane",2);
		preferentialThree = new PreferentialElection.Vote.Preference("Lucas",4);
		
		PreferentialElection.Vote.Preference[] prefArray;
		prefArray = new PreferentialElection.Vote.Preference[3];
		
		prefArray[0]=preferentialOne;
		prefArray[1]=preferentialTwo;
		prefArray[2]=preferentialThree;
		
		//pass Preferences into the PreferentialElection.vote
		PreferentialElection.Vote voteOne;
		voteOne= new PreferentialElection.Vote(prefArray);
		
		//test vote
		assertEquals(false,elecOne.isFormal(voteOne));
	}
	
	//Test 6
	@Test
	void testSix() {
		
		//valid candidates
		List<String> listOne;
		listOne = new ArrayList<String>();
		listOne.add("Joe");
		listOne.add("Jane");
		listOne.add("Lucas");
		
		//create PreferentialElection object
		PreferentialElection elecOne;
		elecOne = new PreferentialElection(listOne);
		
		//create Preferences
		PreferentialElection.Vote.Preference preferentialOne,preferentialTwo,preferentialThree;
		
		//pass priority into the Preferences
		preferentialOne = new PreferentialElection.Vote.Preference("Joe", 1);
		preferentialTwo = new PreferentialElection.Vote.Preference("Jane",2);
		preferentialThree = new PreferentialElection.Vote.Preference("Lucas",2);
		
		PreferentialElection.Vote.Preference[] prefArray;
		prefArray = new PreferentialElection.Vote.Preference[3];
		
		prefArray[0]=preferentialOne;
		prefArray[1]=preferentialTwo;
		prefArray[2]=preferentialThree;
		
		//pass Preferences into the PreferentialElection.Vote
		PreferentialElection.Vote voteOne;
		voteOne= new PreferentialElection.Vote(prefArray);
		
		//test vote
		assertEquals(false,elecOne.isFormal(voteOne));
	}
	
	//Test 7
	@Test
	void testSeven() {
		
		//valid candidates
		List<String> listOne;
		listOne = new ArrayList<String>();
		listOne.add("Joe");
		listOne.add("Jane");
		listOne.add("Lucas");

		//Create PreferentialElection object
		PreferentialElection elecOne;
		elecOne = new PreferentialElection(listOne);

		//Create Preferences
		PreferentialElection.Vote.Preference preferentialOne,preferentialTwo,preferentialThree;
		
		//pass priority into the Preferences
		preferentialOne = new PreferentialElection.Vote.Preference("Joe", 1);
		preferentialTwo = new PreferentialElection.Vote.Preference("Jane",2);
		preferentialThree = new PreferentialElection.Vote.Preference("Lucas",3);
		
		PreferentialElection.Vote.Preference[] prefArray;
		prefArray = new PreferentialElection.Vote.Preference[3];

		prefArray[0]=preferentialOne;
		prefArray[1]=preferentialTwo;
		prefArray[2]=preferentialThree;

		//pass Preferences into the vote
		PreferentialElection.Vote voteOne;
		voteOne= new PreferentialElection.Vote(prefArray);

		//test vote
		assertEquals(true,elecOne.isFormal(voteOne)); 
		 
	}
	
	//Test 8
	@Test
	void testEight() {
		//valid candidates
				List<String> listOne;
				listOne = new ArrayList<String>();
				listOne.add("Joe");
				listOne.add("Jane");
				listOne.add("Lucas");
				
				//create PreferentialElection object
				PreferentialElection elecOne;
				elecOne = new PreferentialElection(listOne);
				
				//Create Preferences
				PreferentialElection.Vote.Preference preferentialOne,preferentialTwo,preferentialThree;
				
				//pass priority into the Preferences (while ensuring one preference is not on the valid candidate list)
				preferentialOne = new PreferentialElection.Vote.Preference("Henry", 1);
				preferentialTwo = new PreferentialElection.Vote.Preference("Jane",2);
				preferentialThree = new PreferentialElection.Vote.Preference("Lucas",4);
				
				PreferentialElection.Vote.Preference[] prefArray;
				prefArray = new PreferentialElection.Vote.Preference[3];
				
				prefArray[0]=preferentialOne;
				prefArray[1]=preferentialTwo;
				prefArray[2]=preferentialThree;
				
				//pass Preferences into the PreferentialElection.vote
				PreferentialElection.Vote voteOne;
				voteOne= new PreferentialElection.Vote(prefArray);
				
				//test vote
				assertEquals(false,elecOne.isFormal(voteOne));
	}
	
	//Test 9
	@Test
	void testNine() {
	//valid candidates
				List<String> listOne;
				listOne = new ArrayList<String>();
				listOne.add("Joe");
				listOne.add("Jane");
				listOne.add("Lucas");
				
				//create PreferentialElection object
				PreferentialElection elecOne;
				elecOne = new PreferentialElection(listOne);
				
				//create Preferences
				PreferentialElection.Vote.Preference preferentialOne,preferentialTwo,preferentialThree;
				
				//pass priority into the Preferences (while ensuring one preference has their name repeated twice)
				preferentialOne = new PreferentialElection.Vote.Preference("Joe", 1);
				preferentialTwo = new PreferentialElection.Vote.Preference("Joe",2);
				preferentialThree = new PreferentialElection.Vote.Preference("Lucas",2);
				
				PreferentialElection.Vote.Preference[] prefArray;
				prefArray = new PreferentialElection.Vote.Preference[3];
				
				prefArray[0]=preferentialOne;
				prefArray[1]=preferentialTwo;
				prefArray[2]=preferentialThree;
				
				//pass Preferences into the PreferentialElection.Vote
				PreferentialElection.Vote voteOne;
				voteOne= new PreferentialElection.Vote(prefArray);
				
				//test vote
				assertEquals(false,elecOne.isFormal(voteOne));
	}
}
