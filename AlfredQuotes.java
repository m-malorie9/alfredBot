import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        
        return String.format("Hello %s, welcome home.","Master Wayne");
    }
    
    public String dateAnnouncement() {
        
        return String.format("Currently it is %s", new Date()) ;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1) {
            return "Do you really think it wise to ask her and not me?"; 
        }
        if(conversation.indexOf("Alfred") > -1) {
            return "What ever can I help you with, sir?";
        }
        return "I'll be attending the manor if you should need anything else.";
    }
}

