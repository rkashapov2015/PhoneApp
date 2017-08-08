/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.asterisk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author rinat
 */
public class Queue {

    private String name;
    private List<Phone> phones;

    public Queue(String name) {
        phones = new ArrayList<>();

    }

    public boolean addPhone(Phone phone) {
        if (!this.phones.contains(phone)) {
            return phones.add(phone);
        }
        return false;
    }

    public boolean remove(String phone_number) {
        for (Phone phone : this.phones) {
            if (phone.getName() == null ? phone_number == null : phone.getName().equals(phone_number)) {
                return phones.remove(phone);
            }
        }
        return false;
    }

    public Phone getPhone(String phoneNumber) {
        for (Phone phone : this.phones) {
            if (phone.getName() == phoneNumber) {
                return phone;
            }
        }
        return (new Phone(null));
    }

    public List<String> getPhoneNumbers() {
        List<String> listPhones = new ArrayList<>();
        for(Phone phone : this.phones) {
            listPhones.add(phone.getName());
        }
        return listPhones;
    }
    public String getPhoneNumbersString() {
        String result = "";
        List<String> phonesList = getPhoneNumbers();
        for(String phoneS : phonesList) {
            result += phoneS + "; ";
        }
        return result;
    }

}
