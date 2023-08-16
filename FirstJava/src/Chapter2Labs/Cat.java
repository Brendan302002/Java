package Chapter2Labs;

public class Cat extends Pet {
    private String breed;
 
    
    /** 
     * @param userBreed
     */
    public void setBreed(String userBreed) {
       breed = userBreed;
    }
 
    public String getBreed() {
       return breed;
    }
 }
