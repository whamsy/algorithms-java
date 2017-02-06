package arrays;
//Given a list of stock prices for n days, find the maximum profit with a single buy/sell activity.
public class MaxSingleSellProfit{
	public static void main(String args[]){
		
		int ticker_prices1[] = {8,5,12,9,19,1};
		int ticker_prices2[] = {12,11,9,1};
		
		System.out.println(max_profit(ticker_prices1));
		
	}

	private static String max_profit(int[] a) {
		
		int highest_profit = Integer.MIN_VALUE;
		int curr_buy = a[0]; //8
		int curr_sell = a[1]; //5
		int curr_profit = curr_buy - curr_sell; //-3
		
		for(int i=1; i<a.length;i++){
			
			curr_profit = a[i] - curr_buy; //0
			
			if(a[i]<curr_buy){
				curr_buy = a[i];
			}
			
			if(curr_profit > highest_profit){
				highest_profit = curr_profit;
				curr_sell = a[i];
			}
		}
		return "HIGHEST PROFIT/LEAST LOSS : "+highest_profit+", BUY at : "+(curr_sell-highest_profit)+", SELL at : "+curr_sell;
	}
}