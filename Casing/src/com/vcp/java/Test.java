package com.vcp.java;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		TransactionsService service = new TransactionsService();
		List<Transactions>trans= service.getTransaction();
		System.out.println(trans);
	}

}
