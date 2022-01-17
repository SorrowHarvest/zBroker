package manager;

import java.util.*;

public class bank_clerk {
	public static String pick_coin(int coin_id) {
		switch(coin_id) {
			case 0 : return "XMR";
			case 1 : return "ETH";
			case 2 : return "BTC";
			
			default : return "XRP";
		}
		
	}
	
	public static void gain_amount(float value, int coin_id) {
		configure_task('W', (int)1);
		pick_coin(coin_id);
	}
	
	public static boolean gained_value(float value, String coin) {
		
		return false;
	}
	
	public static void configure_task(char task, int interval) {
		Task withdraw_t = new Task("Withdraw");
		Task exchange_t = new Task("Exchange");
		Task diposit_t = new Task("Deposit");
		Task observe_t = new Task("Observe");
		
		
		Timer stop_watch = new Timer();
		switch(task) {
			case 'W' : stop_watch.schedule(withdraw_t, interval); break;
			case 'E' : stop_watch.schedule(exchange_t, interval); break;
			case 'D' : stop_watch.schedule(diposit_t, interval); break;
			default : stop_watch.schedule(observe_t, interval); break;
			
		}
		
	}
}

class Task extends TimerTask {
	   private String name;
	   public Task(String name) {
	       this.name = name;
	   }
	   public void run() {
	      System.out.println("[" + new Date() + "] " + name + ": task executed!");
	   }
	}