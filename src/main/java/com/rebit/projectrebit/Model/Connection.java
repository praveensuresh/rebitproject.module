package com.rebit.projectrebit.Model;

public class Connection {
int USER_ID;
String PASSWORD;
String MONGO_URL;
public int getUSER_ID() {
	return USER_ID;
}
public void setUSER_ID(int uSER_ID) {
	USER_ID = uSER_ID;
}
public String getPASSWORD() {
	return PASSWORD;
}
public void setPASSWORD(String pASSWORD) {
	PASSWORD = pASSWORD;
}
public String getMONGO_URL() {
	return MONGO_URL;
}
public void setMONGO_URL(String mONGO_URL) {
	MONGO_URL = mONGO_URL;
}
}
