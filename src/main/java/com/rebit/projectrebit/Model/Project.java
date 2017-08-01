package com.rebit.projectrebit.Model;

import java.util.ArrayList;
import java.util.List;

public class Project {
	int PROJECT_ID;
	String PROJECTS_NAME;
	List<String> REPORT_LIST=new ArrayList<String>();
	public int getPROJECT_ID() {
		return PROJECT_ID;
	}
	public void setPROJECT_ID(int pROJECT_ID) {
		PROJECT_ID = pROJECT_ID;
	}
	public String getPROJECTS_NAME() {
		return PROJECTS_NAME;
	}
	public void setPROJECTS_NAME(String pROJECTS_NAME) {
		PROJECTS_NAME = pROJECTS_NAME;
	}
	public List<String> getREPORT_LIST() {
		return REPORT_LIST;
	}
	public void setREPORT_LIST(List<String> rEPORT_LIST) {
		REPORT_LIST = rEPORT_LIST;
	}
	

	}


