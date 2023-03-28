package in.ashokit;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_bookss")
public class BookEntity {
	
	public Integer getBookid() {
		return Bookid;
	}
	public void setBookid(Integer bookid) {
		Bookid = bookid;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Id
	private Integer Bookid;
	private String  Bookname;
	private double price;



}
