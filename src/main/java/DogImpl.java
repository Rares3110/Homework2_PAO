public class DogImpl implements Dog {
    private String nume = "";
    private Integer varsta;
    public DogImpl(String nume, Integer varsta)
    {
        this.nume = nume;
        this.varsta = varsta;
    }
    @Override
    public String Info() {
        return "The dog's name is " + nume + " and is " + varsta.toString() + "\n";
    }

    @Override
    public String getName() {
        return nume;
    }

    @Override
    public Integer getAge() {
        return varsta;
    }
}
