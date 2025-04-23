class Mail {
    
	private String sender;
    private String subject;
    private String message;
    private String datetime;
    private boolean read;

    public Mail(String sender, String subject, String message, String datetime) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
        this.read = false;
    }
    
    public void markAsRead() {
        this.read = true;
    }

    public boolean isRead() {
        return read;
    }

    public void print() {
        System.out.println(subject + " from " + sender + " on " + datetime + ": " + message);
    }

    public String getHeader() {
        return (read ? "✓" : "✗") + " | " + subject + " | " + sender + " | " + datetime;
    }
}

