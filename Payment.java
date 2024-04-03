
import java.time.LocalDateTime;

public class Payment {

	private double amount;
	private LocalDateTime createdAt;

	Payment(double amount) {
		this.amount = amount;
		createdAt = LocalDateTime.now();
	}

	// getters
	public double getAmount() {
		return amount;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	// setters
	public void setAmount(double amount) {
		this.amount = amount;
	}

}