public class DogAdapterImpl implements DogAdapter {
    private Dog dog;
    public DogAdapterImpl(Dog dog)
    {
        this.dog = dog;
    }
    @Override
    public String Info() {
        return "Numele catelului este " + dog.getName() + " si are " + dog.getAge().toString() + " ani\n";
    }
}
