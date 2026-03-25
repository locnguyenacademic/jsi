/**
 * JSI: JAGGED STRATEGY INVESTMENT 
 * (C) Copyright by Loc Nguyen's Academic Network
 * Project homepage: jsi.locnguyen.net
 * Email: ng_phloc@yahoo.com
 * Phone: +84-975250362
 */
package net.jsi;

import java.io.Serializable;
import java.util.List;

public interface Market extends Serializable, Cloneable {

	
	double getBalance(long timeInterval);
	
	
	double getFreeMargin(long timeInterval);


	double getMargin(long timeInterval);
	
	
	double getProfit(long timeInterval);


	double getTakenValue(long timeInterval);

	
	double getROI(long timeInterval);


	double getROIByLeverage(long timeInterval);

	
	double calcBias(long timeInterval);

	
	double calcOscill(long timeInterval);

		
	double calcOscillAbs(long timeInterval);

	
	double calcOscillRatio(long timeInterval);

	
	double calcOscillRatioAbs(long timeInterval);

	
	double calcMinMaxDev(long timeInterval);

	
	double calcInvestAmount(long timeInterval);

		
	double calcInvestAmountRisky(long timeInterval);

		
	String getName();
	
	
	/**
	 * Getting time view interval in milisecond which is used to calculate many quantities.
	 * @return time view interval in milisecond.
	 */
	long getTimeViewInterval();
	
	
	/**
	 * Getting time valid interval in milisecond.
	 * @return time valid interval in milisecond.
	 */
	long getTimeValidInterval();
	
	
	double getLeverage();
	
	
	double getUnitBias();

		
	List<Stock> getStocks(long timeInterval);
	
	
	Market getSuperMarket();
	
	
	Universe getNearestUniverse();
	
	
	List<String> getSupportStockCodes();

	
	List<String> getDefaultStockCodes();

	
	StockImpl c(Stock stock);
	
	
	Market getDualMarket();
	
	
	Price newPrice(double price, double lowPrice, double highPrice, long time);
	
	
}