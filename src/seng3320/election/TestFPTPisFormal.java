//Cliff Ng part
package seng3320.election;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestFPTPisFormal {

	// Test 1
	@Test
	void testOne() {
		
		//valid candidates
		List<String> listOne;
		listOne = new ArrayList<String>();
		listOne.add("Bob");
		listOne.add("Alice");
		listOne.add("Jack");
		
		//FirstPastThePostElection object		
		Election elecOne;
		elecOne = new FirstPastThePostElection(listOne);
		
		//Create PreferentialElection.Vote
		PreferentialElection.Vote.Preference preferentialOne,preferentialTwo,preferentialThree;
		preferentialOne = new PreferentialElection.Vote.Preference("Bob", 1);
		preferentialTwo = new PreferentialElection.Vote.Preference("Alice",2);
		preferentialThree = new PreferentialElection.Vote.Preference("Jack",3);
				
		PreferentialElection.Vote.Preference[] prefArray;
		prefArray = new PreferentialElection.Vote.Preference[3];
				
		prefArray[0]=preferentialOne;
		prefArray[1]=preferentialTwo;
		prefArray[2]=preferentialThree;
				
		PreferentialElection.Vote voteTwo;
		voteTwo = new PreferentialElection.Vote(prefArray);
		
		//Put PreferentialElection.Vote into the test
		assertEquals(false,elecOne.isFormal(voteTwo));
	}
	
	// Test 2
	@Test
	void testTwo() {
		
		//valid candidates
		List<String> listOne;
		listOne = new ArrayList<String>();
		listOne.add("Bob");
		listOne.add("Alice");
		listOne.add("Jack");
		
		//create FirstPastThePostElectionObject
		Election elecOne;
		elecOne = new FirstPastThePostElection(listOne);
		
		//create FirstPastThePostElection.Vote
		FirstPastThePostElection.Vote voteOne;
		
		//pass in a name whom is not on the valid candidates list
		voteOne = new FirstPastThePostElection.Vote("Roman");
		
		//test the vote
		assertEquals(false,elecOne.isFormal(voteOne));
		
	}
	
	//Test 3
	@Test
	void testThree() {
		
		//valid candidates
		List<String> listOne;
		listOne = new ArrayList<String>();
		listOne.add("Bob");
		listOne.add("Alice");
		listOne.add("Jack");
		
		//create FirstPastThePostElection object
		Election elecOne;
		elecOne = new FirstPastThePostElection(listOne);
		
		//create FirstPastThePostElection.Vote 
		FirstPastThePostElection.Vote voteOne;
		
		//pass in a valid candidate
		voteOne = new FirstPastThePostElection.Vote("Bob");
		
		//test the vote
		assertEquals(true,elecOne.isFormal(voteOne));
	}

}
