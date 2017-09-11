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

    
    public static int STATUS_UNKNOWN = 4;
    public static int STATUS_READY = 3;
    public static int STATUS_BUSY = 2;
    public static int STATUS_PAUSED = 1;
    public static int STATUS_DISABLED = 0;
    private String name;
    private List<String> statuses;
    //3 = Unknown, 2 = Ready, 1
    private int statusValue;

    public Phone(String newName) {
        this.name = newName;
        this.statuses = new ArrayList<>();
    }

    public boolean addStatus(String status) {
        if (!status.isEmpty()) {
            if (!statuses.contains(status)) {
                if (statuses.add(status)) {
                    changeStatus();
                    return true;
                }

            }
        }
        return false;
    }

    public boolean removeStatus(String status) {
        if (statuses.contains(status)) {
            statuses.remove(status);
            changeStatus();
        }
        return false;
    }

    public void removeStatuses() {
        this.statuses.clear();
        this.statusValue = STATUS_UNKNOWN;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getStatuses() {
        return this.statuses;
    }

    private void changeStatus() {
        String[] readyStatus = {"Not in use"};
        String[] busyStatus = {"In use", "Busy", "Ringing"};
        String[] pausedStatus = {"paused"};
        String[] disableStatus = {"Unavailable", "Invalid"};
        this.statusValue = STATUS_UNKNOWN;
        for (String strStatus : statuses) {
            this.statusValue = checkingByArrayStatus(strStatus, readyStatus, STATUS_READY, statusValue);
            this.statusValue = checkingByArrayStatus(strStatus, busyStatus, STATUS_BUSY, statusValue);
            this.statusValue = checkingByArrayStatus(strStatus, disableStatus, STATUS_DISABLED, statusValue);
            this.statusValue = checkingByArrayStatus(strStatus, pausedStatus, STATUS_PAUSED, statusValue);
        }
    }

    private int checkingByArrayStatus(String strStatus, String[] strStatuses, int statusValue, int currentStatusValue) {
        if (java.util.Arrays.asList(strStatuses).indexOf(strStatus) != -1) {
            if (currentStatusValue > statusValue) {
                currentStatusValue = statusValue;
            }
        }
        return currentStatusValue;
    }

    public int getStatus() {
        changeStatus();
        return this.statusValue;
    }
}
