package server_getchar;

import java.io.Serializable;

public class KategorieVO implements Serializable {
	private String kategorie_name;
	private int kategorie_id;
	
	
	
	public String getKategorie_name() {
		return kategorie_name;
	}
	public void setKategorie_name(String kategorie_name) {
		this.kategorie_name = kategorie_name;
	}
	public int getKategorie_id() {
		return kategorie_id;
	}
	public void setKategorie_id(int kategorie_id) {
		this.kategorie_id = kategorie_id;
	}
}
