/** 
 * Calculator
 * @author asafiullin
 * @since 21.02.2017
 * @version 1
*/
package ru.job4j.calculator;

//Create a class
public class Calculator {

//Внутреннее поле 
	private double result;

//Method add
	public void add (double first, double second) {
		this.result = first + second;
		}

//Method substract
	public void substract (double first, double second) {
		this.result = first - second;
		}

//Method div
	public void div (double first, double second) {
		this.result = first / second;
		}

//Method multiple
	public void multiple (double first, double second) {
		this.result = first * second;
		}
		
//Method getResult
	public double getResult () {
		return result;
	}

}
