
import java.time.LocalDate;

public class Acc {
	private int accno;
	private String type;
	private LocalDate openingdate;
	private double openingbal;

	public Acc(int accno, String type, LocalDate openingdate, double openingbal) {
		super();
		this.accno = accno;
		this.type = type;
		this.openingdate = openingdate;
		this.openingbal = openingbal;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getOpeningdate() {
		return openingdate;
	}

	public void setOpeningdate(LocalDate openingdate) {
		this.openingdate = openingdate;
	}

	public double getOpeningbal() {
		return openingbal;
	}

	public void setOpeningbal(double openingbal) {
		this.openingbal = openingbal;
	}

}
