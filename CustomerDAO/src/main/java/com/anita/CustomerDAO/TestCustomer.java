package com.anita.CustomerDAO;

import java.io.*;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			CustomerDAO cd= new CustomerDAO();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Customer ID");
			int id = Integer.parseInt(br.readLine());
			/*System.out.println("Enter Customer Name");
			String name = br.readLine();
			System.out.println("Enter Customer Age");
			int age = Integer.parseInt(br.readLine());
			cd.updateCustomer(id, name, age);
			cd.deleteCustomer(id);*/
			cd.getCustomer(id);
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
	 	 