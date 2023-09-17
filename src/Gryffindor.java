public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;
    public int getSumOfFacultyProp() {
        return getBravery() + getHonor() + getNobility();
    }

    public Gryffindor(String name, String surname) {
        super(name,surname);
        this.nobility = rnd.nextInt(101);
        this.honor = rnd.nextInt(101);
        this.bravery = rnd.nextInt(101);
        this.faculty = "Гриффиндор";
    }
    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nБлагородство: " + nobility +
                " Честь: " + honor +
                " Храбрость: " + bravery;
    }
}
