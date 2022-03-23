package com.spring.rest.model;

public class FileDetails {
	private String fileName;
	private String fileSize;
	private Integer fileValue;
	public FileDetails() {
		
	}
	public FileDetails(String fileName, String fileSize, Integer fileValue) {
		
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.fileValue = fileValue;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public Integer getFileValue() {
		return fileValue;
	}
	public void setFileValue(Integer fileValue) {
		this.fileValue = fileValue;
	}
	@Override
	public String toString() {
		return "FileDetails [fileName=" + fileName + ", fileSize=" + fileSize + ", fileValue=" + fileValue + "]";
	}
	
	

}
