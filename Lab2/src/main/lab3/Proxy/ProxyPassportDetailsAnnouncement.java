package main.lab3.Proxy;

public class ProxyPassportDetailsAnnouncement implements HumanPassportDetails{
    private PassportDetailsAnnouncement passportDetailsAnnouncement;
    private String passportDetails;

    public ProxyPassportDetailsAnnouncement(String passportDetails){
        this.passportDetails = passportDetails;
    }

    @Override
    public void printPassportDetails() {
        if(passportDetailsAnnouncement == null){
            passportDetailsAnnouncement = new PassportDetailsAnnouncement(passportDetails);
        }
        passportDetailsAnnouncement.printPassportDetails();
    }
}
