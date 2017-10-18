package it.unical.test;

import java.time.Instant;
import it.unical.asde.AthleticGame;
import org.junit.*;

public class AthleticGameBasicTest {
	
	private static AthleticGame ag = new AthleticGame("100m");
	
	@Test
	public void addArrivalsWorks(){
		ag.addArrival("Luca", Instant.now());
		Assert.assertEquals(1, ag.getArrivals().size());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void participantTimeWord(){
		
		ag.getParecipiantTime("Carlo");
		
	}

}
