package com.assignments;

public class Matrix {
	
	private int rows;
	private int columns;
	private int dimen[][];
	
	public Matrix(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.dimen = new int[rows][columns];
	}

	public void fillMatrix(int values[][]) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				dimen[i][j] = values[i][j];
			}
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(dimen[i][j] + "\t");
			}
	      System.out.println();	
	}
  }
}
