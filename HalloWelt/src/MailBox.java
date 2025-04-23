
public class MailBox {
	
	public static void main(String[] args) {
        Inbox inbox = new Inbox();

        inbox.addMail(new Mail("alice@example.com", "Project", "The project is done!", "2025-04-22 09:00"));
        inbox.addMail(new Mail("bob@example.com", "Meeting", "Let's meet at 2pm.", "2025-04-22 10:15"));
        inbox.addMail(new Mail("tutor@example.com", "Feedback", "Your homework looks good.", "2025-04-23 08:00"));

        inbox.printHeaders();

        System.out.println("\nUnread mails: " + inbox.countUnread());

        System.out.println("\nOpening mail 1:");
        inbox.open(1);

        System.out.println("\nUnread mails after opening: " + inbox.countUnread());

        System.out.println("\nTry to open invalid index:");
        inbox.open(5); // Test Guard
    }
}
