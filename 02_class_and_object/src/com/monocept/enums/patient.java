package com.monocept.enums;

public class patient {
private BpLevel bplevel;
private String name;
private String medicine;
public patient(BpLevel bplevel, String name) {
	
	this.bplevel = bplevel;
	this.name = name;
	prescibe();
}
private void prescibe() {
	switch(this.bplevel) {
		case low:
			this.medicine="AA";
			break;
		case normal:
			this.medicine="BB";
			break;
		case high:
			this.medicine="CC";
			break;
			
			
	}
}
public BpLevel getBplevel() {
	return bplevel;
}
public void setBplevel(BpLevel bplevel) {
	this.bplevel = bplevel;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String toString() {
	return "Patient name: "+this.name+"\n"+"BPLEVEL: "+this.bplevel+"\n"+"Medicine :"+this.medicine+"\n";
}

}
