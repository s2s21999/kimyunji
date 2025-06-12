package miniproject01;

public class CustomerAddr extends Addr{
	String customerName;
	String items;
	String customerPosition;
	
	public String getCustomerName() {
		return customerName;
	}
	public String getitems() {
		return items;
	}
	
	public String getcustomerPosition() {
		return customerPosition;
	}
	
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public void setItems(String items) {
		this.items=items;
		}
	
	public void setCustomerPosition(String customerPosition) {
		this.customerPosition=customerPosition;
	}
	
	@Override
	public void printinfo() {
		super.printinfo();
		System.out.println("회사 이름: "+customerName);
		System.out.println("부서 이름: "+items);
		System.out.println("직급: "+customerPosition);
	}
}
