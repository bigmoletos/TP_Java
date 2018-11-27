/**
 * 
 */
package main;

import dao.*;
import entities.*;

/**
 * @author franck Desmedt
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		I_beer_DAO beer = new BeerMysqlDao();
		
		Beer NameBeer = new Beer();
		
		 beer.create(NameBeer);
		beer.update(NameBeer);
		
		 
		System.out.println("ma biere "+NameBeer);
		//System.out.printf("ma biere %s",  beer.create(NameBeer));
		// @Override
		// public void create(beer b) {
		// // TODO Auto-generated method stub
		//
		// }

	}

}
