/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.asterisk;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rinat
 */
public class Phone {

    private String name;
    private List<String> statuses;

    public Phone(String newName) {
        name = newName;
        statuses = new ArrayList<>();
    }

    public boolean addStatus(String status) {
        if (!status.isEmpty()) {
            if (!statuses.contains(status)) {
                return statuses.add(status);
            }
        }
        return false;
    }

    public boolean removeStatus(String status) {
        if (statuses.contains(status)) {
            return statuses.remove(status);
        }
        return false;
    }

    public void removeStatuses() {
        statuses.clear();
    }

    public String getName() {
        return this.name;
    }
    
    public List<String> getStatuses() {
        return statuses;
    }
}
