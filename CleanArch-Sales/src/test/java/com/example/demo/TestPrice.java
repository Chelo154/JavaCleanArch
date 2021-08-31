package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.example.productcontext.domain.exceptions.InvalidPriceException;
import com.example.productcontext.domain.valueobjects.Price;

public class TestPrice {

	
	
	@Test
	public void testPrice() {
		try {
			Price price = new Price(1.0);
		} catch (InvalidPriceException e) {
			Assert.fail("Price is a valid price");
		}
	}
	
	@Test
	public void testInvalidPrice() {
		try {
			Price price = new Price(-1.0);
			Assert.fail("Price is an invalid Price");
		} catch (InvalidPriceException e) {
			
		}
	}
	
	
	@Test
	public void testPriceChange() {
		try {
			Price price = new Price(1.0);
			double amount = 1000.0;
			price.changePrice(amount);
			
			Assert.assertEquals(amount,price.getValue(),0);
		} catch (InvalidPriceException e) {
			Assert.fail("Is a valid price change");
		}
	
	}
	
	
	@Test
	public void testPriceChangeInvalid() {
		try {
			Price price = new Price(1.0);
			double amount = -1000.0;
			price.changePrice(amount);
			
			Assert.fail("Is an invalid price change");
		} catch (InvalidPriceException e) {
			
		}
	}
	
	@Test
	public void testIncreasePriceByPercentaje() {
		try {
			
			Price price = new Price(100.0);
			double expected = 110.0;
			
			price.increasePriceByPercentaje(10);
			
			Assert.assertEquals(expected, price.value,0);
			
			
		} catch (InvalidPriceException e) {
			Assert.fail("Is a valid price change");
		}
		
		
	}

}
