package com.vcp.java;

import java.util.ArrayList;
import java.util.List;

public class Repo {
  public List<Object> getTrans(){
	  List<Object> al = new ArrayList<Object>();
	  Transactions tr = new Transactions();
	  tr.setTno(101);
	  tr.setTtype("W");
	  Transactions tr1 = new Transactions();
	  tr1.setTno(102);
	  tr1.setTtype("D");
	  al.add(tr);
	  al.add(tr1);
	  return al;
  }
}
