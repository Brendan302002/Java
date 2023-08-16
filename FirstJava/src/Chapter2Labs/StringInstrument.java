package Chapter2Labs;

// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
    // TODO: Declare private fields
    private int numStrings;
    private int numFrets;
    private boolean bowed;
 
    
    /** 
     * @param strings
     */
    // TODO: Define mutator methods - 
    //       setNumOfStrings(), setNumOfFrets(), setIsBowed()
    public void setNumOfStrings(int strings) {
        numStrings = strings;
    }

    public void setNumOfFrets(int frets) {
       numFrets = frets;
    }

    public void setIsBowed(boolean value) {
        bowed = value;
    }
 
    // TODO: Define accessor methods - 
    //       getNumOfStrings(), getNumOfFrets(), getIsBowed()
    public int getNumOfStrings() {
        return numStrings;
    }

    public int getNumOfFrets() {
        return numFrets;
    }

    public boolean getIsBowed() {
        return bowed;
    }
 
 }
 
