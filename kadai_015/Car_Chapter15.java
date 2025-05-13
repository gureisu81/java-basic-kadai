package kadai_015;


	//車クラス
 class Car_Chapter15{
	private int gear  = 1;  //ギア
	private int speed = 10; //ギアチェンジ後の速度
		
	
	//ギアの値により速度を変える
	public void gearChange(int afterGear) {
		//ギアに応じた速度の設定
		switch (afterGear) {
		case 1:
			speed = 10;
			break;
		case 2:
			speed = 20;
			break;
		case 3:
			speed = 30;
			break;
		case 4:
			speed = 40;
			break;
		case 5:
			speed = 50;
			break;
		default:
			speed = 10;
			break;
		}
		System.out.println( "ギア" + gear + "から"+ afterGear + "に切り替えました");
		gear = afterGear;
	}
	public void run() {
		
		System.out.println("速度は時速" + speed + "kmです");
		
	}
	}
	
	


