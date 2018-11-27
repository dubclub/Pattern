public interface BeatModelInterface {

    void initialize () ;
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();
    void registerObserver (BeatObserver о);
    void removeObserver(BeatObserver о);
    void registerObserver(BPMObserver о);
    void removeObserver(BPMObserver o);

}
