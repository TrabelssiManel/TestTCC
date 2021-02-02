package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.ResponseDTO;

@Service
public class FizzBuzzService {
	/**
	 * c'est une methode qui prend un entier comme entree et retourne une liste en sortie
	 * @param num
	 * @return ResponseDTO
	 */

	public ResponseDTO fbMethod(Integer num) {
		ResponseDTO result = new ResponseDTO();
		/**
		 *list is a list that we will put inside the return values 
		 */
		List<Object> list = new ArrayList<Object>();
		if (num <= 0) {

			list.add("Please enter a number above 0");
		} else {
			/**
			 *we will browse all the numbers from 1 to the entered number. 
			 *
			 * if i  is divisible by 3and by 5 we put in the list 'FizzBuzz'
			 * then if the number divisible only by 3  we add in the list 'Fizz"
			 * if is divisible only by 5 we add in the list 'Buzz'
			 * else we put the number
			 * until the entered number
			 */
			for (int i = 1; i <= num; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					list.add("FizzBuzz");
				} else if (i % 3 == 0) {
					list.add("Fizz");
				} else if (i % 5 == 0) {
					list.add("Buzz");
				} else {
					list.add(i);

				}
			}
		}
		/**
		 * finally we set our final result with the list we have to fill in
		 */
		result.setResult(list);
		return result;
	}

}
