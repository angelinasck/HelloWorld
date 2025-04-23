import java.util.ArrayList;

class Inbox {
    private ArrayList<Mail> mails = new ArrayList<>();

    public void addMail(Mail mail) {
        mails.add(mail);
    }
    public void printHeaders() {
        for (int i = 0; i < mails.size(); i++) {
            System.out.println(i + ": " + mails.get(i).getHeader());
        }
    }

    public void open(int index) {
        if (index < 0 || index >= mails.size()) {
            System.out.println("Invalid index!");
            return;
        }
        Mail mail = mails.get(index);
        mail.markAsRead();
        mail.print();
    }

    public int countUnread() {
        int count = 0;
        for (Mail mail : mails) {
            if (!mail.isRead()) {
                count++;
            }
        }
        return count;
    }
}