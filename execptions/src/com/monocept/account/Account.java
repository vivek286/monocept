package com.monocept.account;

public class Account extends AccountException{
private int accno;
private String name;
private AccountType acctype;
private int balance;

public Account(int accno, String name, AccountType acctype,int balance) {
	super("");
	this.accno = accno;
	this.name = name;
	this.acctype = acctype;
	this.balance=balance;
	initalizeAccountType();
}
public void initalizeAccountType() {
	switch(this.acctype) {
	case saving:
		if(balance<5000)
		throw new AccountException("BalanceInsufficient");
		break;
	case current:
		if(balance<5000)
			throw new AccountException("BalanceInsufficient");
		break;
	
		
		
}
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public AccountType getAcctype() {
	return acctype;
}
public void setAcctype(AccountType acctype) {
	this.acctype = acctype;
}


@Override
public String toString() {
	return "Account [accno=" + accno + ", name=" + name + ", acctype=" + acctype + "]";
}
public void deposit(int ammount) {
	this.balance+=ammount;
	System.out.println("Account [accno=" + accno + ", name=" + name + ", acctype=" + acctype + "]");
	 
	
}
public void withdraw(int ammount) {
	int temp=balance-ammount;
	if(temp<5000) {
		throw new AccountException("MinimumAmountLimit");
	}
	balance=temp;
	System.out.println("Account [accno=" + accno + ", name=" + name + ", acctype=" + acctype + "]");
	
}

}
