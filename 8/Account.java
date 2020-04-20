package homework5;

public abstract class Account {

    private int accountId;

    public Account(int id){
        this.accountId=id;
    	}

    public int getAccountId() {
        return accountId;
    	}

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    	}

    public abstract double calculateSales();

    public String toString() {
        return "Account ID: "+getAccountId();
    	}
}