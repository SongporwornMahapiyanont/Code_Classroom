import java.util.Scanner;

class ContactBook{
 String [] name;
 String [] phone;
    public ContactBook(String [] name, String [] phone){
        this.name = name;
        this.phone = phone;
    }

    void getAllContact(){
        for(int i=0; i<this.name.length; i++){
            System.out.println(name[i]+" "+phone[i]);
        }
    }

    void getContact(String name){
        boolean check = false;
        for(int i=0; i<this.name.length; i++){
            if(this.name[i].equals(name)){
                check = true;
                System.out.println(phone[i]);
            }
        }
        if(!check){
            System.out.println("Invalid contact");
        }
    }

    static boolean onlyDigits (String phone){
        boolean check = true;
        for(int i=0; i<phone.length(); i++){
            if(phone.charAt(i) == '0'||phone.charAt(i) == '1'||phone.charAt(i) == '2'||phone.charAt(i) == '3'||phone.charAt(i) == '4'||phone.charAt(i) == '5'||phone.charAt(i) == '6'||phone.charAt(i) == '7'||phone.charAt(i) == '8'||phone.charAt(i) == '9'){
            }
            else{
                check = false;
            }
        }
        return check;
    }

    void editNumber(String name, String phone){
        for(int i=0; i<this.name.length; i++){
            if(this.name[i].equals(name)){
                if(phone.charAt(0) == '0' && phone.length() >= 9 && phone.length() <= 10 && onlyDigits(phone)){
                    this.phone[i] = phone;
                    System.out.println(this.name[i]+" new number is "+this.phone[i]);
                }
                else{
                    System.out.println("Invalid number");
                }
            }
    }
}
}

public class ContactManager {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        String [] name = new String[n];
        String [] phone = new String[n]; 
        for(int i=0; i<n; i++){
            name[i] = scan.next();
            phone[i] = scan.nextLine();
            phone[i] = phone[i].substring(1);
        }

        ContactBook book = new ContactBook(name, phone);

        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int x = scan.nextInt();
            if(x==1){
                String str = scan.next();
                book.getContact(str);
            }
            else if(x==2){
                String str = scan.next();
                String phone1 = scan.nextLine();
                phone1 = phone1.substring(1);
                book.editNumber(str, phone1);
            }
            else if(x==3){
                book.getAllContact();
            }
            else{
                System.out.println("Invalid command");
            }
        }

        scan.close();
    }
}

