public class Reformatory {

    private int weightings = 0;
    public int weight(Person person) {
        // return the weight of the person
        this.weightings += 1;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int currentWeight = weight(person);
        person.setWeight(currentWeight + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.weightings;
    }

}
