package BTVN;

public abstract class Phone implements Comparable<PhoneBook>{
    private String name;
    private String phone;
    public Phone(){}
    public Phone(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    abstract void insertPhone(String name, String phone);

    abstract void removePhone(String name);

    abstract void updatePhone(String name, String newphone);

    abstract void searchPhone(String name);

    abstract void sort();

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
