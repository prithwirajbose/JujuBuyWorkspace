package com.jujubuy.bean;

public enum ProductUnit {
	Piece,
	KiloGram,
	Mitre,
	Pieces_100,
	Pieces_10,
	Pieces_5,
	Gram,
	CentiMitre,
	Pack;
	
	public String value() {
		String val = name();
		if(val!=null && val.contains("_")) {
			String[] valParts = val.split("_");
			if(valParts.length==2 && valParts[0].toLowerCase().equals("pieces")) {
				val = valParts[1] + " " + valParts[0];
			}
			else {
				val = val.replaceAll("_", " ");
			}
		}
		return val;
	}
}
