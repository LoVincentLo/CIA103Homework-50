package hw1;

public class hw1 {
	public static void main(String[] args) {
//		1.請設計一隻Java程式,計算12,6這兩個數值的和與積
		int num1 = 12;
		int num2 = 6;
		System.out.println("和 = " + (num1 + num2));
		System.out.println("積 = " + (num1 * num2));
//		2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		int dozen = 12;
		System.out.println("有" + (egg / dozen) + "打" + (egg % dozen) + "顆雞蛋");
//		3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒 //一分鐘60秒 一小時60sec*60min 一天60sec*60min*24
		int totalsec = 256559;
		int sec = 60;
		int min = 60;
		int hour = 24;
		int daysec = sec * min * hour;
		int calday = totalsec / daysec;
		int remainday = totalsec % daysec;
		int calhour = remainday / (sec * min); //hour
		int remainhour = remainday % (sec * min);
		int calmin = remainhour / min;
		int calsec = remainhour % min;
		System.out.println("256559等於" + calday + "天" + calhour + "小時" + calmin + "分鐘" + calsec + "秒");
		
//		4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double pi = 3.1415;
		int half = 5;
		System.out.println("園面積 = " + half * half *pi);
		System.out.println("園面積 = " + half + half *pi);
//		5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		
//		6.請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
	}
}