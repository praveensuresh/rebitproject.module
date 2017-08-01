package com.rebit.projectrebit.Model;

import java.util.ArrayList;
import java.util.List;

public class Report {
	int REPORT_ID;
	String REPORT_NAME;
	List<String> QUERY_LIST=new ArrayList<String>();
	public int getREPORT_ID() {
		return REPORT_ID;
	}
	public void setREPORT_ID(int rEPORT_ID) {
		REPORT_ID = rEPORT_ID;
	}
	public String getREPORT_NAME() {
		return REPORT_NAME;
	}
	public void setREPORT_NAME(String rEPORT_NAME) {
		REPORT_NAME = rEPORT_NAME;
	}
	public List<String> getQUERY_LIST() {
		return QUERY_LIST;
	}
	public void setQUERY_LIST(List<String> qUERY_LIST) {
		QUERY_LIST = qUERY_LIST;
	}

}
