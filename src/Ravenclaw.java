public class Ravenclaw extends Hufflepuff{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public int getSumOfFacultyProp() {
        return getMind() + getCreation() + getWisdom() + getWit();
    }

    public Ravenclaw(String name, String surname) {
        super(name, surname);
        this.mind = rnd.nextInt(101);
        this.wisdom = rnd.nextInt(101);
        this.wit = rnd.nextInt(101);
        this.creation = rnd.nextInt(101);
        this.faculty = "Когтевран";
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nУм: " + mind +
                " Мудрость: " + wisdom +
                " Остроумие: " + wit +
                " Творчество : " + creation;
    }
}
