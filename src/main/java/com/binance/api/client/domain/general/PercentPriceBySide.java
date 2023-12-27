package com.binance.api.client.domain.general;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PercentPriceBySide extends SymbolFilter {

	  String bidMultiplierUp;
	  String bidMultiplierDown;
	  String askMultiplierUp;
	  String askMultiplierDown;
	  int avgPriceMins;

	 /* public boolean validate(double price, double currentPrice) {
	    return price <= currentPrice * dbl(multiplierUp) && price >= currentPrice * dbl(multiplierDown);
	  }
*/
}
