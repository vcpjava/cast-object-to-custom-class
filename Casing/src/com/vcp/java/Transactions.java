package com.vcp.java;

public class Transactions {
	private int tno;
	private String ttype;

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	@Override
	public String toString() {
		return "Transactions [tno=" + tno + ", ttype=" + ttype + "]";
	}
	
	
	
	

}
