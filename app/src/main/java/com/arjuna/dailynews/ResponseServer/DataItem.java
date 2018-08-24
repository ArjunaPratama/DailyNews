package com.arjuna.dailynews.ResponseServer;


import com.google.gson.annotations.SerializedName;


public class DataItem{

	@SerializedName("isiberita")
	private String isiberita;

	@SerializedName("penulis")
	private String penulis;

	@SerializedName("id")
	private String id;

	@SerializedName("tanggal")
	private String tanggal;

	@SerializedName("judul")
	private String judul;

	public void setIsiberita(String isiberita){
		this.isiberita = isiberita;
	}

	public String getIsiberita(){
		return isiberita;
	}

	public void setPenulis(String penulis){
		this.penulis = penulis;
	}

	public String getPenulis(){
		return penulis;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTanggal(String tanggal){
		this.tanggal = tanggal;
	}

	public String getTanggal(){
		return tanggal;
	}

	public void setJudul(String judul){
		this.judul = judul;
	}

	public String getJudul(){
		return judul;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"isiberita = '" + isiberita + '\'' + 
			",penulis = '" + penulis + '\'' + 
			",id = '" + id + '\'' + 
			",tanggal = '" + tanggal + '\'' + 
			",judul = '" + judul + '\'' + 
			"}";
		}
}