package assignment;

class Automobile {

	  int no_wheels;
	  int no_mirror;
	  int gear;
	  
	  public Automobile(int no_wheels, int no_mirror,int gear) {
	        this.no_wheels = no_wheels;
	        this.no_mirror = no_mirror;
	        this.gear=gear;
	    }
	    public int getno_wheels() {
	        return no_wheels;
	    }
	    public int getno_mirror() {
	    	return no_mirror;
	    }
	    public int getgear() {
	    	return gear;
	    }
	   
	    public void attributes() {
	    	System.out.println("******Automobile Method******");
	    	System.out.println("Number of Wheels: "+no_wheels);
	    	System.out.println("Number of Mirrors: "+no_mirror);
	    	System.out.println("Gear: "+gear);
	    }
	    
	  public void run() {
	    System.out.println("Automobile Run Method");
	  }
	  public void breaks() {
	    System.out.println("Automobile Break Method");
	    }
	  public void change_direction() {
	    System.out.println("Automobile Change Direction Method");
	  }
	  
	}

	class Toto extends Automobile{
		 public Toto(int no_wheels, int no_mirror, int gear) {
			super(no_wheels, no_mirror, gear);
		}  
      
		 public void attributes() {
		    	System.out.println("******Toto Method******");
		    	System.out.println("Number of Wheels: "+no_wheels);
		    	System.out.println("Number of Mirrors: "+no_mirror);
		    	System.out.println("Gear: "+gear);
		    }
		 
	  public void run() {
	    System.out.println("Toto Run Method");
	  }
	  public void breaks() {
	    System.out.println("Toto Break Method");
	  }
	  public void change_direction() {
	    System.out.println("Toto Change Direction Method");
	  }
	}

	class TwoWheeler {
		 int no_wheels=2;
		  int no_mirror=2;
		  int gear=5;
	  
		  public void attributes() {
		    	System.out.println("******TwoWheeler Method******");
		    	System.out.println("Number of Wheels: "+no_wheels);
		    	System.out.println("Number of Mirrors: "+no_mirror);
		    	System.out.println("Gear: "+gear);
		    }
		  
	  public void run() {
	    System.out.println("Two Wheeler Run Method");
	  }
	  public void breaks() {
	    System.out.println("Two Wheeler Break Method");
	  }
	  public void change_direction() {
	    System.out.println("Two Wheeler Change Direction Method");
	  }
	}

	class Cycle extends TwoWheeler{
		 int no_mirror=0;
		 int gear=4;
	  
		  public void attributes() {
		    	System.out.println("******Cycle Method******");
		    	System.out.println("Number of Wheels: "+no_wheels);
		    	System.out.println("Number of Mirrors: "+no_mirror);
		    	System.out.println("Gear: "+gear);
		    }
		  
	  public void run() {
	    System.out.println("Cycle Run Method");
	  }
	  public void breaks() {
	    System.out.println("Cycle Break Method");
	  }
	  public void change_direction() {
	    System.out.println("Cycle Change Direction Method");
	  }
	  
	}

	class MotorCycle extends TwoWheeler{
		  
		  public void attributes() {
		    	System.out.println("******MotorCycle Method******");
		    	System.out.println("Number of Wheels: "+no_wheels);
		    	System.out.println("Number of Mirrors: "+no_mirror);
		    	System.out.println("Gear: "+gear);
		    }
	  
	  public void run() {
	    System.out.println("MotorCycle Run Method");
	  }
	  public void breaks() {
	    System.out.println("MotorCycle Break Method");
	  }
	  public void change_direction() {
	    System.out.println("MotorCycle Change Direction Method");
	  }
	}