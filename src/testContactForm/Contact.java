package testContactForm;

public class Contact {


    private String givenNames;
    private String surname;
    private String mobile;
    private String email;

    public Contact(String givenNames, String surname, String mobile, String email){

        this.givenNames = givenNames;
        this.surname = surname;
        this.mobile = mobile;
        this.email = email;
    }
    public String getGivenNames(){
        return this.givenNames;
    }
}
