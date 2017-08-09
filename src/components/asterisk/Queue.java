/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.asterisk;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author rinat
 */
public class Queue {

    private String name;
    private List<Phone> phones;
    private JPanel panel = null;

    public Queue(String newName) {
        this.name = newName;
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
            if (phone.getName().equals(phoneNumber)) {
                return phone;
            }
        }
        return (new Phone(null));
    }

    public boolean removePhone(Phone phone) {
        return this.phones.remove(phone);
    }

    public List<String> getPhoneNumbers() {
        List<String> listPhones = new ArrayList<>();
        for (Phone phone : this.phones) {
            listPhones.add(phone.getName());
        }
        return listPhones;
    }

    public String getPhoneNumbersString() {
        String result = "";
        List<String> phonesList = getPhoneNumbers();
        for (String phoneS : phonesList) {
            result += phoneS + "; ";
        }
        return result;
    }

    public List<Phone> getPhones() {
        return this.phones;
    }

    public String getName() {
        return this.name;
    }
    public JPanel getPanel() {
        return this.panel;
    }
    
    public void setPanel(JPanel newPanel) {
        this.panel = newPanel;
    }
}
