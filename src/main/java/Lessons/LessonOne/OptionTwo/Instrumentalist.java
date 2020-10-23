package Lessons.LessonOne.OptionTwo;


public class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    @Override
    public void perform() {
        System.out.println("Playing " + this.song + ": ");
        this.instrument.play();
    }
}
