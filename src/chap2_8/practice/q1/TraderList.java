package chap2_8.practice.q1;

import java.util.Objects;

public class TraderList {
    private String name;

    public TraderList() {
    }
    public TraderList(Trader name){
        this.name  = name.getName();
    }
    public TraderList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TraderList{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TraderList that = (TraderList) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
