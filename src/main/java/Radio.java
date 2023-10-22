public class Radio {
    private int currentStation;
    private int soundVolume;
    private int maxRadioStation;

    public Radio(int amountStation) {
        this.maxRadioStation = amountStation - 1;
    }

    public Radio() {
        this.maxRadioStation = 9;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxRadioStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getSoundVolume() {

        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 100) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void next() {
        if (currentStation != maxRadioStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxRadioStation;
        }
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume++;
        }
    }

    public void reduceVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }
}