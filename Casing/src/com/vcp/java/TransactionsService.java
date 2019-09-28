package com.vcp.java;

import java.util.ArrayList;
import java.util.List;

public class TransactionsService {
   public List<Transactions> getTransaction(){
	   Repo repo = new Repo();
	   List<Transactions> list = new ArrayList<Transactions>();
	   List<Object> object = repo.getTrans();
	   for(Object ob: object) {
		   Object obj = new Transactions();
		   if(obj instanceof Transactions) {
			   Transactions tran = (Transactions) obj;
			   tran.setTno(((Transactions) ob).getTno());
			   tran.setTtype(((Transactions) ob).getTtype());
			   list.add(tran);
		   } 
	   } 
	   return list;
   }
}
