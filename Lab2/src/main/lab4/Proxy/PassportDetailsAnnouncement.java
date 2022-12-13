package Proxy;

public class PassportDetailsAnnouncement implements HumanPassportDetails{
    private String passportDetails;

    public PassportDetailsAnnouncement(String passportDetails){
        this.passportDetails = passportDetails;
        loadPassportDetails(passportDetails);
    }

    @Override
    public void printPassportDetails() {
        System.out.println("Display " + passportDetails);
    }

    private void loadPassportDetails(String passportDetails){
        System.out.println("Load " + passportDetails);
    }
}
