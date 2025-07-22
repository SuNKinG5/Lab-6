package sqa.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import sqa.main.TVPlan.TVPackage;

class LETDs {
	
	TVPlan tv = new TVPlan(true,true,true);
	TVPackage standard = TVPackage.STANDARD;
	
	@Test
	void T1() {
	
		assertEquals(300,tv.pricePerMonth(standard));
		
	}

}
