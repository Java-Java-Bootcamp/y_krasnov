public class Worker {

    private String name;
    private String surname;
    private Enum sex;
    private Integer age;
    private String profession;
    private String workTown;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Enum getSex() {
        return sex;
    }

    public void setSex(Enum sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWorkTown() {
        return workTown;
    }

    public void setWorkTown(String workTown) {
        this.workTown = workTown;
    }

    public Worker() {

    }

    public Worker(String name, String surname, Enum sex, Integer age, String profession, String workTown) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.profession = profession;
        this.workTown = workTown;
    }


}

