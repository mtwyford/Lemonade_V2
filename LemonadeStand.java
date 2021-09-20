		//Variables - done
		/*Methods?
		makeLemonade?
		sellLemonade?
		shrink? lose an item  - ice melts, lemons rot, 
		dailyBatch?
		*/
public class LemonadeStand {

		int numLemons;
		int cupsSugar;
		int cupsIce;
		int numCups;		//num paper cups
		int cupsMade=0;
		int numPitchers=0;
		int numCustomers;  //
		double pricePerCup;
		double weatherScore; //think about

		//CONSTRUCTOR
		public LemonadeStand() {
			numLemons = 9;
			cupsSugar = 9;
			cupsIce=9;
			
		}



		public void makeLemonade() {  //DEFAULT METHOD
			//recipe? 3 numLemons + 3 cupsSugar + 3 cupsIce
			//to make a pitcher, add 1 to the count of num pitcher
			if (numLemons>=3 && cupsSugar>=3 && cupsIce >=3) {
				numPitchers++;
				numLemons-=3;  //numLemons = numLemons - 3
				cupsSugar-=3;
				cupsIce-=3;
				System.out.println("\nMade a pitcher of lemonade\n");
				
			}
		}
		/* OVERLOADED METHOD - a 'custom method' passing in arguments ** */										
		public void makeLemonade(int nL, int cS, int cI) {
			//recipe? 3 numLemons + 3 cupsSugar + 3 cupsIce
			//to make a pitcher, add 1 to the count of num pitcher
			if (numLemons>=nL && cupsSugar>=cS && cupsIce >=cI) {
				numPitchers++;
				numLemons-=nL;  //numLemons = numLemons - 3
				cupsSugar-=cS;
				cupsIce-=cI;
			}
		}
		
		public void sellLemonade() {
			//  ? how many pitchers did I make?
			// how many cups in a pitcher
			//how many cups total available to pour??
			
			cupsMade++;
			//print out num cups && pitchers left??
		}
		
	
		
		
		
		
		
}
