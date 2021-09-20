//Starter Code from Class

/* Where to begin?
*  Imagine we are building the Blueprints for Making the Costco Lemonade Stand in a Box
*  We need to know what to include in the box, and what to include in the instruction manual
*
* Suppose we call the person who runs the stand the 'seller' and each person that buys lemnade a 'customer'
*  It makes sense that the seller will need to buy certain things, but I can put a sticker on the table for where they go when making the Lemonade, 
*  a suggested recipe book, and options for you to customize, etc - including any advice - like start small
*  - you should't buy a case of lemons the first time you try selling lemonade, of course.
*
* So - what supplies come in the box?  a table, a pitcher, a sign, a jar for money, etc.
*
* What things will you need to buy? (What things might change, depending on how the person will choose to play the game?
* - Lemons
* - Sugar 
* - Ice 
* - Cups (Disposable)
*
* What things will need to be done by the seller in order to make money?
* 	buyInventory?
* 	setRecipe (otional for advanced games)
* 	makeLemonade?
* 	setPrice for Lemonady?
* 	sellLemonade?
* 	account for shrink? lose an item  - ice melts, lemons rot, 
* 	Log dailyBatch?
*
* *** NOTICE THE LACK OF PSVMSA *** 
*/

/* public class is the start of any java file... it defines the blueprint */
public class LemonadeStand {

		int numLemons;  //things to Buy
		int cupsSugar;
		int cupIce;
		int numCups; 
		int numPitchers; //not purchasing pitchers - but how many cups are you able to make based on inventory?
		
		double pricePerCup;
		double weatherScore; //think about
		int numCustomers;  //determined by weather, your rating, etc

		/*CONSTRUCTOR -  The IKEA instruction manual - what you'll need to setup or start the game.
		*		what you should set things up for your first monopoloy game etc */
	
		public LemonadeStand() {
			numLemons = 9;
			cupsSugar = 9;
			cupsIce=9;
		}

		/* OVERLOADED CONSTRUCTOR - If I want a CUSTOM Game, i will use specifics about how much inventory to start with etc.
		 ***** Will leave this commented out for now.
		public LemonadeStand(int lemons, int sugar, int ice) {
			numLemons = 9;
			cupsSugar = 9;
			cupsIce=9;
		}
		*/
		
		/* Method makeLemonade is the __DEFAULT METHOD__ - this is for an *easy* game where we don't need to set a specific formula for 
		* 	making each pitcher of lemonade.
		*/
		public void makeLemonade() {  
			//recipe? 3 numLemons + 3 cupsSugar + 3 cupsIce
			//to make a pitcher, add 1 to the count of num pitcher
			if (numLemons>=3 && cupsSugar>=3 && cupsIce >=3) {
				numPitchers++;
				numLemons-=3;  //numLemons = numLemons - 3
				cupsSugar-=3;
				cupsIce-=3;
				//did we define how many cups in a pitcher of lemonade?
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
			
			cupsMade--;
			//print out num cups && pitchers left??
		}
		
	
		
		
		
		
		
}
