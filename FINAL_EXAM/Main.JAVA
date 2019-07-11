package online_sopping;


public class Online_Sopping {

  
    public static void main(String[] args) {
        
        
        Admin admin = new Admin();
        
        admin.name = "ABU_BAKAR_SIDDIK";
        
        System.out.println(admin);

        
        Address address = new Address("Dhaka","Dhaka","Wari","Dhaka_Sadar");
        
        Customer customer = new Customer("ABU_BAKAR_SIDDIK",address);
        
        System.out.println(customer);
        
        
    }
    
}