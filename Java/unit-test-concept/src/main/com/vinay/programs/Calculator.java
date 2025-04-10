package com.vinay.programs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

		private static Logger log = LoggerFactory.getLogger(Calculator.class);
	
		public static void main(String[] args) {
			
			int sum = add(2,2);
			log.info("The sum is {}", sum);
			
		}
		
		static int add(int num1, int num2) {
			return (num1 + num2);
		}
		
}
