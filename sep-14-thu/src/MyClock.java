import java.text.DecimalFormat;

public class MyClock {
    private int hours;
    private int minutes;
    private int seconds;

    private boolean timeFormat24;

    public MyClock(int hours, int minutes, int seconds) {
        set(hours, minutes, seconds);
        this.timeFormat24 = true;
    }

    public MyClock(int totalTimeInSeconds) {
        var hours = totalTimeInSeconds / 3600;
        totalTimeInSeconds -= hours * 3600;
        var minutes = totalTimeInSeconds / 60;
        totalTimeInSeconds -= minutes * 60;
        var seconds = totalTimeInSeconds;
        this.timeFormat24 = true;
        set(hours, minutes, seconds);
    }

    public void set(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Hours must be between 0 and 23");
        }
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Minutes must be between 0 and 59");
        }
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Seconds must be between 0 and 59");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void tic() {
        this.seconds++;
        if (this.seconds == 60) {
            this.seconds = 0;
            this.minutes++;
            if (this.minutes == 60) {
                this.minutes = 0;
                this.hours++;
                if (this.hours == 24) {
                    this.hours = 0;
                }
            }
        }
    }

    public boolean isBefore(MyClock time) {
        if (this.hours < time.getHours()) {
            return true;
        } else if (this.hours == time.getHours()) {
            if (this.minutes < time.getMinutes()) {
                return true;
            } else if (this.minutes == time.getMinutes()) {
                if (this.seconds < time.getSeconds()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int timeInSecondsTo(MyClock time) {
        var hoursInSeconds = (time.getHours() - this.hours) * 3600;
        var minutesInSeconds = (time.getMinutes() - this.minutes) * 60;
        var secondsInSeconds = time.getSeconds() - this.seconds;
        return hoursInSeconds + minutesInSeconds + secondsInSeconds;
    }

    public MyClock timeTo(MyClock time) {
        var timeInSeconds = this.timeInSecondsTo(time);
        return new MyClock(timeInSeconds);
    }

    public void setTimeFormat(int timeFormat) {
        if (timeFormat != 12 && timeFormat != 24) {
            throw new IllegalArgumentException("Time format must be either 12 or 24");
        }
        this.timeFormat24 = timeFormat == 24;
    }

    public boolean isTimeFormat24() {
        return this.timeFormat24;
    }


    public String toString() {
        var decimalFormat = new DecimalFormat("00");
        if (this.timeFormat24) {
            return decimalFormat.format(this.hours) + ":" + decimalFormat.format(this.minutes) + ":" + decimalFormat.format(this.seconds);
        }
        var hours = this.hours;
        var amOrPm = "AM";
        if (hours > 12) {
            hours -= 12;
            amOrPm = "PM";
        } else if (hours == 12) {
            amOrPm = "PM";
        } else if (hours == 0) {
            hours = 12;
        }
        return decimalFormat.format(hours) + ":" + decimalFormat.format(this.minutes) + ":" + decimalFormat.format(this.seconds) + " " + amOrPm;

    }
}
