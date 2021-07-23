package assignment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobile a=new Automobile(4,2,6);
		a.attributes();
		a.run();
		a.breaks();
		a.change_direction();
		System.out.println();
		
		Toto t=new Toto(3,2,5);
		t.attributes();
		t.run();
		t.breaks();
		t.change_direction();
		System.out.println();
		
		TwoWheeler tw=new TwoWheeler();
		tw.attributes();
		tw.run();
		tw.breaks();
		tw.change_direction();
		System.out.println();
		
		Cycle c=new Cycle();
		c.attributes();
		c.run();
		c.breaks();
		c.change_direction();
		System.out.println();
		
		MotorCycle m=new MotorCycle();
		m.attributes();
		m.run();
		m.breaks();
		m.change_direction();
		System.out.println();
		
	}

}
