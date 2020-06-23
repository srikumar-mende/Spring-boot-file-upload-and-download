package com.example.filedemo.model;

import org.hibernate.annotations.GenericGenerator;

import java.util.Arrays;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class DBFile {
	@Id
	/*
	 * @GeneratedValue(generator = "uuid")
	 * 
	 * @GenericGenerator(name = "uuid", strategy = "uuid2")
	 */
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String fileName;

	private String fileType;

	@Lob
	private byte[] data;

	public DBFile() {

	}



	public DBFile(String fileName, String fileType, byte[] data) {
		super();
		this.fileName = fileName;
		this.fileType = fileType;
		this.data = data;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

}
