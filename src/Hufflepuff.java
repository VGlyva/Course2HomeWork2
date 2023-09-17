public class Hufflepuff extends Hogwarts{
    private int hardWork;
    private int loyalty;
    private int honesty;
    public int getSumOfFacultyProp() {
        return getHardWork() + getHonesty() + getLoyalty();
    }

    public Hufflepuff(String name, String surname) {
        super(name,surname);
        this.hardWork = rnd.nextInt(101);
        this.loyalty = rnd.nextInt(101);
        this.honesty = rnd.nextInt(101);
        this.faculty = "Пуффендуй";
    }
    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nТрудолюбие: " + hardWork +
                " Преданость: " + loyalty +
                " Честность: " + honesty;
    }
}
