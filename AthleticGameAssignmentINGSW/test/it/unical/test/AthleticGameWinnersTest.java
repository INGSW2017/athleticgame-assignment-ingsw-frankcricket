package it.unical.test;

import java.time.Instant;

import org.junit.*;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {
	
	private static AthleticGame ag;
	
	@BeforeClass
	public static void init(){
		ag = new AthleticGame("200m");
	}
	@After
	public void resetAfter(){
		ag.reset();
	}
	@Before
	public void startBefore(){
		ag.start();
	}
	
	@Test
	public void winnerWork1(){
		ag.addArrival("Matteo", Instant.now().plusMillis(1000));
		ag.addArrival("Claudia", Instant.now().plusMillis(3000));
		
		Assert.assertEquals("Matteo", ag.getWinner());
	}
	
	@Test
	public void winnereWork2(){
		
		ag.addArrival("Claudia", Instant.now().plusMillis(3000));
		
		Assert.assertEquals("Claudia", ag.getWinner());
	}

}










