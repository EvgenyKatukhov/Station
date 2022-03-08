package ru.netology;

public class RadioAdvanced {
     int maxVolume;
    private int minVolume;
    private int maxStation;
    private int minStation;
    int CurrentVolume;
    private int CurrentStaion;


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

    private void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume > maxVolume) {
            return;
        }
        if (CurrentVolume < minVolume) {
            return;
        }
        this.CurrentVolume = CurrentVolume;

    }

    public void setCurrentStation() {
        if (CurrentStaion > maxStation) {
            return ;
        }
        if (CurrentStaion < minStation) {
            return ;
        }
        this.CurrentStaion = CurrentStaion;

        return ;
    }

    public void increaseVolume() {
        if (CurrentVolume < 10) {
            CurrentVolume = CurrentVolume + 1;
        }
        if (CurrentVolume > 10) {
            CurrentVolume = minVolume;
        }
    }

    public void increaseStation() {
        if (CurrentStaion < 9) {
            CurrentStaion = CurrentStaion + 1;
        }
return;


    }
}
