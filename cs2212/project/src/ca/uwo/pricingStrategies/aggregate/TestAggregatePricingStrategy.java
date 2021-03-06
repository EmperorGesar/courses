package ca.uwo.pricingStrategies.aggregate;

import java.util.Map;

/**
 * @author kkontog, ktsiouni, mgrigori
 * This class is one concrete implementation of {@link AggregatePricingStrategy} interface.
 */
public class TestAggregatePricingStrategy implements AggregatePricingStrategy {

	/* (non-Javadoc)
	 * @see ca.uwo.pricingStrategies.aggregate.AggregatePricingStrategy#calculateTotal(java.util.Map)
	 */
	@Override
	public double calculateTotal(Map<String, Double> priceBreakdown) {
		System.out.println("Test aggregate strategy used.");
		double totalAmount = 0.0;
		
		for (Double value : priceBreakdown.values()) {
			totalAmount += value;
		}
		return totalAmount*0.9;
	}

}
