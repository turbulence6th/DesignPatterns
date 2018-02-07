package com.turbulence6th.builder;

public class Table {

	private int a;
	
	private float b;
	
	private String c;
	
	public static Builder getBuilder() {
		return new Builder();
	}
	
	public static class Builder {
		
		private Table table;
		
		public Builder setA(int a) {
			table.a = a;
			return this;
		}
		
		public Builder setB(float b) {
			table.b = b;
			return this;
		}
		
		public Builder setC(String c) {
			table.c = c;
			return this;
		}
		
		public Table build() {
			return table;
		}
		
		private Builder() {
			table = new Table();
		}
		
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	
}
