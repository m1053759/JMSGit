package mindtree.com.JMSTransaction.transaction;

public class Transaction {

	int id;
	String from;
	String to;
	int amount;
	
	public Transaction(int id, String from, String to, int amount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [id=" +id+ ", from=" +from+ ", to=" +to+ ", amount=" +amount+ "]";
	}
	
}
