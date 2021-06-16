package BTVN;

import java.util.Arrays;

public class PhoneBook extends Phone {
    Phone[] phonelist = new Phone[0];

    public PhoneBook(String name, String phone) {
        super(name, phone);
    }

    public PhoneBook() {
    }


    @Override
    void insertPhone(String name, String phone) {
        for (Phone p : phonelist) {
            if (p.getName().equals(name)) {
                if (!p.getPhone().equals(phone)) {
                    p.setPhone(p.getPhone() + " : " + phone);
                    return;
                }
                return;
            }
        }
        add(new PhoneBook(name, phone));
    }

    // Thêm 1 phần tử vào mảng.
    void add(Phone phone) {
        // tạo mới 1 mảng có độ dài lớn hơn mảng cũ 1 phần tử
        Phone[] phones = new Phone[phonelist.length + 1];
        for (int i = 0; i < phonelist.length; i++) {
            phones[i] = phonelist[i];
        }
        phones[phones.length - 1] = phone;
        phonelist = phones;

    }


    @Override
    void removePhone(String name) {
        int index = -1;
        for (int i = 0; i < phonelist.length; i++) {
            if (phonelist[i].getName().equals(name)) {
                index = i;
            }
        }
        if (index > 0) {
            phonelist[index] = new PhoneBook("0", "0");
        }

    }

    @Override
    void updatePhone(String name, String newphone) {
        for (Phone p : phonelist) {
            if (p.getName().equals(name)) {
                p.setPhone(newphone);
                return;
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for (Phone p : phonelist) {
            if (p.getName().equals(name)) {
                System.out.println("số điện thoại cần tìm là : " + p.getPhone());
                return;
            }
        }
    }

    @Override
    void sort() {
        Arrays.sort(phonelist);
    }

    @Override
    public int compareTo(PhoneBook o) {
        return super.getName().compareTo(o.getName());
    }
}
