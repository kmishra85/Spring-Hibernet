package com.igate.intro;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class CurrencyConverterClient {

	public static void main(String args[]) throws Exception {
		Resource res = new ClassPathResource
				("currencyconverter.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
		/*XmlBeanFactory(Resource)
		XmlBeanFactory(String)*/
		
		CurrencyConverter curr = (CurrencyConverter)
				factory.getBean("currencyConverter");
		
	//	Object curr = factory.getBean("currencyConverter");
		
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees+" Rs.");
	}
}
