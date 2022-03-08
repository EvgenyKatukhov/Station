package ru.netology;

public class Radio {
    int maxVolume = 10;
    int minVolume = 0;
    int maxStation = 9;
    int minStation = 0;
    int CurrentVolume;
    int CurrentStaion;

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    void setCurrentVolume(int CurrentVolume) {
        ;
        if (CurrentVolume > maxVolume) {
            return;
        }
        if (CurrentVolume < minVolume) {
            return;
        }
        this.CurrentVolume = CurrentVolume;

    }

    public void increaseVolume() {
        if (CurrentVolume < 10) {
            CurrentVolume = CurrentVolume + 1;
        }
        if (CurrentVolume > 10) {
            CurrentVolume = minVolume;
        }
    }

    public void increaseStation(int i) {
        if (CurrentStaion < 9) {
            CurrentStaion = CurrentStaion +1;
        }
                return;
           }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation > maxStation) {
            return;
        }
        if (CurrentStation < minStation) {
            return;
        }
        this.CurrentVolume = CurrentStation;
    }
}

