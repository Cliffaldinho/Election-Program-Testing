//Robert Toy part
package seng3320.election;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * A class containing all the tests for FirstPastThePostElection.count
 */
class CountTests {

    /**
     * A test for invalid election
     */
    @Test
    void testForInvalid(){
        //candidates
        List<String> candidates;
        candidates = new ArrayList<String>();
        candidates.add("Bob");
        candidates.add("Alice");
        candidates.add("Jack");

        //Election
        FirstPastThePostElection fElection = new FirstPastThePostElection(candidates);

        //add votes
        List<FirstPastThePostElection.Vote> fVotes = new ArrayList<>();
        fVotes.add(new FirstPastThePostElection.Vote("Josh"));
        fVotes.add(new FirstPastThePostElection.Vote("Chris"));
        fVotes.add(new FirstPastThePostElection.Vote("Sam"));

        //result
        FirstPastThePostElection.Result fResult = fElection.count(fVotes.toArray(new FirstPastThePostElection.Vote[]{}));

        //Tests if the election result type is invalid
        assertEquals(Election.ResultType.INVALID,fResult.resultType);
    }

    /**
     * A test for a tied election
     */
    @Test
    void testForTie(){
        //candidates
        List<String> candidates;
        candidates = new ArrayList<String>();
        candidates.add("Bob");
        candidates.add("Alice");
        candidates.add("Jack");

        //Election
        FirstPastThePostElection fElection = new FirstPastThePostElection(candidates);

        //add votes
        List<FirstPastThePostElection.Vote> fVotes = new ArrayList<>();
        fVotes.add(new FirstPastThePostElection.Vote("Bob"));
        fVotes.add(new FirstPastThePostElection.Vote("Alice"));
        fVotes.add(new FirstPastThePostElection.Vote("Jack"));

        //result
        FirstPastThePostElection.Result fResult = fElection.count(fVotes.toArray(new FirstPastThePostElection.Vote[]{}));

        //Tests if the election result type is TIE
        assertEquals(Election.ResultType.TIE,fResult.resultType);
    }

    /**
     * A test for a clear election
     */
    @Test
    void testForClear(){
        //candidates
        List<String> candidates;
        candidates = new ArrayList<String>();
        candidates.add("Bob");
        candidates.add("Alice");
        candidates.add("Jack");

        //Election
        FirstPastThePostElection fElection = new FirstPastThePostElection(candidates);

        //add votes
        List<FirstPastThePostElection.Vote> fVotes = new ArrayList<>();
        fVotes.add(new FirstPastThePostElection.Vote("Alice"));
        fVotes.add(new FirstPastThePostElection.Vote("Jack"));
        fVotes.add(new FirstPastThePostElection.Vote("Alice"));

        //result
        FirstPastThePostElection.Result fResult = fElection.count(fVotes.toArray(new FirstPastThePostElection.Vote[]{}));

        //Tests if the election result type is CLEAR
        assertEquals(Election.ResultType.CLEAR,fResult.resultType);
    }
}
