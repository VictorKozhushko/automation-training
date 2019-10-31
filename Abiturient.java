public class Abiturient {
    private int id;
    private String name;
    private String surname;
    private String patronymicname;
    private String Address;
    private long phone;
    private int mark[];

    public Abiturient(int id, String name, String surname, String patronymicname, String address, long phone, int[] mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymicname = patronymicname;
        this.Address = address;
        this.phone = phone;
        this.mark = mark;
    }

    public Abiturient(int id, String name, String surname, String patronymicname, int[] mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymicname = patronymicname;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymicname() {
        return patronymicname;
    }

    public void setPatronymicname(String patronymicname) {
        this.patronymicname = patronymicname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int[] getMark() {
        return mark;
    }

    public void setMark(int[] mark) {
        this.mark = mark;
    }

    public int getMarkValue(){int mean=0;
    int[] tmp=getMark();
    for(int i=0; i<tmp.length; i++) {
        mean+=tmp[i];
    }
    return mean;
    }

    public String toString(){
        return getName()+" "+getSurname()+" "+getMarkValue();
    }
}
