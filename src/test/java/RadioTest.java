import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setCurrentStation_InvalidStation_BelowLowerLimits() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation_ValidStation_LowerLimits() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation_ValidStation_OverLowerLimits() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation_ValidStation_Middle() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation_ValidStation_BelowHighLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation_ValidStation_HighLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation_InvalidStation_OverHighLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void next_LowerLimits() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void next_OverLowerLimits() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void next_Middle() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void next_BelowHighLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void next_HighLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prev_LowerLimits() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prev_OverLowerLimits() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prev_Middle() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.prev();
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prev_BelowHighLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prev_HighLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setSoundVolume_InvalidStation_BelowLowerLimits() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.setSoundVolume(-1);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setSoundVolume_ValidStation_LowerLimits() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setSoundVolume_ValidStation_OverLowerLimits() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setSoundVolume_ValidStation_Middle() {
        Radio radio = new Radio();
        radio.setSoundVolume(51);
        int expected = 51;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setSoundVolume_ValidStation_BelowHighLimit() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setSoundVolume_ValidStation_HighLimit() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setSoundVolume_InvalidStation_OverHighLimit() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.setSoundVolume(101);
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume_LowerLimits() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume_OverLowerLimits() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume_Middle() {
        Radio radio = new Radio();
        radio.setSoundVolume(51);
        radio.increaseVolume();
        int expected = 52;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume_BelowHighLimit() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume_HighLimit() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduceVolume_LowerLimits() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduceVolume_OverLowerLimits() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduceVolume_Middle() {
        Radio radio = new Radio();
        radio.setSoundVolume(51);
        radio.reduceVolume();
        int expected = 50;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduceVolume_BelowHighLimit() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);
        radio.reduceVolume();
        int expected = 98;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduceVolume_HighLimit() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.reduceVolume();
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
