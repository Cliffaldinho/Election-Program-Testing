//Zac Welsh part
package seng3320.election;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import seng3320.election.Election.ResultType;
import seng3320.election.FirstPastThePostElection.Vote;
import seng3320.election.PreferentialElection.Vote.Preference;

import java.util.*;

class TestPrefEqual {

	@Test
	void testTrue() {
		
		//valid candidates
		List<String> candidateList;
		candidateList = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		PreferentialElection election2;
		election2 = new PreferentialElection(candidateList);
		
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
		PreferentialElection.Result res1 = election.count(vote1,vote1,vote1);
		PreferentialElection.Result res2 = election2.count(vote1,vote2,vote3);
		//test the vote
		assertEquals(true,res1.equals(res1));
	}
	
	@Test
	void testFalse1() {
		
		//valid candidates
		List<String> candidateList;
		candidateList = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		PreferentialElection election2;
		election2 = new PreferentialElection(candidateList);
		
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
		PreferentialElection.Result res1 = election.count(vote1,vote1,vote1);
		PreferentialElection.Result res2 = election2.count(vote1,vote2,vote3);
		//test the vote
		assertEquals(false,res1.equals(res2));
	}

	@Test
	void testFalse2() {
		
		//valid candidates
		List<String> candidateList;
		candidateList = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		PreferentialElection election2;
		election2 = new PreferentialElection(candidateList);
		
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
		PreferentialElection.Result res1 = election.count(vote1,vote1,vote1);
		PreferentialElection.Result res2 = election2.count(vote1,vote2,vote3);
		//test the vote
		assertEquals(false,res1.equals(election));
	}
	
	@Test
	void testFalse3() {
		
		//valid candidates
		List<String> candidateList;
		candidateList = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		PreferentialElection election2;
		election2 = new PreferentialElection(candidateList);
		
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
		PreferentialElection.Result res1 = election.count(vote1,vote1,vote1,vote1);
		PreferentialElection.Result res2 = election2.count(vote1,vote1,vote3);
		//test the vote
		assertEquals(false,res1.equals(res2));
	}
	
	@Test
	void testFalse4() {
		
		//valid candidates
		List<String> candidateList;
		candidateList = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		PreferentialElection election2;
		election2 = new PreferentialElection(candidateList);
		
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
		PreferentialElection.Vote vote4 = new PreferentialElection.Vote(p1);
		PreferentialElection.Result res1 = election.count(vote1,vote1,vote1);
		PreferentialElection.Result res2 = election2.count(vote1,vote1,vote1,vote4);
		//test the vote
		assertEquals(false,res1.equals(res2));
	}
	
	@Test
	void testFalse5() {
		
		//valid candidates
		List<String> candidateList, candidateList2;
		candidateList = new ArrayList<String>();
		candidateList2 = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
		candidateList2.add("Jane");
		candidateList2.add("Lucas");
		candidateList2.add("Joe");

	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		PreferentialElection election2;
		election2 = new PreferentialElection(candidateList2);
		
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
		PreferentialElection.Result res1 = election.count(vote1,vote1,vote1,vote1);
		PreferentialElection.Result res2 = election2.count(vote2,vote2,vote2,vote2);
		//test the vote
		assertEquals(false,res1.equals(res2));
	}
	
	@Test
	void testFalse6() {
		
		//valid candidates
		List<String> candidateList, candidateList2;
		candidateList = new ArrayList<String>();
		candidateList2 = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
		candidateList2.add("Joe");
		candidateList2.add("Jane");
		candidateList2.add("Lucas");
		candidateList2.add("Bob");
	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		PreferentialElection election2;
		election2 = new PreferentialElection(candidateList2);
		
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
		Preference p10 = new Preference("Bob", 4);
	
		
		//create FirstPastThePostElection.vote
		PreferentialElection.Vote vote1 = new PreferentialElection.Vote(p1,p5,p9);
		PreferentialElection.Vote vote2 = new PreferentialElection.Vote(p2,p6,p7);
		PreferentialElection.Vote vote3 = new PreferentialElection.Vote(p3,p4,p8);
		PreferentialElection.Vote vote4 = new PreferentialElection.Vote(p3,p4,p8,p10);
		PreferentialElection.Result res1 = election.count(vote1,vote1,vote1,vote1);
		PreferentialElection.Result res2 = election2.count(vote4,vote4,vote4,vote4);
		//test the vote
		assertEquals(false,res1.equals(res2));
	}
	
	@Test
	void testFalse7() {
		
		//valid candidates
		List<String> candidateList,candidateList2;
		candidateList = new ArrayList<String>();
		candidateList2 = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
		candidateList2.add("Joe");
		candidateList2.add("Jane");
		candidateList2.add("Toby");
	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		PreferentialElection election2;
		election2 = new PreferentialElection(candidateList2);
		
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
		Preference p10 = new Preference("Toby", 1);
		Preference p11 = new Preference("Toby", 2);
		Preference p12 = new Preference("Toby", 3);
		
		
		//create FirstPastThePostElection.vote
		PreferentialElection.Vote vote1 = new PreferentialElection.Vote(p1,p5,p9);
		PreferentialElection.Vote vote2 = new PreferentialElection.Vote(p2,p6,p7);
		PreferentialElection.Vote vote3 = new PreferentialElection.Vote(p3,p4,p8);
		PreferentialElection.Vote vote4 = new PreferentialElection.Vote(p1,p5,p12);
		PreferentialElection.Vote vote5 = new PreferentialElection.Vote(p2,p11,p7);
		PreferentialElection.Vote vote6 = new PreferentialElection.Vote(p10,p4,p8);
		PreferentialElection.Result res1 = election.count(vote1,vote1,vote1,vote1);
		PreferentialElection.Result res2 = election2.count(vote6,vote6,vote6,vote6);
		//test the vote
		assertEquals(false,res1.equals(res2));
	}
	
	@Test
	void testFalse8() {
		
		//valid candidates
		List<String> candidateList;
		candidateList = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		PreferentialElection election2;
		election2 = new PreferentialElection(candidateList);
		
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
		PreferentialElection.Result res1 = election.count(vote1,vote1,vote1);
		PreferentialElection.Result res2 = election2.count(vote1,vote1,vote3);
		//test the vote
		assertEquals(false,res1.equals(res2));
	}
	
	@Test
	void testFalse9() {
		

		//valid candidates
		List<String> candidateList;
		candidateList = new ArrayList<String>();
		candidateList.add("Joe");
		candidateList.add("Jane");
		candidateList.add("Lucas");
	
		//create PreferentialElection object
		PreferentialElection election;
		election = new PreferentialElection(candidateList);
		PreferentialElection election2;
		election2 = new PreferentialElection(candidateList);

		Map<String,Integer> m1,m2;
		m1 = new HashMap<>();
		m2= new HashMap<>();
		
		
		m1.put("Joe", 3);
		m2.put("Lucas",3);

		PreferentialElection.Result res3,res4;
		res3=election.new Result("Joe",3,3,m1,m2);
		res4=election2.new Result("Lucas",3,3,m1,m2);

		assertEquals(false,res3.equals(res4));
	}
}
