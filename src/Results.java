public class Results {
    private  String functionName;
    private long duration;
    private String sample;
    
    
    public Results() {
    }


    public Results(String functionName, long duration, String sample) {
        this.functionName = functionName;
        this.duration = duration;
        this.sample = sample;
    }


    public String getFunctionName() {
        return functionName;
    }


    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }


    public long getDuration() {
        return duration;
    }


    public void setDuration(long duration) {
        this.duration = duration;
    }


    public String getSample() {
        return sample;
    }


    public void setSample(String sample) {
        this.sample = sample;
    }


    @Override
    public String toString() {
        return "Results [functionName=" + functionName + ", duration=" + duration + ", sample=" + sample + "]";
    }


    
    
}
