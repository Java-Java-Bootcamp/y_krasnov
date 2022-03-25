package ru.yura.model;

public class Candidate {

    private Integer id;
    private String name;
    private Long votes;

    public Candidate(Integer id, String name, Long votes) {
        this.id = id;
        this.name = name;
        this.votes = votes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getVotes() {
        return votes;
    }

    public void setVotes(Long votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", votes='" + votes + '\'' +
                '}';
    }
}
