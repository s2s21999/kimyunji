package miniproject01;
import java.util.Scanner;

public class SmartPhoneMain {
   public static void printMenu() {
      System.out.println("주소관리 메뉴--------------------");
      System.out.println(">>1. 연락처 등록(회사)");
      System.out.println(">>2. 연락처 등록(거래처)");
      System.out.println(">>3. 모든 연락처 출력");
      System.out.println(">>4. 연락처 검색");
      System.out.println(">>5. 연락처 삭제");
      System.out.println(">>6. 연락처 수정");
      System.out.println(">>7. 프로그램 종료");
       System.out.println("------------------------------");
   }
   public static void main(String[] args) {
      SmartPhone smartphone=new SmartPhone();
      Scanner in = new Scanner(System.in);
      while(true) {
         printMenu();
         int choice=in.nextInt();
         String a=in.nextLine();
         
         if(choice==1) {
            System.out.print("이름: ");
            String name=in.nextLine();
            System.out.print("전화번호: ");
            String telNum=in.nextLine();
            System.out.print("이메일: ");
            String email=in.nextLine();
            System.out.print("주소: ");
            String address=in.nextLine();
            System.out.print("회사이름: ");
            String companyName=in.nextLine();
            System.out.print("부서이름: ");
            String companyUnit=in.nextLine();
            System.out.print("직급: ");
            String companyPosition=in.nextLine();
            
            CompanyAddr companyaddr=new CompanyAddr();
//            Addr addr=new Addr();
            
            companyaddr.setName(name);
            companyaddr.setTelNum(telNum);
            companyaddr.setEmail(email);
            companyaddr.setAddress(address);
            companyaddr.setCompanyName(companyName);
            companyaddr.setCompanyUnit(companyUnit);
            companyaddr.setCompanyPosition(companyPosition);
            
            smartphone.addAddr(companyaddr);
            continue;
         }else if(choice==2){
            System.out.print("이름: ");
            String name=in.nextLine();
            System.out.print("전화번호: ");
            String telNum=in.nextLine();
            System.out.print("이메일: ");
            String email=in.nextLine();
            System.out.print("주소: ");
            String address=in.nextLine();
            System.out.print("거래처 이름: ");
            String customerName=in.nextLine();
            System.out.print("거래품목: ");
            String items=in.nextLine();
            System.out.print("거래처 직급: ");
            String customerPosition=in.nextLine();
            
            CustomerAddr customeraddr=new CustomerAddr();
//            Addr addr=new Addr();
            
            customeraddr.setName(name);
            customeraddr.setTelNum(telNum);
            customeraddr.setEmail(email);
            customeraddr.setAddress(address);
            customeraddr.setCustomerName(customerName);
            customeraddr.setItems(items);
            customeraddr.setCustomerPosition(customerPosition);
            
            smartphone.addAddr(customeraddr);
            continue;
            
            
         }else if(choice==3) {
            smartphone.printAllAddr();
            continue;
         
         }else if(choice==4) {
            System.out.print("검색하고 싶은 이름을 입력하세요.");
            String name=in.nextLine();
            smartphone.searchAddr(name);
            continue;
            
         }else if(choice==5) {
            System.out.print("지울 이름을 입력하세요.");
            String name=in.nextLine();
            smartphone.deleteAddr(name);
            continue;
            
         }else if(choice==6) {
            System.out.print("수정하고 싶은 주소록 이름을 입력하세요.");
            String name=in.nextLine();
            
            
            
            System.out.println("새로운 정보를 입력하세요.");
            System.out.print("이름: ");
            String newName = in.nextLine();
            System.out.print("전화번호: ");
            String newTel = in.nextLine();
            System.out.print("이메일: ");
            String newEmail = in.nextLine();
            System.out.print("주소: ");
            String newAddress = in.nextLine();
            System.out.print("회사or거래처");
            String c=in.nextLine();
            if(c=="회사"){
            	
            	CompanyAddr newCompanyAddr=new CompanyAddr();
            	
               
            	System.out.print("회사이름: ");
                String newCompanyName=in.nextLine();
                System.out.print("부서이름: ");
                String newCompanyUnit=in.nextLine();
                System.out.print("직급: ");
                String newCompanyPosition=in.nextLine();
                
                newCompanyAddr.setCompanyName(newCompanyName);
                newCompanyAddr.setCompanyUnit(newCompanyUnit);
                newCompanyAddr.setCompanyPosition(newCompanyPosition);
            }else if(c=="거래처"){
            	
            	CustomerAddr newCustomerAddr= new CustomerAddr();
            	System.out.print("거래처 이름: ");
  
            	String newCustomerName=in.nextLine();
  
            	System.out.print("거래품목: ");
  
            	String newItems=in.nextLine();
   
            	System.out.print("거래처 직급: ");
   
            	String newCustomerPosition=in.nextLine();

                newCustomerAddr.setCustomerName(newCustomerName);
                newCustomerAddr.setItems(newItems);
                newCustomerAddr.setCustomerPosition(newCustomerPosition);
            }
            
            Addr newAddr = new Addr();
            
            newAddr.setName(newName);
            newAddr.setTelNum(newTel);
            newAddr.setEmail(newEmail);
            newAddr.setAddress(newAddress);
            
           
            

            
            smartphone.editAddr(name,newAddr);
            continue;
            
         }else if(choice==7) {
            System.exit(0);
         }else {
            System.out.println("다시 선택해 주세요.");
         }
      }

      

      
      }
   

}
