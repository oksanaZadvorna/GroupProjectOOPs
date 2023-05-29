package GroupProjectOOPs;
/*
9. Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.
 */
public class Registration {
   private String email;
   private String username;
   private String password;

   void setUserEmail(String email){
       this.email=email;
       if(email.endsWith("yahoo.com")){
           System.out.println("Email is created");
       }else{
           System.out.println("Invalid email");
       }

   }
   void setUsername(String username){
       this.username=username;
       if(username.isEmpty()){
           System.out.println("Please enter credentials");
       } else if (username.length()>6 ) {
           System.out.println("Username is created");
       }
   }
   void setPassword(String password){
       this.password=password;
       if(password.length()>6 || !password.isEmpty() || !password.contains(username)){
           System.out.println("Password is created");
       }
   }
}
class RegistrationTester {
    public static void main(String[] args) {
        Registration registration=new Registration();
        registration.setUserEmail("paramiter@yahoo.com");
        registration.setUsername("testerop");
        registration.setPassword("12345678");

    }
}
