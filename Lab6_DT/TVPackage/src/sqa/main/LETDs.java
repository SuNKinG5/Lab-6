package sqa.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.TVPlan.TVPackage;
class LETDs {
		
	TVPlan tv;
	
	@ParameterizedTest
	@CsvSource({
		"true, false, false, true, true, true, 300",
		"true, false, false, true, true, false, 350",
		"true, false, false, true, false, true, 200",
		"true, false, false, true, false, false, 250",
		"true, false, false, false, true, true, 200",
		"true, false, false, false, true, false, 250",
		"true, false, false, false, false, true, 100",
		"true, false, false, false, false, false, 150",
		
		"false, true, false, true, true, true, 500",
		"false, true, false, true, true, false, 550",
		"false, true, false, true, false, true, 400",
		"false, true, false, true, false, false, 450",
		"false, true, false, false, true, true, 400",
		"false, true, false, false, true, false, 450",
		"false, true, false, false, false, true, 300",
		"false, true, false, false, false, false, 350",
		
		"false, false, true, true, true, true, 600",
		"false, false, true, true, true, false, 650",
		"false, false, true, true, false, true, 500",
		"false, false, true, true, false, false, 550",
		"false, false, true, false, true, true, 500",
		"false, false, true, false, true, false, 550",
		"false, false, true, false, false, true, 400",
		"false, false, true, false, false, false, 450",
		
		"true, true, true, true, true, true, 0",
		"true, true, false, true, true, true, 0",
		"true, false, true, true, true, true, 0",
		"false, true, true, true, true, true, 0",
		"false, false, false, true, true, true, 0"
	})

	void T1(boolean standard, boolean  premium, boolean family, boolean download, boolean live, boolean discount,int price) {
		
		TVPackage pack = null;
		tv = new TVPlan(download, live, discount);
		
		if(standard == true) {
			pack = TVPackage.STANDARD;
		}else if(premium == true){
			pack = TVPackage.PREMIUM;
		}else if(family == true){
			pack = TVPackage.FAMILY;
		}
		
		assertEquals(price,tv.pricePerMonth(pack));
		
	}

}
