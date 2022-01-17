package manager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class main_frame {
	private static String chart_file = "C:\\Users\\Hector\\eclipse\\__broker\\src\\manager\\coinchart.txt";
	private static int f_width = 800;
	private static int f_height = 600;
	
	public static JFrame __frame(String coin_type) {
		String title = "Broker : " + coin_type;
		JFrame f = new JFrame(title);
		
		f.setSize(f_width, f_height);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return f;
	}
	
	public static void check_if_red(String coin_type) {
		
		/*-------------:| HTML HANDLE METADATA |:--------------------------
		 * Objective : GET hyper text content than imprint into a file
		 * 	Read the contents of the text with in the imprint
		 * 	Compare value with in brackets or dividers
		 *  Compare value to extract data to state and watch
		 *   Market shares and currency escalation.
		 *  Trade value if is profitable.
		 * ----------------------------------------------------------------
		 * ---------:| www.cryptocurrencychart.com |:----------------------
		 * https://www.cryptocurrencychart.com/live-prices/XMR
		 * 
		 * <span class="change" data-change="0.040212107598112334" 
		 * title="Price change %">+4.02%</span>
		 *  
		 * <span class="price currency" data-value="191.96812211208" 
		 * title="Current coin price">$191.96</span>
		 * 
		 * <div data-id="370" class="coin coin-block block-green">
				<a href="#remove" class="close"></a>
				<span class="title">Monero <span class="symbol">(XMR)</span>
				</span>
				<span class="price currency" data-value="191.96812211208" title="Current coin price">$191.96</span>
				<span class="change" data-change="0.040212107598112" title="Price change %">+4.02%</span>
				<br class="break-1">
				<span class="my-value-container">
					<input class="my-coin-input data-price" type="text" id="my-coin-XMR" data-value="0" data-price="191.96812211208" value="0">
					<span class="my-value" title="The value of the coins in the selected fiat currency">$0.00</span>
					<span class="my-change" title="The change in value of the coins in the selected fiat currency">$0.00</span>
				</span><br class="break-2">
				<span class="ratio-description">% of total</span>
				<span class="ratio">0.00%</span>
			</div>
			
		 * -----------------------------------------------------------------
		 * ---------:| www.coinmarketcap.com |:-----------------------------
		 * https://coinmarketcap.com/currencies/monero/
		 *
		 *  <div class="priceValue "><span>$189.84</span></div>
		 *  
		 *  <span style="font-size:14px;font-weight:600;padding:5px 10px" class="sc-15yy2pl-0 feeyND">
		 *  <span class="icon-Caret-down"> </span>1.25<!-- -->%</span>
		 *  <span class="icon-Caret-down"></span>
		 *  
		 */
		
		Path chart_map = Path.of(chart_file);
		try {
			String chart_string = Files.readString(chart_map);
			System.out.println(chart_string);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		String span_coin_type = "<span class=\"symbol\">("+ coin_type + ")</span>";
	    
		
	    Pattern pattern = Pattern.compile("<span class=\\\"symbol\\\">(\\S+)</span>");
	    Matcher matcher = pattern.matcher(span_coin_type);
	    if (matcher.find()) {
	       String result = matcher.group(1);
	       System.out.println(result);
	    }

	}
	
	
	public static void main(String[] args) {
		JFrame context = __frame("ZAR");
		context.setVisible(true);
		
		check_if_red("BTC");
		//charter_host htclient = new charter_host();
	}

}
