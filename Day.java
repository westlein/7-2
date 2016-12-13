
public class Day {
	private String [] day = {"Monday", "Tuesday" , "Wednesday", "Thursday", "Friday" , "Saturday" , "Sunday"};
	private int index;
	private boolean error = false;
	
	/** 
	 * This method sets the initial index of day to 0
	 * @param index of days (0-6)
	 * @return - or Monday
	 */
	public Day() {
		index = 0; //0 is monday
	}
	/**
	 * This method lets the user set the value of the day through the index of days (0-6) when they create a new day object
	 * @param day
	 * @param index
	 * @param i
	 */
	
	public Day(String day){
		int i = indexOfDay(day);
		if(i!=7) {
			this.index = i;
		}else{
			error = true;
		}
		}
	/**
	 * This method sets the index of 0-6 to the array of days (Monday-Sunday)
	 *@param i
	 *@param day
	 *@return the index of the day (0-6)
	 */
	private int indexOfDay(String day){
		int i=0;
		while(i<this.day.length){
			if(this.day[i].equals(day)){
				return i;
			}
			i++;
		}
		return i;
			}
		/**
		 * This method will get the day that the user has set in their day object
		 * @param day
		 * @return the day that the user has set in their day object
		 */
	public String getDay(){
		return day[this.index];
	}
		/**
		 * This method sets day through index (0-6)
		 * @param i
		 * @param day
		 */
		public void setDay(String day) {
			int i = indexOfDay(day);
			if(i!=7){
				this.index = i;
			}else{
				error = true;
			}
		}
		/**
		 *  This method will calculate and return the next day
		 * @return the next day
		 */
		public String nextDay(){
			return day[(this.index+1)%7];
		}
		
		
		/**
		 * This method will calculate and return the previous day
		 * @param i 
		 * @return the previous day
		 */
	
			public String previousDay(){
				int i = (this.index==0)?(this.day.length-1):(this.index-1);
				return day[i];
			}
			
			/**
			 * This method will calculate and return the day after a certain number of days has been added to the curren day
			 * @param i 
			 * @param days
			 * @return the day after a certain number of days has been added to the current day
			 */
			public String calculateDay(int days){
				int i;
				if (days>=0){
					i = (this.index+1)%7; // when days>=0
				}else{
					i= (this.index==0)?(7-Math.abs(days)%7):(this.index+(7-Math.abs(days%7)));
				}
					return day[i];
				}
				/**
				 * This method will print the phrase "Current day is:" and the current day based on the index of the day (0-6)
				 * @return the aboce phrase and the current set day
				 */
				public String toString(){
					return "Current day is:" +day[this.index];
				}
				
			}
		
	
	
	