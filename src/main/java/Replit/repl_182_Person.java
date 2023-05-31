package Replit;

class repl_182_Person {
    private String firstname, lastname, ssn;
    int birthday, birthmonth, birthyear;

    String getFirstname(String firstname) {
        return firstname;
    }

    String getLastname(String lastname) {
        return lastname;
    }

    String getSsn(String ssn) {
        return ssn;
    }

    int getBirthday(int birthday) {
        return birthday;
    }

    int getBirthmonth(int birthmonth) {
        return birthmonth;
    }

    int getBirthyear(int birthyear) {
        return birthyear;
    }

    public String formatBirthday(int birthday, int birthmonth, int birthyear) {
        return birthmonth + "/" + birthday + "/" + birthyear;
    }
}