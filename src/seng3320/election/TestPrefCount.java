//Zac Welsh part
package seng3320.election;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import seng3320.election.Election.ResultType;
import seng3320.election.FirstPastThePostElection.Vote;
import seng3320.election.PreferentialElection.Vote.Preference;

import java.util.*;

class TestPrefCount {

	@Test
	void testInvalid() {
		
		//valid candidates
		List<String> candidateList;
		candidateList = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		
		//create Preference objects
		Preference p1 = new Preference("Joe", 1);
		Preference p2 = new Preference("Jane", 1);
		Preference p3 = new Preference("Lucas", 1);
		Preference p4 = new Preference("Joe", 2);
		Preference p5 = new Preference("Jane", 2);
		Preference p6 = new Preference("Lucas", 2);
		Preference p7 = new Preference("Joe", 3);
		Preference p8 = new Preference("Jane", 3);
		Preference p9 = new Preference("Lucas", 3);
	
		
		//create FirstPastThePostElection.vote
		PreferentialElection.Vote vote1 = new PreferentialElection.Vote(p1,p5);
		PreferentialElection.Vote vote2 = new PreferentialElection.Vote();
		
		//test the vote
		assertEquals(ResultType.INVALID,election.count(vote1,vote2).resultType);
	}
	
	@Test
	void testTie() {
		
		//valid candidates
		List<String> candidateList;
		candidateList = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		
		//create Preference objects
		Preference p1 = new Preference("Joe", 1);
		Preference p2 = new Preference("Jane", 1);
		Preference p3 = new Preference("Lucas", 1);
		Preference p4 = new Preference("Joe", 2);
		Preference p5 = new Preference("Jane", 2);
		Preference p6 = new Preference("Lucas", 2);
		Preference p7 = new Preference("Joe", 3);
		Preference p8 = new Preference("Jane", 3);
		Preference p9 = new Preference("Lucas", 3);
	
		
		//create FirstPastThePostElection.vote
		PreferentialElection.Vote vote1 = new PreferentialElection.Vote(p1,p5,p9);
		PreferentialElection.Vote vote2 = new PreferentialElection.Vote(p2,p6,p7);
		PreferentialElection.Vote vote3 = new PreferentialElection.Vote(p3,p4,p8);
		
		//test the vote
		assertEquals(ResultType.TIE,election.count(vote1,vote2,vote3).resultType);
	}

	@Test
	void testClear() {
		
		//valid candidates
		List<String> candidateList;
		candidateList = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		
		//create Preference objects
		Preference p1 = new Preference("Joe", 1);
		Preference p2 = new Preference("Jane", 1);
		Preference p3 = new Preference("Lucas", 1);
		Preference p4 = new Preference("Joe", 2);
		Preference p5 = new Preference("Jane", 2);
		Preference p6 = new Preference("Lucas", 2);
		Preference p7 = new Preference("Joe", 3);
		Preference p8 = new Preference("Jane", 3);
		Preference p9 = new Preference("Lucas", 3);
	
		
		//create FirstPastThePostElection.vote
		PreferentialElection.Vote vote1 = new PreferentialElection.Vote(p1,p5,p9);
		PreferentialElection.Vote vote2 = new PreferentialElection.Vote(p2,p6,p7);
		PreferentialElection.Vote vote3 = new PreferentialElection.Vote(p3,p4,p8);
		
		//test the vote
		assertEquals(ResultType.CLEAR,election.count(vote1,vote2,vote3,vote1,vote1,vote1).resultType);
	}
}
