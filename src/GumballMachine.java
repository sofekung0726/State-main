
public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	int state = SOLD_OUT;
	int count = 0;
	public GumballMachine(int count) {
		this.count = count;
		if(count>0) {
			state = NO_QUARTER;
		}
	}
	public String toString() {
		String detail = "Number of Gumballs : " + this.count + " ";
		if (state == 0) {
			detail = detail+"State is SOLD_OUT";
		}else if (state == 1){
			detail = detail+"State is NO_QUARTER";
		}else if (state == 2){
			detail = detail+"State is HAS_QUARTER";
		}else if (state == 3){
			detail = detail+"State is SOLD";
		}else {
			detail = detail+"State is SOLD";
		}
		return detail;
	}
	 public void insertQuarter(){
		  if(state == HAS_QUARTER){
			  System.out.println("You can't insert another quarter");
		  }else if(state == NO_QUARTER){
			  state = HAS_QUARTER;
			  System.out.println("You inserted a quarter");
		  }else if(state == SOLD_OUT){
			  System.out.println("You can't insert a quarter, the machine is sold out");
		  }else if(state == SOLD){
			  System.out.println("Please wait, we're already giving you a gumball");
		  }
	  }
	  
	  public void ejectQuarter(){
		  if(state == HAS_QUARTER){
			  System.out.println("Quarter returned");
			  state = NO_QUARTER;
		  }else if(state == NO_QUARTER){
			  System.out.println("You haven't inserted a quarter");
		  }else if(state==SOLD){
			  System.out.println("Sorry, you already turned the crank");
		  }else if(state==SOLD_OUT){
			  System.out.println("You can't eject, you haven't inserted a quarter yet");
		  }
	  }
	  
	  public void turnCrank(){
		  if(state==SOLD){
			  System.out.println("Turning twice doesn't get you another gumball!");
		  }else if(state==NO_QUARTER){
			  System.out.println("You turned but there's no quarter");
		  }else if(state==SOLD_OUT){
			  System.out.println("Your turned, but there are no gumballs");
		  }else if(state==HAS_QUARTER){
			  System.out.println("You turned...");
			  state = SOLD;
			  dispense();
		  }
	  }
	  
	  public void dispense(){
		  if(state==SOLD){
			  System.out.println("A gumball comes rolling out the slot");
			  count = count-1;
			  if(count==0){
				 System.out.println("Oops, out of gumball!");
				 state = SOLD_OUT;
			  }else{
				  state = NO_QUARTER;
			  }
		  }else if(state==NO_QUARTER){
			  System.out.println("You need to pay first");
		  }else if(state==SOLD_OUT){
			  System.out.println("No gumball dispensed");
		  }else if(state==HAS_QUARTER){
			  System.out.println("No gumball dispensed");
		  }
	  }
	  
	    
}
