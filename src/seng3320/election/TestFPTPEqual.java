//Zac Welsh part
package seng3320.election;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.Test;

class TestFPTPEqual {


	@Test
	void testTrue() {
		
		//valid candidates
		List<String> candidateList;
		candidateList = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
	
		//create PreferentialElection object
		FirstPastThePostElection election;
		election = new FirstPastThePostElection(candidateList);
		FirstPastThePostElection election2;
		election2 = new FirstPastThePostElection(candidateList);	
		
		//create FirstPastThePostElection.vote
		FirstPastThePostElection.Vote vote1 = new FirstPastThePostElection.Vote("Joe");
		FirstPastThePostElection.Vote vote2 = new FirstPastThePostElection.Vote("Lucas");
		FirstPastThePostElection.Result result1 = election.count(vote1);
		FirstPastThePostElection.Result result2 = election2.count(vote2); 
		//test the vote
		assertEquals(true,result1.equals(result1));
	}
	
	@Test
	void testFalse() {
		
		//valid candidates
		List<String> candidateList;
		candidateList = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
	
		//create PreferentialElection object
		FirstPastThePostElection election;
		election = new FirstPastThePostElection(candidateList);
		FirstPastThePostElection election2;
		election2 = new FirstPastThePostElection(candidateList);	
		
		//create FirstPastThePostElection.vote
		FirstPastThePostElection.Vote vote1 = new FirstPastThePostElection.Vote("Joe");
		FirstPastThePostElection.Vote vote2 = new FirstPastThePostElection.Vote("Lucas");
		FirstPastThePostElection.Result result1 = election.count(vote1);
		FirstPastThePostElection.Result result2 = election2.count(vote2); 
		//test the vote
		assertEquals(false,result1.equals(result2));
	}

}
