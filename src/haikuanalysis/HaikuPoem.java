package haikuanalysis;

public class HaikuPoem {
    private String firstLine;
    private String secondLine;
    private String thirdLine;

    @Override
    public String toString() {
        return "HaikuPoem{" +
                "firstLine='" + firstLine + '\'' +
                ", secondLine='" + secondLine + '\'' +
                ", thirdLine='" + thirdLine + '\'' +
                '}';
    }

    public HaikuPoem(String firstLine, String secondLine, String thirdLine){
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }
}
