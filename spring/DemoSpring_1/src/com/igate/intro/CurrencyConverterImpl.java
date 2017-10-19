package com.igate.intro;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CurrencyConverterImpl 
implements CurrencyConverter, 
BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean{
	
	public void myInit(){
		System.out.println(" in my init ");
	}
	
	public void myDestroy(){
		System.out.println(" in my destroy ");
		
	}
	CurrencyConverterImpl(){
		
		System.out.println(" currency converter object creaetd ");
	}
	private double exchangeRate;
	
	public double getExchangeRate() {
		System.out.println("getExchangeRate()");		
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		System.out.println("setExchangeRate()");		
		this.exchangeRate = exchangeRate;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeRate;
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println(" in bean name aware's method");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" in disposable bean's method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" in initializing beans method");
		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(" in beanfactory aware's method");
		
	}
};