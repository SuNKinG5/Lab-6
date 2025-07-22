package sqa.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import sqa.main.TVPlan.TVPackage;
class LETDs {
	
		TVPackage standard = TVPackage.STANDARD;
		TVPackage premium = TVPackage.PREMIUM;
		TVPackage family = TVPackage.FAMILY;
		
	@ParameterizedTest
	void T1() {
		
		TVPlan tv = new TVPlan(true,true,true);
		
		assertEquals(300,tv.pricePerMonth(standard));
		
	}

}
