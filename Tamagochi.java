public class Tamagochi {
	
	private int hungriness = 0;
	private int happiness = 5;
	private int tiredness = 0;
	private int cleanliness= 10;
	
	
	public void feed() {
		hungriness -= 5;
		if(hungriness < 0) {
			hungriness = 0;
		}
	}
    public void walk() {
    	happiness += 3;
    	tiredness += 2;
    	if(happiness > 10) {
    		happiness = 10;
    	}
}
		
    public void clean() {
	cleanliness = 10;
}
    public void pet() {
	happiness +=5;
		if(happiness > 10) {
			happiness = 10;
		}
}
    public String getMood() {
    	if(tiredness == 10) {
    		return "asleep";
    	}else if (tiredness >= 8) {
    		return "tired";
        }else if (hungriness >= 7) {
    	   return "hungry";
        }else if(cleanliness <3) {
    	   return "dirty";
        }else if(happiness >=8 ) {
    	   return "happy";
        }else if(happiness >= 4) {
    	   return "Ok";
        }else {
    	   return "sad";
        }
	}
  public void passTime() {
	  hungriness++;
	  cleanliness--;
	  if(tiredness == 10) {
		  tiredness = 0;
	} else {
		tiredness++;		
	}
	  if(hungriness >= 7) {
		  happiness--;
	}
	  if(cleanliness <3) {
		happiness--;
	}
	if(hungriness > 10) {
		hungriness = 10;
	}
	if(cleanliness < 0) {
		cleanliness = 0;
		
	}
	if(happiness <0) {
		happiness = 0;
	}
		
  }

}




