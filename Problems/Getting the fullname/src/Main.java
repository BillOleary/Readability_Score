class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        String name = this.firstName.equals(this.lastName) ? "Unknown" :
                this.firstName.matches("") ? lastName :
                        this.lastName.matches("") ? firstName :
                                firstName + " " + lastName;
        return name; // write your code here
    }

}
