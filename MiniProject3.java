package homework;

public class MiniProject3 {
	private int value;

	public MiniProject3() {value=0;}
	public int getValue() {return value;}
	public void setValue(int value) {this.value=value;}
	public int roll() {value=(int)(Math.random() * 6) + 1; return value;}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniProject3 dice1=new MiniProject3();
		MiniProject3 dice2=new MiniProject3();
		int count = 0;
		
		while(true) {
			dice1.setValue(dice1.roll());
			dice2.setValue(dice2.roll());
			System.out.println("주사위1= "+dice1.getValue()+" 주사위2= "+ dice2.getValue());
			count++;
			if(dice1.getValue() + dice2.getValue() == 2) {
				break;
			}
		}
		System.out.println("(1,1)이 나오는데 걸린 횟수="+count);
	}

}
