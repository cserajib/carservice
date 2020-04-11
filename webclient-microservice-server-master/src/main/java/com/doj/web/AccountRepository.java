/**
 * 
 */
package com.doj.web;

import java.util.List;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository {
	
/*	List<Account> getAllAccounts();
	
	Account getAccount(String number);*/
	
    List<Car> getAllAccounts();
	
	Car getAccount(int number);
}
