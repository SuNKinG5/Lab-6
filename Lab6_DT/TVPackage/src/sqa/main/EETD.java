package sqa.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.TVPlan.TVPackage;
class EETD {
		
	TVPlan tv;
	
	@ParameterizedTest
	@CsvSource({
		"1, 1, true, 300",
		"1, 1, false, 350",
		"1, 2, true, 200",
		"1, 2, false, 250",
		"1, 3, true, 200",
		"1, 3, false, 250",
		"1, 0, true, 100",
		"1, 0, false, 150",
		
		"2, 1, true, 500",
		"2, 1, false, 550",
		"2, 2, true, 400",
		"2, 2, false, 450",
		"2, 3, true, 400",
		"2, 3, false, 450",
		"2, 0, true, 300",
		"2, 0, false, 350",
		
		"3, 1, true, 600",
		"3, 1, false, 650",
		"3, 2, true, 500",
		"3, 2, false, 550",
		"3, 3, true, 500",
		"3, 3, false, 550",
		"3, 0, true, 400",
		"3, 0, false, 450",
		
		"0, 1, true, 0",
		"4, 1, true, 0",
		"5, 1, true, 0"
	})
	
	void T1(int choice, int subchoice, boolean discount,int price) {
		
		TVPackage pack = null;
		boolean download = false;
		boolean live = false;
		
		if(subchoice == 1) {
			download = true;
			live = true;
		}else if(subchoice == 2) {
			download = true;
		}else if(subchoice == 3) {
			live = true;
		}else if(subchoice == 0) {
			download = false;
			live = false;
		}
		
		tv = new TVPlan(download, live, discount);
		
		if(choice == 1) {
			pack = TVPackage.STANDARD;
		}else if(choice == 2){
			pack = TVPackage.PREMIUM;
		}else if(choice == 3){
			pack = TVPackage.FAMILY;
		}else if(choice == 0){
			pack = null;
		}
		
		assertEquals(price,tv.pricePerMonth(pack));
		
	}

}
